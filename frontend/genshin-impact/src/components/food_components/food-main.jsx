import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';

function Food_main(){
  return(
    <div>
    <div className="card-achievement">
    <img src={imgTest} alt="IMG TEST" />
      <h2>NAME: </h2>
      <h2>DESCRIPTION: </h2>
      <h2>RARITY:</h2>
      <h2>TYPE: </h2>
    </div>
  </div>
  );
}

export default Food_main;