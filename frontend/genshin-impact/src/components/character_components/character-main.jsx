import '../achievements_components/achievements-main.css';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function character_main(){
  //only be executed after the component show in my screen
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/characters")
      .then((response) => {
        setPosts(response.data);
      })
      .catch(() => {
        console.log("error in axios request");
      });
  }, []);

  return (
    <div className="card-container">
      {posts.map((post, key) => (
        <div key={key} className="card-achievement">
          <img src={post.url} alt="IMG FROM CHARACTER" />
          <h2>Name: <span>{post.name}</span></h2>
          <h2>Type: <span>{post.type}</span></h2>
          <h2>Description: <span>{post.description}</span></h2>
          <h2>Release Date: <span>{post.release_date}</span></h2>
          <h2>Gender: <span>{post.gender}</span></h2>
          <h2>Skills: <span>{post.skills}</span></h2>
          <h2>Passive-Talent: <span>{post.passive_talent}</span></h2>
          <h2>Constelations: <span>{post.constellations}</span></h2>
        </div>
      ))}
    </div>
  );
}

export default character_main;