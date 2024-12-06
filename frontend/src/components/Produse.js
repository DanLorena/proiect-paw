import React, { useEffect, useState } from 'react';

function Produse() {
    const [produse, setProduse] = useState([]);  // Inițializăm state-ul pentru produse

    // Folosim useEffect pentru a prelua datele din backend când componenta este montată
    useEffect(() => {
        // Facem cererea către backend
        fetch('http://localhost:8080/api/produse')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');  // Dacă răspunsul nu este OK, aruncăm o eroare
                }
                return response.json();  // Parsăm răspunsul ca JSON
            })
            .then(data => {
                console.log("Date primite de la backend:", data);  // Verificăm dacă datele sunt primite
                setProduse(data);  // Setăm datele primite în state-ul produse
            })
            .catch(error => console.error('Error fetching data:', error));  // Prindem eventualele erori
    }, []);  // [] indică faptul că useEffect se execută doar o dată, la montarea componentei

    return (
        <div>
            <h2>Lista de Produse</h2>
            <ul>
                {produse.map(produs => (
                    <li key={produs.id}>
                        <h3>{produs.nume}</h3>
                        <p>{produs.descriere}</p>
                        <p>Preț: {produs.pret} RON</p>
                        <p>Cantitate în stoc: {produs.cantitateInStoc}</p>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default Produse;
