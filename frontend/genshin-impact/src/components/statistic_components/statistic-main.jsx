import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Statistic_main(){
  const[posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/statisticCharacters")
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
      <img src={imgTest} alt="IMG TEST" />
        <h2>NAME: {post.name_characters}</h2>
        <h2>LEVEL: {post.level}</h2>
        <h2>BASIC LIFE: {post.basic_life}</h2>
        <h2>BASIC ATTACK: {post.basic_attack}</h2>
        <h2>BASIF DEFENSE: {post.basic_defense}</h2>
        <h2>DAMAGE BONUS: {post.damage_bonus}</h2>
      </div>
      ))}
    </div>
  );
}

export default Statistic_main;