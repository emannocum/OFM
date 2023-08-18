import { BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import Homepage from './pages/Homepage'
import ManageFiles from './pages/ManageFiles'

export default function App() : JSX.Element {


  return (
    <>
      <Router>
        <Routes>
        <Route path = "/" element = { <Homepage />} />
        <Route path ="/managefiles" element = {<ManageFiles />} />
        </Routes>
      </Router>
    </>
  )
}

