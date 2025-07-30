import {useState,useEffect} from "react";
import axios from "axios"
import { NavLink, useNavigate } from "react-router-dom";

function Tasks(){

	const [data,setData] = useState([]);
	const navigate = useNavigate();

	useEffect(()=>{
		axios.get("http://localhost:8080/tasks")
		.then((res)=>{
			console.log(res.data)
			setData(res.data)
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
			navigate("/tasks");
		})
		.catch((err)=>{
			console.log("Error :",err);
		})
	}

	return <>
		<div>
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