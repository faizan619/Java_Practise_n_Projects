import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.min.js';
import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './Components/App.jsx'
import './assets/Styling/index.css'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <App />
  </StrictMode>,
)
