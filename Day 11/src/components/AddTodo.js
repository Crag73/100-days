import Axios from "axios";
import React from 'react';
import { useState, useEffect } from 'react';



const AddTodo = () => {
    const [inputTodo, setInputTodo] = useState("")
    const [todos, setTodos] = useState([])
    const [editMode, setEditMode] = useState(false)
    const [editTodoDesc, setEditTodoDesc] = useState("")
    const [editTodoId, setEditToDoId] = useState(0)
    const [editTodoChecked, setEditTodoChecked] = useState(false)
    useEffect(() => {
        const res = Axios.get("http://localhost:3000/todo").then(res => {
            console.log(res);
        });
    }, []);

    return (
        <div className="flex-col flex items-center gap-10 pt-10 bg-blue-100 pb-32">
            <div className="text-2xl">ToDo List</div>
            <div className="flex gap-1">
                <input className="border text-xl rounded-lg shadow-lg" type="text" placeholder="Enter Todo" value={inputTodo}
                    onChange={e => setInputTodo(e.target.value)}></input>
                <button className="text-lg bg-gray-400 hover:bg-gray-500 rounded-xl p-2">Add</button>
                <button className="text-lg bg-red-400 hover:bg-red-500 rounded-xl p-2">Clear</button>
            </div>
        </div>
    )
}

export default AddTodo