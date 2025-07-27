import { useState, useEffect } from 'react'
import axios from 'axios'
import Faizan from "./Faizan";
import Job from './Job';
import { Route, Routes } from 'react-router-dom';

function App() {
  const [count, setCount] = useState(0);
  // const [data, setData] = useState(null); // For fetched data
  const [data, setData] = useState([]); // For fetched data

  function handleIncrement() {
    setCount((count) => count + 1);
  }

  useEffect(() => {
    // Replace with your actual API endpoint
    axios.get('https://jsonplaceholder.typicode.com/posts')
      .then(response => {
        console.log(response.data);
        setData(response.data);
      })
      .catch(error => {
        console.error('Error fetching data:', error);
      });
  }, []); // Empty dependency array runs this only once on mount

  return (
    <>
      <Routes>
        <Route path="/faizan" element={<Faizan/>} />
        <Route path='/' element={<Job/>} />
        <Route path='*' element="Error" />
      </Routes>
      <button onClick={handleIncrement}>Increment {count}</button>

      {/* {data && (
        <div>
          <h2>{data.title}</h2>
          <p>{data.body}</p>
          <p>{data.id}</p>
        </div>
      )} */}

        {data.map((pp,index) => (
          // <p key={pp.id}>
          <p key={index}>
            <span>{pp.id}</span> &nbsp;&nbsp;
            <span>{pp.title}</span>
          </p>
        ))}
      <Faizan />
      <Job/>
    </>
  );
}

export default App;

// axios.post('https://example.com/api', {
//   name: 'Faizan',
//   count: count
// })
// .then(response => console.log(response.data))
// .catch(error => console.error(error));


// axios.put('https://jsonplaceholder.typicode.com/posts/1', {
//   id: 1,
//   title: 'Updated Title',
//   body: 'Updated Body',
//   userId: 1
// })
// .then(response => console.log('PUT Response:', response.data))
// .catch(error => console.error('PUT Error:', error));


// axios.delete('https://jsonplaceholder.typicode.com/posts/1')
//   .then(response => console.log('DELETE Response:', response.data))
//   .catch(error => console.error('DELETE Error:', error));
