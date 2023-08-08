import { Link } from "react-router-dom";

const NavigationLinks = () => {
  return (
    <nav className="navigation-links">
      <Link to={"/achievements"} className="no-underline">
        <div className="nav_box">
        <h3>Achievements</h3>
        </div>
      </Link>
      <Link to={"/characters"} className="no-underline">
      <div className="nav_box">
      <h3>Character</h3>
      </div>
      </Link>
      <Link to={"/fishing"} className="no-underline">
      <div className="nav_box">
      <h3>Fishing</h3>
      </div>
      </Link>
      <Link to={"/food"} className="no-underline">
      <div className="nav_box">
      <h3>Food</h3>
      </div>
      </Link>
      <Link to={"/potions"} className="no-underline">
      <div className="nav_box">
      <h3>Potions</h3>
      </div>
      </Link>
      <Link to={"/quests"} className="no-underline">
      <div className="nav_box">
      <h3>Quests</h3>
      </div>
      </Link>
      <Link to={"/statisticCharacter"} className="no-underline">
      <div className="nav_box">
      <h3>Statistic about Character</h3>
      </div>
      </Link>
      <Link to={"/updates"} className="no-underline">
      <div className="nav_box">
      <h3>Updates</h3>
      </div>
      </Link>
      <Link to={"/weapons"} className="no-underline">
      <div className="nav_box">
      <h3>Weapons</h3>
      </div>
      </Link>
    </nav>
  );
};

export default NavigationLinks;
