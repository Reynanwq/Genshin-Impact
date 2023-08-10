import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';

function Potions_main(){
  return(
    <div>
    <div className="card-achievement">
    <img src={imgTest} alt="IMG TEST" />
      <h2>NAME: </h2>
      <h2>RARITY: </h2>
      <h2>EFFECT: </h2>
    </div>
  </div>
  );
}
export default Potions_main;