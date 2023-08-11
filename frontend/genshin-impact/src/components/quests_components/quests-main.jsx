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
    <div>
      {posts.map((post, key) => (
      <div key={key} className="card-achievement">
      <img src={imgTest} alt="IMG TEST" />
        <h2>NAME: {post.quests_name}</h2>
        <h2>DESCRIPTION: {posts.quests_description}</h2>
        <h2>REWARD: {posts.quests_reward}</h2>
        <h2>CHAPTER: {post.quests_chapter}</h2>
        <h2>ACTS: {post.quests_acts}</h2>
        <h2>RANK: {post.adventure_rank}</h2>
      </div>
      ))}
    </div>
  );
}

export default Quests_main;