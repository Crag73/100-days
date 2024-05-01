// import React from 'react'
import { getDatabase, ref, set } from "firebase/database";
import app from "../../firebaseConfig";

const Write = () => {
  let db = getDatabase(app);
  let dbref = ref(db, "User/user1");
  set(dbref, {
    name: "divyam",
    email: "abc@gmail.com",
  })
    .then(() => {
      console.log("data added");
    })
    .catch((err) => {
      console.log(err);
    });
  return <div>Writing data using this</div>;
};

export default Write;
