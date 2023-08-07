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
        <Route path="/" element={<Achievements />}/>
        <Route path="/" element={<Characters />}/>
        <Route path="/" element={<Fishing />}/>
        <Route path="/" element={<Food />}/>
        <Route path="/" element={<Player />}/>
        <Route path="/" element={<Potions />}/>
        <Route path="/" element={<Quests />}/>
        <Route path="/" element={<StatisticCharacter />}/>
        <Route path="/" element={<Updates />}/>
        <Route path="/" element={<Weapons />}/>
     </Route>
    </Routes>
    </BrowserRouter>
  </React.StrictMode>,
)
