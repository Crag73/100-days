import { useState } from 'react'
import './App.css'

function App() {
  return (
    <>
    <Namewithbutton/>
    <Name name="abc"/>
    <Name name="abc"/>
    <Name name="abc"/>
    <Name name="abc"/>
    </>
  )
}

function Namewithbutton(){
  const [name,setName] =useState(0);
  function changeName(){
    let value=Math.random();
    setName(value);
  }
  return(
    <>
      <button onClick={changeName}>Change Name</button>
      <Name name={name}/>
    </>
  )
}

function Name({name}){
  return(
    <>
    <h1>My name is {name}</h1>
    </>
  )
}

export default App
