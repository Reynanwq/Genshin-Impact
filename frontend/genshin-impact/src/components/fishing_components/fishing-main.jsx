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
    <div className="card-container">
      {posts.map((post, key) => (
        <div key={key} className="card-achievement">
          <img src={post.url} alt="IMG TEST" className="fish_img"/>
            <h2>Name: <span>{post.fish_name}</span></h2>
            <h2>Localization: <span>{post.localization}</span></h2>
          </div>
      ))}
    </div>
  );
}

export default fishing_main;