import { Link } from "react-router-dom";
import React from 'react';
import './Error.css';
import Header from './error-header.jsx';

function Error(){
  return (
    <div className="error_page">
       <Header />
       <div className="error2">
        <h1>404</h1>
        <h1>Page not found</h1>
      </div>
    </div>
  );
}

export default Error;
