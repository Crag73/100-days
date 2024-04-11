import { useEffect, useState } from 'react'
import './App.css'
import axios from 'axios'

function App() {
  const [email,setEmail] = useState('')
  const [password,setPassword] = useState('')
  console.log(email,password);
  async function login(e){
    e.preventDefault();
    let response=await axios.post('http://localhost:3000/login',{
      email: email,
      password: password
    })
    console.log(response)
  }
  return (
    <>
      <form onSubmit={login} action=''>
        <input onChange={(e)=>setEmail(e.target.value)} type="text" placeholder='enter email'></input>
        <input onChange={(e)=>setPassword(e.target.value)} type="text" placeholder='enter password'></input>
        <button action=''>Login</button>
      </form>
    </>
  )
}

export default App
