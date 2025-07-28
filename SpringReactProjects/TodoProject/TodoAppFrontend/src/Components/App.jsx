import { BrowserRouter,Routes,Route } from 'react-router-dom'
import Home from "./Home"
import Tasks from "./Tasks"
import CreateTask from "./CreateTask"
import Header from "./Header"
import PageNotFound from "./PageNotFound"

function App() {
  return (
    <>
    <BrowserRouter>
    	<Header/>
    	<Routes>
    		<Route path="/" element={<Home/>}  />
    		<Route path="/tasks" element={<Tasks/>} />
    		<Route path="/tasks/create" element={<CreateTask/>} />
    		<Route path="*" element={<PageNotFound/>} />
    	</Routes>
    </BrowserRouter>
    </>
  )
}

export default App
