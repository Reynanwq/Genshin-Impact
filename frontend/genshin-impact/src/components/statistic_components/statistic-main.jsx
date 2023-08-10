import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';

function Statistic_main(){
  return(
    <div>
      <div className="card-achievement">
      <img src={imgTest} alt="IMG TEST" />
        <h2>NAME: </h2>
        <h2>LEVEL: </h2>
        <h2>BASIC LIFE:</h2>
        <h2>BASIC ATTACK: </h2>
        <h2>BASIF DEFENSE:</h2>
        <h2>PASSIVE TALENT:</h2>
        <h2>DAMAGE BONUS::</h2>
      </div>
    </div>
  );
}

export default Statistic_main;