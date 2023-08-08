import './App.css';
import NavigationLinks from './NavigationLinks'; 

function App() {
  return (
    <div className="App">
      <header>
        <h1>Genshin Impact</h1>
      </header>
      <section>
        <h2>This is your ultimate source for Genshin Impact information.</h2>
        <h2>What do you want to know about this amazing game?</h2>
        <NavigationLinks /> {}
      </section>
    </div>
  );
}

export default App;
