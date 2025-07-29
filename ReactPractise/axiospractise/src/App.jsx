import {useState, useEffect} from "react"
import axios from "axios"
function App() {

  // const [data,setData] = useState([]);
  const [post,setPost] = useState([]);

  // Axios Get method
  // const getData = ()=>{
  //   axios.get("https://jsonplaceholder.typicode.com/users")
  //   .then((res)=>{
  //     console.log(res)
  //     setData(res.data)
  //   })
  //   .catch((err)=>{
  //     console.log(err.message)
  //   })
  // }

  useEffect(()=>{
    axios.get("https://jsonplaceholder.typicode.com/posts")
    .then((res)=>{
      // console.log("Posts : ",res)
      // console.log("Posts - status : ",res.status)
      // console.log("Posts - statusText : ",res.statusText)
      // console.log("Posts - headers : ",res.headers)
      // console.log("Posts - data : ",res.data)
      // console.log("Posts - config : ",res.config)
      setPost(res.data)
    })
    .catch((err)=>{
      console.log("Post Error : ",err.message)
    })
    .finally(()=>{
      console.log("Finally Get Data")
    });
  },[])

  const deleteData = (id) =>{
    console.log("Id : ",id)
    axios.delete(`https://jsonplaceholder.typicode.com/posts/${id}`)
    .then((res)=>{console.log(res.data)})
    .catch((err)=>{
      console.log(err.message)
    })
  }

  const putData = (id) =>{
    console.log("Put : ",id);
    axios.put(`https://jsonplaceholder.typicode.com/posts/${id}`,{
      title:"testing title",
      body:"testing body"
    })
    .then((res) => {
      console.log("Post : ",res.data)
    })
    .catch((err)=>{
      console.log("Post Error : ",err.message)
    })
  }

  const handlePost = (id)=>{
    console.log("Post : ",id)
    axios.post("https://jsonplaceholder.typicode.com/posts",{
      title:"posting title",
      body:"posting body"
    })
    .then((res)=>{
      console.log("posting res : ",res)
      console.log("posting res status : ",res.status)
    })
    .catch((err)=>{
      console.log(err.message)
    })
  }


  return (
    <>
      <h4>Axios Get Method</h4>
      {/*<button onClick={getData}>Get Data</button>*/}
     {/* {data.map((dd,index)=>(
        <p key={index}>{dd.name}</p>
      ))}
*/}
      {post.map((pp,index)=>(
       <div key={index}> <p>{pp.title}</p> <button onClick={()=>handlePost(pp.id)}>Post</button> <button onClick={()=>deleteData(pp.id)}>Delete</button> <button onClick={()=>putData(pp.id)}>Put</button> </div>
      ))}



    </>
  )
}

export default App
