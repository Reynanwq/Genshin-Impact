import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function fishing_main(){
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/fishing")
      .then((response) => {
        setPosts(response.data);
      })
      .catch(() => {
        console.log("error in axios request");
      });
  }, []);

  return(
    <div>
      {posts.map((post, key) => (
        <div key={key} className="card-achievement">
          <img src={imgTest} alt="IMG TEST" />
            <h2>NAME: {post.fish_name}</h2>
            <h2>LOCALIZATION: {post.localization}</h2>
          </div>
      ))}
    </div>
  );
}

export default fishing_main;