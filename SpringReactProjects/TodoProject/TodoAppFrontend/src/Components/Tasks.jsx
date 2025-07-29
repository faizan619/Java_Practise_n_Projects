import {useState,useEffect} from "react";
import axios from "axios"

function Tasks(){

	const [data,setData] = useState([]);

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

	return <>
		<div>
			{
				data.map((dd,index) => (
					<div>
						<li key={index}>{dd.task}</li>
						<li>{dd.priority? "Important":"not Important"}</li>
						<br /><br />
					</div>
				))
			}
		</div>
	</>;
}

export default Tasks;