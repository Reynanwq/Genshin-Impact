import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Quests_main(){
  const[posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/quests")
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
      <img src={imgTest} alt="IMG TEST" />
        <h2>Name: <span>{post.quests_name}</span></h2>
        <h2>Description: <span>{posts.quests_description}</span></h2>
        <h2>Reward: <span>{posts.quests_reward}</span></h2>
        <h2>Chapter: <span>{post.quests_chapter}</span></h2>
        <h2>Acts: <span>{post.quests_acts}</span></h2>
        <h2>Rank: <span>{post.adventure_rank}</span></h2>
      </div>
      ))}
    </div>
  );
}

export default Quests_main;