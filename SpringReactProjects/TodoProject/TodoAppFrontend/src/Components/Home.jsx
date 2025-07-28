import React from 'react'
function Home(){
	return <>
		<div className="bg-danger">
			<div className="row homeHeight">
				<div className="col-md-10 text-center mx-auto">
					<div className="d-flex flex-column justify-content-center align-items-center homeHeight text-light">
						<h1>Todo Application Using React and Spring Boot</h1>
						<a href="/tasks" className="btn btn-danger">Visit Todo List</a>
					</div>
				</div>
			</div>
		</div>
	</>
}

export default Home;