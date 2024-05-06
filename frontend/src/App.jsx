import { useState } from 'react';
import './App.css';

function App() {
  const [formData, setFormData] = useState({
    name: '',
    governmentId: '',
    email: '',
    debtAmount: '',
    debtDueDate: ''
  });

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await fetch('http://localhost:3002/charges', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(formData)
      });

      if (response.ok) {
        console.log('Dados enviados com sucesso!');
      } else {
        console.error('Erro ao enviar dados.');
      }
    } catch (error) {
      console.error('Erro:', error);
    }
  };

  return (
    <div className="container">
      <form onSubmit={handleSubmit}>
        <h1>Hello Kanastra!</h1>
        <input
          type="text"
          placeholder="Enter the name of the person."
          name="name"
          value={formData.name}
          onChange={handleInputChange}
          required
        />
        <input
          type="text"
          placeholder="Enter the government ID number (CNPJ or CPF)."
          name="governmentId"
          value={formData.governmentId}
          onChange={handleInputChange}
          required
        />
        <input
          type="email"
          placeholder="Enter the email address of the person."
          name="email"
          value={formData.email}
          onChange={handleInputChange}
          required
        />
        <input
          type="number"
          placeholder="Enter the amount of the debt."
          name="debtAmount"
          value={formData.debtAmount}
          onChange={handleInputChange}
          required
        />
        <input
          type="text"
          placeholder="Enter the due date of the debt (format: DD/MM/YYYY)."
          name="debtDueDate"
          value={formData.debtDueDate}
          onChange={handleInputChange}
          required
        />
        <button type="submit">Register Charge</button>
      </form>
    </div>
  );
}

export default App;
