import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';

function Weapons_main(){
  return(
    <div>
      <div className="card-achievement">
      <img src={imgTest} alt="IMG TEST" />
        <h2>NAME: </h2>
        <h2>TYPE: </h2>
        <h2>DESCRIPTION: </h2>
        <h2>BASIC ATACK:</h2>
        <h2>BASIC-DEFENSE </h2>
        <h2>CRITICK DAMAGA</h2>
        <h2>LEVEL:</h2>
        <h2>ASCENSION:</h2>
        <h2>AMOUNT STARS:</h2>
      </div>
    </div>
  );
}

export default Weapons_main;