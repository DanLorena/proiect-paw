import React from 'react';  // Importă React
import './App.css';         // Importă fișierul CSS
import Produse from './components/Produse';  // Importă componenta Produse

function App() {
  return (
      <div className="App">
        <header>
          <h1>Magazin Sportiv</h1>  {/* Titlul aplicației */}
        </header>

        {/* Afișăm lista de produse */}
        <Produse />
      </div>
  );
}

export default App;  // Exportă componenta App
