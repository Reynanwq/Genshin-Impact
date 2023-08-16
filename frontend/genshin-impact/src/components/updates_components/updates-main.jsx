import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Updates_main(){
  const[posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/updates")
    .then((response) => {
      setPosts(response.data);
    })
    .catch(() => {
      console.log("error in axios request")
    });
  }, []);

  return(  
    <div>
       {posts.map((post, key) => (
        <div key={key} className="card-achievement">
        <img src={post.url} alt="IMG TEST" />
          <h2>PATH-VERSION: {post. path_version}</h2>
          <h2>NAME: {post.path_name}</h2>
          <h2>STATUS: {post.path_status}</h2>
          <h2>WEAPONS: {post.path_weapons}</h2>
          <h2>CHARACTERS: {post.path_characters}</h2>
          <h2>TIME: {post.path_time}</h2>
          <h2>CHARACTERS LIMITED: {post.path_characters_limited}</h2>
      </div>
      ))}
    </div>
  );
}

export default Updates_main;