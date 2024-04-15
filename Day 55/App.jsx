import {useEffect, useState } from 'react'
import './App.css'
import axios from 'axios'

function App() {
  const [id,setId]=useState("1");
  return (
    <>
    <button onClick={()=>setId("1")}>Task 1</button>
    <button onClick={()=>setId("2")}>Task 2</button>
    <button onClick={()=>setId("3")}>Task 3</button>
    <Todo id={id}/>
    </>
  )
}

function Todo({id}){
  const [todo,setTodo] =useState("");
  useEffect(()=>{
    async function fetchTodo(){
      let response=await axios.get(`https://jsonplaceholder.typicode.com/todos/${id}`)
      console.log(response.data)
      setTodo(response.data);
    }
    fetchTodo();
  },[id])
  return(
    <h1>{todo.title}</h1>
  )
}

export default App
