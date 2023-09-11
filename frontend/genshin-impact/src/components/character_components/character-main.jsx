import '../achievements_components/achievements-main.css';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function CharacterMain() {
  const [posts, setPosts] = useState([]);
  const [selectedPostIndex, setSelectedPostIndex] = useState(null); // State to track selected post index

  useEffect(() => {
    axios.get("https://sick-snail-production.up.railway.app/characters")
      .then((response) => {
        setPosts(response.data);
      })
      .catch(() => {
        console.log("error in axios request");
      });
  }, []);

  // Function to toggle details display
  const toggleDetails = (index) => {
    setSelectedPostIndex(index === selectedPostIndex ? null : index);
  };

  return (
    <div className="card-container">
      {posts.map((post, index) => (
        <div key={index} className="card-achievement">
          <img src={post.url} alt="IMG FROM CHARACTER" />
          <h2>Name: <span>{post.name}</span></h2>
          <h2>Description: <span>{post.description}</span></h2>
          {selectedPostIndex === index && (
            <>
              <h2>Type: <span>{post.type}</span></h2>
              <h2>Release Date: <span>{post.release_date}</span></h2>
              <h2>Gender: <span>{post.gender}</span></h2>
              <h2>Skills: <span>{post.skills}</span></h2>
              <h2>Passive-Talent: <span>{post.passive_talent}</span></h2>
              <h2>Constellations: <span>{post.constellations}</span></h2>
            </>
          )}
          <button onClick={() => toggleDetails(index)}>
            {selectedPostIndex === index ? <a href="#">Hide Details</a> : <a href="#">Show Details</a>}
          </button>
        </div>
      ))}
    </div>
  );
}

export default CharacterMain;
