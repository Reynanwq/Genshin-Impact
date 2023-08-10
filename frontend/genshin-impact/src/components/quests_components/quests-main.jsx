import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';

function Quests_main(){
  return(
    <div>
      <div className="card-achievement">
      <img src={imgTest} alt="IMG TEST" />
        <h2>NAME: </h2>
        <h2>DESCRIPTION: </h2>
        <h2>REWARD:</h2>
        <h2>CHAPTER: </h2>
        <h2>ACTS:</h2>
        <h2>RANK:</h2>
      </div>
    </div>
  );
}

export default Quests_main;