// import React from "react";
import { FaSearch } from "react-icons/fa";

const Search = () => {
  return (
    <div className="h-auto p-2 bg-slate-200">
      <div className="relative">
        <input className="flex my-4 p-1 pl-8" placeholder="Search" />
        <FaSearch className="absolute pointer-events-none top-1/2 left-2 transform -translate-y-1/2 text-gray-500" />
      </div>
      <button className="flex  bg-sky-300 p-3 rounded-xl my-auto">
        Search
      </button>
    </div>
  );
};

export default Search;
