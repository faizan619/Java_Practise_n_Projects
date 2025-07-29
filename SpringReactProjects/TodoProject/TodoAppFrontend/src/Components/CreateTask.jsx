import { useEffect, useState } from "react";
import axios from "axios";

function CreateTask() {
  const [task, setTask] = useState(null);
  const [priority, setPriority] = useState(false);

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!task.trim()) {
      alert("Task cannot be empty.");
      return;
    }

    axios
      .post("http://localhost:8080/tasks", {
        task: task,
        priority: priority,
        isCompleted: "not Completed",
      })
      .then((res) => {
        console.log("Data Added Successfully! ", res);
        setTask("");
        setPriority(false);
		alert("Task Added Successfully!")
      })
      .catch((err) => {
        console.log(err.message);
      });
  };

  return (
    <>
      <div>
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
          <button type="submit">Save</button>
        </form>
      </div>
    </>
  );
}

export default CreateTask;
