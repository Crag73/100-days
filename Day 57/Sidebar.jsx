// import React from "react";

const Sidebar = () => {
  return (
    <div className="flex p-3 bg-custom-gray min-w-36 w-1/6 h-screen text-slate-300">
      <div className="text-lg pl-2 w-11/12">
        <ul>
          <li className="hover:text-white my-5 hover:bg-gray-600 border border-custom-gray hover:border-blue-300 cursor-pointer p-2 rounded-xl">
            Home
          </li>
          <li className="hover:text-white my-5 hover:bg-gray-600 border border-custom-gray hover:border-blue-300 cursor-pointer p-2 rounded-xl">
            Messages
          </li>
          <li className="hover:text-white my-5 hover:bg-gray-600 border border-custom-gray hover:border-blue-300 cursor-pointer p-2 rounded-xl">
            Skill Listing
          </li>
          <li className="hover:text-white my-5 hover:bg-gray-600 border border-custom-gray hover:border-blue-300 cursor-pointer p-2 rounded-xl">
            Find Others
          </li>
        </ul>
      </div>
    </div>
  );
};

export default Sidebar;
