// import React from "react";

import { useRecoilState } from "recoil";
import { countatom } from "../store/atom";

const Button = () => {
  let [count, setCount] = useRecoilState(countatom);
  return (
    <div>
      <button onClick={() => setCount(count + 1)}>Increment</button>
      <button onClick={() => setCount(count - 1)}>Decrement</button>
    </div>
  );
};

export default Button;
