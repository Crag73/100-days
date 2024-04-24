// import React from "react";
import { FaSearch } from "react-icons/fa";
import Sidebar from "./Sidebar";
import Search from "./Search";

const Profile = () => {
  return (
    <div>
      <div className="flex">
        <Sidebar />
        <div className="flex-row pl-10 bg-slate-200">
          <Search />
          <div className="flex h-4/5 pr-10 py-10 bg-slate-200 rounded">
            <div className="flex bg-white p-3 h-full rounded-xl">
              <h1>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Rem
                aspernatur similique, dolores quasi ut vero nemo exercitationem
                sapiente non iure perspiciatis incidunt quaerat distinctio, eos
                eius fugiat voluptatibus autem ipsam.
              </h1>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Profile;
