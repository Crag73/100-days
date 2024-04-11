import { useState } from "react";
import { AiOutlineClose, AiOutlineMenu } from 'react-icons/ai';


const Navbar = () => {
    const [nav,setNav] = useState(false);
    const [logged,setLogged] = useState(false);
    function handleNav(){
        setNav(!nav);
    }
    let Items=[];
    if (logged) {
        Items=[
            {id: 1, text:"Home" },
            {id: 2, text:"Profile" },
            {id: 3, text:"Skills" },
            {id: 4, text:"Messages" }
        ]
    } else {
        Items=[
            {id: 1, text:"Home" },
            {id: 2, text:"Profile" },
            {id: 3, text:"Skills" },
            {id: 4, text:"Messages" }
        ]
    }
  return (
    <div className="bg-black flex justify-between items-center w-full h-20 p-3 mx-auto text-white">
        <h1 className='w-full font-bold text-3xl text-green-400 cursor-pointer'>SKILL SWAP</h1>
        <ul className="hidden md:flex">
        {Items.map(item=>(
            <li key={item.id} className="p-3 hover:bg-green-400 rounded-xl m-2 cursor-pointer duration-500 hover:text-black">
                {item.text}
            </li>
        ))}
        </ul>
    {/* Mobile Navigation  */}
        <div onClick={handleNav} className=" block md:hidden">
        {nav ? <AiOutlineClose size={20} /> : <AiOutlineMenu size={20} />}
        </div>
        <ul className={nav? 'fixed md:hidden left-0 top-0 w-[60%] h-full border-r border-r-gray-900 bg-black ease-in-out duration-500'
        :'ease-in-out w-[60%] duration-500 fixed top-0 bottom-0 left-[-100%]'}>
            <h1 className='w-full text-3xl font-bold text-green-400 m-4'>SKILL SWAP</h1>
        {Items.map(item=>(
            <li key={item.id} className="p-3 hover:bg-green-400 rounded-xl border-b duration-500 hover:text-black cursor-pointer border-gray-600">
                {item.text}
            </li>
        ))}
        </ul>
    </div>
  )
}

export default Navbar