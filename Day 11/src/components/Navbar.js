import React from 'react';
import { Link } from "react-router-dom";
const Navbar = () => {
    return (
        <div className="flex text-xl list-none gap-2 justify-end p-2 bg-blue-500">
            <li>
                <Link to="#" className='text-lg bg-gray-400 hover:bg-gray-500 rounded-xl p-2 text-white'>SignUp</Link>
            </li>
            <li>
                <Link to="#" className='text-lg bg-gray-400 hover:bg-gray-500 rounded-xl p-2 text-white'>LogIn</Link>
            </li>
        </div>
    );
}
export default Navbar;