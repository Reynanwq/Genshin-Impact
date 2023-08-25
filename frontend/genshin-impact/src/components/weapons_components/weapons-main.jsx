import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Weapons_main(){
  const[posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/weapons")
    .then((response) => {
      setPosts(response.data);
    })
    .catch(() => {
      console.log("error in axios request")
    });
  }, []);

  return(
    <div className="card-container">
      {posts.map((post, key) => (
      <div key={key} className="card-achievement">
        <img src={post.url} alt="IMG TEST" />
          <h2>NAME: </h2>
          <h2>TYPE: </h2>
          <h2>DESCRIPTION: </h2>
          <h2>BASIC ATACK:</h2>
          <h2>BASIC-DEFENSE </h2>
          <h2>CRITICK DAMAGA</h2>
          <h2>LEVEL:</h2>
          <h2>ASCENSION:</h2>
          <h2>AMOUNT STARS:</h2>
      </div>
      ))}
    </div>
  );
}

export default Weapons_main;