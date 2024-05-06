# Hiring-Challenge

# Projeto Sistema De Cobrança - Kanastra💰⛰️

Este é um projeto para demonstrar a comunicação entre um aplicativo frontend, uma aplicação Java Spring e com um banco de dados PostgreSQL.

## Visão Geral

O projeto consiste em três componentes principais:

1. **Frontend**: Um aplicativo web frontend desenvolvido em React.js. Ele permite que os usuários preencham um formulário com informações sobre cobranças e enviem esses dados para o servidor backend para serem salvos no banco de dados.

2. **Backend**: Um servidor backend desenvolvido em Java Spring. Ele fornece endpoint RESTful para receber solicitações do frontend, processá-las e salvar os dados no banco de dados PostgreSQL.

3. **Banco de Dados**: Um banco de dados PostgreSQL usado para armazenar informações sobre cobranças. Ele é inicializado com uma tabela `charges` no momento da inicialização.

## Como Executar o Projeto

Para executar o projeto localmente, siga estas etapas:

1. Clone este repositório para o seu ambiente de desenvolvimento.

2. Navegue até o diretório raiz do projeto.

3. Abra em sua IDE de preferência o fonte do frontend e do backend.

4. No backend poderá iniciar pelo terminal com: mvn spring-boot:run ou pelo executar da propria IDE.
   
5. No frontend poderá iniciar pelo terminal com: npm run dev.

6. Abra um navegador da web e acesse `http://localhost:3001` para interagir com o aplicativo frontend.

7. Preencha o formulário de cobranças e envie os dados. Verifique se os dados são salvos corretamente no banco de dados.

Obs: O pedido do desafio foi que a aplicação estivesse rodando com dockercompose. Porem infelizmente essa parte não pude entregar, apesar dos meus esforços esse é um ponto que levarei a diante no meus estudos. Mas sei que esses esforços seram bem aproveitados com o aprendizado que a Kanastra pode me proporcionar.
