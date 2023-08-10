import './achievements-main.css';
import imgTest from '../../assets/img-test.png';

function achievement_main(){
  return(
    <div>
      <div className="card-achievement">
      <img src={imgTest} alt="IMG TEST" />
        <h2>TOPIC: </h2>
        <h2>NAME: </h2>
        <h2>DESCRIPTION: </h2>
        <div>
          <h2>RARITY: <span>NUMBER</span></h2>
          <h2>AMOUNT RARITY: <span>NUMBER</span></h2>
        </div>
      </div>
    </div>
  );
}

export default achievement_main;