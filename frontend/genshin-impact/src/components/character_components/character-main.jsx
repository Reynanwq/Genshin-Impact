import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';

function character_main(){
  return(
    <div>
      <div className="card-achievement">
      <img src={imgTest} alt="IMG TEST" />
        <h2>NAME: </h2>
        <h2>TYPE: </h2>
        <h2>DESCRIPTION: </h2>
        <h2>RELEASE DATE:</h2>
        <h2>GENDER: </h2>
        <h2>SKILLS:</h2>
        <h2>PASSIVE-TALENT:</h2>
        <h2>CONSTELATIONS:</h2>
      </div>
    </div>
  );
}

export default character_main;