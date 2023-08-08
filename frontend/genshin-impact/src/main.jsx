import React from 'react'
import ReactDOM from 'react-dom/client'
import { BrowserRouter, Routes, Route} from 'react-router-dom';

import App from './App.jsx';
import Home from './pages/Home.jsx';
import Achievements from './pages/Achievements.jsx';
import Characters from './pages/Character.jsx';
import Fishing from './pages/Fishing.jsx';
import Food from './pages/Food.jsx';
import Player from './pages/Player.jsx';
import Potions from './pages/Potions.jsx';
import Quests from './pages/Quests.jsx';
import StatisticCharacter from './pages/StatisticCharacter.jsx';
import Updates from './pages/Updates.jsx';
import Weapons from './pages/Weapons.jsx';

import './index.css'

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <BrowserRouter>
    <Routes>
      <Route element={<App />}>
        <Route path="/" element={<Home />}/>
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
     </Route>
    </Routes>
    </BrowserRouter>
  </React.StrictMode>,
)
