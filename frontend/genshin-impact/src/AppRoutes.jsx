import { BrowserRouter, Routes, Route} from 'react-router-dom';
import App from './App.jsx';
import Achievements from './pages/Achievements/Achievements.jsx';
import Characters from './pages/Character/Character.jsx';
import Fishing from './pages/Fishing/Fishing.jsx';
import Food from './pages/Food/Food.jsx';
import Player from './pages/Player/Player.jsx';
import Potions from './pages/Potions/Potions.jsx';
import Quests from './pages/Quests/Quests.jsx';
import StatisticCharacter from './pages//StatisticCharacter/StatisticCharacter.jsx';
import Updates from './pages/Updates/Updates.jsx';
import Weapons from './pages/Weapons/Weapons.jsx';

function AppRoutes(){
  return (
    <BrowserRouter>
      <Routes>
              <Route path='/' element={<App />}/>
              <Route path="/achievements" element={<Achievements />}/>
              <Route path="/characters" element={<Characters />}/>
              <Route path="/fishing" element={<Fishing />}/>
              <Route path="/food" element={<Food />}/>
              <Route path="/player" element={<Player />}/>
              <Route path="/potions" element={<Potions />}/>
              <Route path="/quests" element={<Quests />}/>
              <Route path="/statisticCharacter" element={<StatisticCharacter />}/>
              <Route path="/updates" element={<Updates />}/>
              <Route path="/weapons" element={<Weapons />}/>
              <Route path='*' element={Error}></Route>
      </Routes>   
    </BrowserRouter>
  )
}

export default AppRoutes;
