import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';
import React, { useState, useEffect } from 'react';
import axios from 'axios';
function Updates_main(){
  const[posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("https://sick-snail-production.up.railway.app/updates")
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
          <h2>Path-Version: <span>{post.path_version}</span></h2>
          <h2>Name: <span>{post.path_name}</span></h2>
          <h2>Status: <span>{post.path_status}</span></h2>
          <h2>Weapons: <span>{post.path_weapons}</span></h2>
          <h2>Characters: <span>{post.path_characters}</span></h2>
          <h2>Time: <span>{post.path_time}</span></h2>
          <h2>Characters Limited: <span>{post.path_characters_limited}</span></h2>
      </div>
      ))}
    </div>
  );
}

export default Updates_main;