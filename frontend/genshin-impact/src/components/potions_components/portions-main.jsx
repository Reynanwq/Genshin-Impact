import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Potions_main(){
  const[posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/potions")
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
        <h2>NAME: {post.potion_name}</h2>
        <h2>RARITY: {post.rarity}</h2>
        <h2>EFFECT: {post.effect}</h2>
      </div>
    ))}
  </div>
  );
}
export default Potions_main;