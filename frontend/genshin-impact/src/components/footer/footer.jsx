import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faLinkedin, faGithub, faInstagram } from '@fortawesome/free-brands-svg-icons';


import './footer.css'; // Certifique-se de ter o arquivo Footer.css no mesmo diretório

const Footer = () => {
  return (
    <footer className="footer">
      <p>&copy; 2023 Genshin Impact</p>
      <p>&copy; Development by Reynan Paiva</p>
      <div className="social-links">
        <a href="https://www.linkedin.com/in/reynan-da-silva-dias-paiva-982808219/" target="_blank" rel="noopener noreferrer" >
        <FontAwesomeIcon icon={faLinkedin}/> LinkedIn
        </a>
        <a href="https://github.com/Reynanwq" target="_blank" rel="noopener noreferrer">
        <FontAwesomeIcon icon={faGithub} /> GitHub
        </a>
        <a href="https://www.instagram.com/reynanwq/" target="_blank" rel="noopener noreferrer">
          <FontAwesomeIcon icon={faInstagram} /> Instagram</a>
      </div>
    </footer>
  );
};

export default Footer;
