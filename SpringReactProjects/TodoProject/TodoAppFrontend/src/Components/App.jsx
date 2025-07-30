import { BrowserRouter,Routes,Route } from 'react-router-dom'
import Home from "./Home"
import Tasks from "./Tasks"
import CreateTask from "./CreateTask"
import Header from "./Header"
import PageNotFound from "./PageNotFound"
import EditTask from './EditTask'

function App() {
  return (
    <>
    <BrowserRouter>
    	<Header/>
    	<Routes>
    		<Route path="/" element={<Home/>}  />
    		<Route path="/tasks" element={<Tasks/>} />
    		<Route path="/tasks/create" element={<CreateTask/>} />
			<Route path='/tasks/edit/:id' element={<EditTask />} />
    		<Route path="*" element={<PageNotFound/>} />
    	</Routes>
    </BrowserRouter>
    </>
  )
}

export default App
