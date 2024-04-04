import { useEffect, useState } from 'react'
import './App.css'

function App() {
  const [posts,setPosts] = useState(null);
  useEffect(() =>{                    //Cant be async
    async function fetchData(){
      let response=await fetch("https://jsonplaceholder.typicode.com/posts");
      let data=await response.json();
      console.log(data);
      setPosts(data);
    }
    fetchData();

  },[])                     // No dependency -> runs every time RENDERS, [] -> runs only for first time [a,b,c] every time the dependent state variable changes
  return (
    <>
      <h1>Use Effect</h1>
      <div className="container">
        {posts && posts.map((post)=>{
          return(
            <Onepost title={post.title}/>
          )
        })}
      </div>
    </>
  )
}

function Onepost(props){
  return(
    <>
    <li>{props.title}</li>
    </>
  )
}

export default App
