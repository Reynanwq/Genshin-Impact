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
          <h2>Name: <span>{post.achievements_name}</span></h2>
          <h2>Type: <span>{post.arco}</span></h2>
          <h2>Description: <span>{post.achievements_description}</span></h2>
          <h2>Basic Atack: <span>{post.basic_attack}</span></h2>
          <h2>Basic-Defense <span>{post.basic_defense}</span></h2>
          <h2>Critck-Damage <span>{post.crit_damage}</span></h2>
          <h2>Level: <span>{post.level}</span></h2>
          <h2>Ascension: <span>{post.ascension}</span></h2>
          <h2>Amount-Stars: <span>{post.amounts_stars}</span></h2>
      </div>
      ))}
    </div>
  );
}

export default Weapons_main;