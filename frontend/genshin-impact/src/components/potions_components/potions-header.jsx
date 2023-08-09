import { Link } from "react-router-dom";
import '../achievements_components/achievements-header.css';

function character_header() {
  return (
    <div>
      <header>
        <h1>Potions</h1>
        <div className="org-header">
          <Link to='/' className="no-underline">
            <p>Home</p>
          </Link>
          <Link to='/achievements' className="no-underline">
            <p>Achievements</p>
          </Link>
          <Link to="/characters" className="no-underline">
            <p>Character</p>
          </Link>
          <Link to={"/fishing"} className="no-underline">
            <p>Fishing</p>
          </Link>
          <Link to={"/food"} className="no-underline">
            <p>Food</p>
          </Link>
          <Link to={"/potions"} className="no-underline">
            <p>Potions</p>
          </Link>
          <Link to={"/quests"} className="no-underline">
            <p>Quests</p>
          </Link>
          <Link to={"/statisticCharacter"} className="no-underline">
            <p>Statistic</p>
          </Link>
          <Link to={"/updates"} className="no-underline"> 
            <p>Updates</p>
          </Link>
          <Link to={"/weapons"} className="no-underline">
            <p>Weapons</p>
          </Link>
      </div>
      </header>
    </div>
  );
}

export default character_header;