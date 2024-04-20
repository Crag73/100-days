import Dashboard from "./component/Dashboard";
import Home from "./component/Home";
import User from "./component/User";
import NewUser from "./component/NewUser";
import Profile from "./component/Profile";
import ListUser from "./component/ListUser";
import { Routes, Route, useNavigate, Link, Form } from "react-router-dom";
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
          <li>
            <Link to="/userlist">UserList</Link>
          </li>
        </ul>
      </nav>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/Dashboard" element={<Dashboard />} />
        <Route path="/:id" element={<User />} />
        <Route path="/newuser" element={<NewUser />} />
        <Route path="/userlist">
          <Route index element={<ListUser />} />
          <Route path=":id" element={<Profile />} />
        </Route>
        <Route path="*" element={<h1>Error:404 Page Not Found</h1>} />
      </Routes>
    </>
  );
}

export default App;
