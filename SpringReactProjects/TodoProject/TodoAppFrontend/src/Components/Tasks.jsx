import {useState,useEffect} from "react";
import axios from "axios"
import { NavLink, useNavigate } from "react-router-dom";

function Tasks(){

	const [data,setData] = useState([]);
	const navigate = useNavigate();
	const [currentPage, setCurrentPage] = useState(0);
	const [totalPages, setTotalPages] = useState(1);  // default to 1 to avoid early disabling


	useEffect(()=>{
		axios.get("http://localhost:8080/tasks",{
			params:{
				page:0,
				size:5
			}
		})
		.then((res)=>{
			console.log(res.data)
			setData(res.data.content)
		})
		.catch((err)=>{
			console.log(err.message)
		})
	},[]);

	const handleDelete = (id) =>{
		// alert(id);
		console.log('Deleting Id : ',id);
		axios.delete(`http://localhost:8080/tasks/${id}`)
		.then((res)=>{
			console.log("Task Deleted : ",res);
			// navigate("/tasks");
			loadPage(currentPage);  // reload current page

		})
		.catch((err)=>{
			console.log("Error :",err);
		})
	}

	useEffect(() => {
		loadPage(0);  // this sets both data and pagination state
	}, []);


	const loadPage = (page) => {
		axios.get("http://localhost:8080/tasks", {
			params: {
				page: page,
				size: 3
			}
		})
		.then(res => {
			setData(res.data.content);
			setCurrentPage(res.data.number);
			setTotalPages(res.data.totalPages);
		})
		.catch(err => {
			console.error(err.message);
		});
	};


	return <>
		<div>
		<button onClick={() => loadPage(currentPage - 1)} disabled={currentPage === 0}>Previous</button>
		<button onClick={() => loadPage(currentPage + 1)} disabled={currentPage === totalPages - 1}>Next</button>

			{
				data.map((dd,index) => (
					<div className="card mt-2 mx-2 p-2 col-md-4 mx-auto my-4" key={index}>
						<div className={`card-header text-light text-capitalize ${dd.priority? 'bg-success':'bg-danger'}`}>
							{dd.task}
						</div>
						<div className="card-body">
							<button className="btn btn-sm btn-danger" onClick={() => handleDelete(dd.id)}>Delete</button>
							<NavLink className="btn btn-sm btn-warning mx-3" to={`/tasks/edit/${dd.id}`}>Update</NavLink>
						</div>
					</div>
				))
			}
		</div>
	</>;
}

export default Tasks;