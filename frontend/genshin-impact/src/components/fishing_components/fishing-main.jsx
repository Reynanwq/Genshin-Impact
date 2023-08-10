import '../achievements_components/achievements-main.css';
import imgTest from '../../assets/img-test.png';

function fishing_main(){
  return(
    <div>
      <div className="card-achievement">
      <img src={imgTest} alt="IMG TEST" />
        <h2>NAME: </h2>
        <h2>LOCALIZATION: </h2>
      </div>
    </div>
  );
}

export default fishing_main;