import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/characters/albedo.webp';
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
    <div>
      {posts.map((post, key) => (
        <div key={key} className="card-achievement">
          <img src={imgTest} alt="IMG TEST" />
          <h2>NAME: {post.name}</h2>
          <h2>TYPE: {post.type}</h2>
          <h2>DESCRIPTION: {post.description}</h2>
          <h2>RELEASE DATE: {post.release_date}</h2>
          <h2>GENDER: {post.gender}</h2>
          <h2>SKILLS: {post.skills}</h2>
          <h2>PASSIVE-TALENT: {post.passive_talent}</h2>
          <h2>CONSTELATIONS: {post.constellations}</h2>
        </div>
      ))}
    </div>
  );
}

export default character_main;