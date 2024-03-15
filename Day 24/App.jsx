import { useState } from 'react'
import './App.css'

function App() {
  const [count, setCount] = useState(0);
  function changeCount(){
    setCount(count+1);
  }

  return (
    <>
      <div className="card">
        <button onClick={changeCount}>
          count is {count}
        </button>
      </div>
    </>
  )
}

export default App
