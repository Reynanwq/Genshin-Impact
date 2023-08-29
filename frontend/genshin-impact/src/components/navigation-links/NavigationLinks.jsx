import { Link } from "react-router-dom";
import './navigation-links.css';
const NavigationLinks = () => {
  return (
    <nav className="navigation-links">
        <div className="nav_box">
        <Link to='/achievements' className="no-underline">
        <h3>Achievements</h3>
        </Link>
        </div>
      <div className="nav_box">
      <Link to="/characters" className="no-underline">
      <h3>Character</h3>
      </Link> 
      </div>
      <div className="nav_box">
      <Link to={"/fishing"} className="no-underline">
      <h3>Fishing</h3>
      </Link>
      </div>
      <div className="nav_box">
      <Link to={"/food"} className="no-underline">
      <h3>Food</h3>
      </Link>
      </div>
      <div className="nav_box">
      <Link to={"/potions"} className="no-underline">
      <h3>Potions</h3>
      </Link>
      </div>
      <div className="nav_box">
      <Link to={"/quests"} className="no-underline">
      <h3>Quests</h3>
      </Link>
      </div>
      <div className="nav_box">
      <Link to={"/statisticCharacter"} className="no-underline">
      <h3>Statistic about Character</h3>
      </Link>
      </div>
      <div className="nav_box">
      <Link to={"/updates"} className="no-underline">
      <h3>Updates</h3>
      </Link>
      </div>
      <div className="nav_box">
      <Link to={"/weapons"} className="no-underline">
      <h3>Weapons</h3>
      </Link>
      </div>
    </nav>
  );
};

export default NavigationLinks;
