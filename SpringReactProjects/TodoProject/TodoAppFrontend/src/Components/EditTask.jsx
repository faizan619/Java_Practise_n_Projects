import { useParams } from "react-router-dom";
import axios from "axios";
import { useEffect, useState } from "react";

function EditTask(){
    const { id } = useParams(); // get the dynamic id from the URL

    const [task,setTask] = useState(null);
    const [priority,setPriority] = useState(false);
    const [isCompleted,setIsCompleted] = useState(null);

    useEffect(()=>{
        axios.get(`http://localhost:8080/tasks/${id}`)
        .then((res)=>{
            let task = res.data;
            setTask(task.task);
            setIsCompleted(task.isCompleted);
            setPriority(task.priority);
            console.log(task);
        })
        .catch((err)=>{
            console.log("Error : ",err.message);
        })
    },[id]);

    const handleSubmit = (e) =>{
        e.preventDefault();
        console.log("handle Submit : ",id)
        axios.put(`http://localhost:8080/tasks/${id}`,{
            task:task,
            priority:priority,
            isCompleted:isCompleted
        })
        .then((res)=>{
            console.log("Data Updated : ",res);
        })
        .catch((err)=>{
            console.log("Error : ",err)
        })
    }


    return <>
        <form method="post" onSubmit={handleSubmit}>
          <label htmlFor="task">Task:</label>
          <input
            type="text"
            name="task"
            id="task"
            value={task}
            onChange={(e) => setTask(e.target.value)}
            placeholder="Enter Task Here"
          />
          <label htmlFor="priority">Is Important?</label>
          <input
            type="checkbox"
            name="priority"
            id="priority"
            checked={priority}
            onChange={(e) => setPriority(e.target.checked)}
          />
          <label htmlFor="isCompleted">is Completed</label>
          <input type="text" name="isCompleted" id="isCompleted" value={isCompleted} onChange={(e) => setIsCompleted(e.target.value)} />
          <button type="submit">Save</button>
        </form>
    </>;
}

export default EditTask;