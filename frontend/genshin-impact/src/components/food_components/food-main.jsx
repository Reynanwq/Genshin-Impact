import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Food_main(){
  const[posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("https://sick-snail-production.up.railway.app/foods")
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
          <div className="food-image">
          <img src={post.url} alt="IMG TEST" />
          </div>
            <h2>Name: <span>{post.food_name}</span></h2>
            <h2>Description: <span>{post.food_description}</span></h2>
            <h2>Rarity: <span>{post.rarity}</span></h2>
            <h2>Type: <span>{post.food_type}</span></h2>
        </div>
    ))}
  </div>
  );
}

export default Food_main;