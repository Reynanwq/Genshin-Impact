import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Food_main(){
  const[posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/foods")
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
            <h2>NAME: {post.food_name}</h2>
            <h2>DESCRIPTION: {post.food_description}</h2>
            <h2>RARITY: {post.rarity}</h2>
            <h2>TYPE: {post.fodd_type}</h2>
        </div>
    ))}
  </div>
  );
}

export default Food_main;