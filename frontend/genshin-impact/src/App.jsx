import './App.css';
import NavigationLinks from './NavigationLinks'; 
import Aside from './components/aside';
import Footer from './components/footer/footer';

function App() {
  return (
    <div className="App">
      <header>
        <h1>Genshin Impact</h1>
      </header>
      <section className="intro-section">
        <h2>This is your ultimate source for Genshin Impact information.</h2>
        <h2>What do you want to know about this amazing game?</h2>
      </section>
      <section>
        <NavigationLinks /> 
        <Aside/> {}
      </section>
      <div>
        <Footer/>
      </div>
    </div>
  );
}

export default App;