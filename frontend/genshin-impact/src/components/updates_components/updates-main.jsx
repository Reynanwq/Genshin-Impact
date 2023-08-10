import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';

function Updates_main(){
  return(    <div>
      <div className="card-achievement">
      <img src={imgTest} alt="IMG TEST" />
        <h2>PATH-VERSION: </h2>
        <h2>NAME: </h2>
        <h2>STATUS: </h2>
        <h2>WEAPONS: </h2>
        <h2>CHARACTERS: </h2>
        <h2>TIME: </h2>
        <h2>CHARACTERS LIMITED:</h2>
      </div>
    </div>
  );
}

export default Updates_main;