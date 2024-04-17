import { useEffect, useRef, useState } from "react";
import "./App.css"; //Use ref DOES NOT TRIGGER RERENDERING

function App() {
  const [tax, setTax] = useState("200000");
  const taxRef = useRef("");
  const inputRef = useRef("");
  // useEffect(() => {
  //   console.log(taxRef.current);
  //   setTimeout(() => {
  //     taxRef.current.innerText = 2000;
  //   }, 5000);
  // }, []);
  return (
    <div>
      <input
        type="text"
        placeholder="Enter tax"
        onChange={textChangeHandler}
      ></input>
      <button onClick={clickHandler}>Calculate</button>
      <h1>
        Calculated: <span ref={taxRef}>{tax}</span>
      </h1>
    </div>
  );
  function textChangeHandler(e) {
    console.log(e.target.value);
    inputRef.current = e.target.value;
  }
  function clickHandler() {
    setTax(inputRef.current);
  }
}

export default App;
