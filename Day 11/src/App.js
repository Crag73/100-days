import Navbar from "./components/Navbar";
import AddTodo from "./components/AddTodo";
import Todo from "./components/Todo";

function App() {
  return (
    <div className="App bg-blue-100 pb-32">
      <Navbar />
      <AddTodo />
      <Todo />
    </div>
  );
}

export default App;
