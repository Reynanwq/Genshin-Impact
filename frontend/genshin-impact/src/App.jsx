import './App.css';
import NavigationLinks from './components/navigation-links/NavigationLinks'; 
import Aside from './components/aside/aside';
import Footer from './components/footer/footer';
import Header from './components/header/header';
import Section_intro from './components/section-intro/section-intro';

function App() {
  return (
    <div className="App">
      <Header />
      <Section_intro />
      <section>
        <NavigationLinks /> 
        <Aside/> 
      </section>
      <div>     
        <Footer/>
      </div>
    </div>
  );
}

export default App;

