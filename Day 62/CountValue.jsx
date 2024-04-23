// import React from 'react'
import { useRecoilValue } from "recoil";
import { countatom } from "../store/atom";
const CountValue = () => {
  const count = useRecoilValue(countatom);
  return <div>{count}</div>;
};

export default CountValue;
