// import React from "react";
// import { FaSearch } from "react-icons/fa";
import Search from "./Search";
import Sidebar from "./Sidebar";

const Messages = () => {
  return (
    <div>
      <div className="flex">
        <Sidebar />
        <div className="flex-row pl-10 bg-slate-200">
          <Search />
          <div className="flex flex-col pr-10 py-10 bg-slate-200 rounded">
            <Msg />
          </div>
        </div>
      </div>
    </div>
  );
};

function Msg() {
  return (
    <div className="flex bg-white p-3 h-full rounded-xl">
      <h1>
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Quae aliquid
        provident laudantium! Quidem debitis non, qui animi delectus, vel
        voluptatum totam molestiae accusantium dolores dicta iure accusamus
        facilis, architecto ipsam.
        <hr className="h-px border-0 dark:bg-gray-700"></hr>
      </h1>
    </div>
  );
}
export default Messages;
