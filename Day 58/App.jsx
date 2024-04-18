import Dashboard from "./component/Dashboard";
import Home from "./component/Home";
import User from "./component/User";
import { Routes, Route, useNavigate, Link } from "react-router-dom";
function App() {
  // const navigate = useNavigate();
  return (
    <>
      {/* <div>
        <button
          onClick={() => {
            // window.location.href = "/";
            navigate("/");
          }}
        >
          Home
        </button>
        <button
          onClick={() => {
            // window.location.href = "/Dashboard";
            navigate("/Dashboard");
          }}
        >
          Dashboard
        </button>
      </div> */}
      <nav>
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/Dashboard">Dashboard</Link>
          </li>
        </ul>
      </nav>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/Dashboard" element={<Dashboard />} />
        <Route path="/:id" element={<User />} />
      </Routes>
    </>
  );
}

export default App;
