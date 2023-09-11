import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Potions_main(){
  const[posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("https://sick-snail-production.up.railway.app/potions")
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
        <h2>Name: <span>{post.potion_name}</span></h2>
        <h2>Rarity: <span>{post.rarity}</span></h2>
        <h2>Effect: <span>{post.effect}</span></h2>
      </div>
    ))}
  </div>
  );
}
export default Potions_main;