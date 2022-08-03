<h1 align="center">
    Parking Control
</h1>

<p align="center">🚀 Sistema responsável por controlar vagas de estacionamento de um determinado condomínio</p>



<h1 align="center">
     Parking Control
</h1>

<h3 align="center">
    🚀 O Parking Control é uma API REST responsável por controlar vagas de estacionamento de um determinado condomínio. Com essa API é possível listar as vagas ocupadas do estacionamento além de detalhar, registrar, atualizar e apagar a ocupação de uma vaga.
</h3>

<p align="center">
	
  <img alt="language" src="https://img.shields.io/static/v1?label=language&message=Java&color=7159c1&style=for-the-badge&logo=ghost"/>

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/thiagonunes-silva/parking-control">
  
  <a href="https://github.com/thiagonunes-silva/parking-control/commits">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/thiagonunes-silva/parking-control">
  </a>

  <img alt="Desenvolvido por Thiago Pereira Nunes e Silva" src="https://img.shields.io/badge/feito%20por-Thiago Pereira Nunes e Silva-%237519C1">
 
</p>

<h4 align="center">
	🚧   Em desenvolvimento 🚧
</h4>

Tabela de conteúdos
=================
<!--ts-->
   * [Sobre o projeto](#-sobre-o-projeto)
   * [Funcionalidades](#-funcionalidades)
   * [Pré-requisitos](#pré-requisitos)
   * [Como executar o projeto](#-como-executar-o-projeto)
     * [Pré-requisitos](#pré-requisitos)
     * [Rodando o Backend (servidor)](#user-content--rodando-o-backend-servidor)
     * [Rodando a aplicação web (Frontend)](#user-content--rodando-a-aplicação-web-frontend)
   * [Tecnologias](#-tecnologias)
     * [WebSite](#user-content-website--react----typescript)
     * [Server](#user-content-server--nodejs----typescript)
     * [Mobile](#user-content-mobile--react-native----typescript)
   * [Contribuidores](#-contribuidores)
   * [Como contribuir no projeto](#-como-contribuir-no-projeto)
   * [Autor](#-autor)
   * [Licença](#user-content--licença)
<!--te-->


## 💻 Sobre o projeto

♻️ Parking Control - é uma API REST responsável por controlar vagas de estacionamento de um determinado condomínio.


Com essa API é possível listar as vagas ocupadas do estacionamento além de detalhar, registrar, atualizar e apagar a ocupação de uma vaga.


Esse Projeto foi desenvolvido para acompanhar o curso de Spring Boot ofertado pela [Michelle Brito](https://www.youtube.com/watch?v=LXRU-Z36GEU&ab_channel=MichelliBrito)


---

## ⚙️ Funcionalidades

- [x] Listar as vagas ocupadas no estacionamento
- [x] Consultar um registro de ocupação de uma vaga de estacionamento
- [x] Registrar a ocupação de uma nova vaga do estacionamento
- [x] Atualizar a ocupação de uma nova vaga do estacionamento
- [x] Apagar a ocupação de uma nova vaga do estacionamento


---

## Pré-requisitos

- [x] Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas: [Git](https://git-scm.com), [Maven](https://maven.apache.org/). 
- [x] Será necessário também ter o banco de dados [MySQL](https://www.mysql.com/) instalado na máquina e sendo executado na porta 3306. Crie um databse com o nome de **parking_control_db**.
- [x] Além disto é bom ter um editor para trabalhar com o código como [Eclipse](https://www.eclipse.org/downloads/) e uma ferramenta que ajude a executar os endpoints disponibilizados pela API como o [Postman](https://www.postman.com/)


---

## 🚀 Como executar o projeto

```bash

# Clone este repositório
$ git clone https://github.com/thiagonunes-silva/parking-control.git

# Acesse a pasta do projeto no terminal/cmd
$ cd parking-control

# Execute a aplicação
$ mvn spring-boot:run

# Instale as dependências
$ npm install

# Execute a aplicação em modo de desenvolvimento
$ npm run dev:server

# O servidor inciará na porta:8080 - Acesse o endereço http://localhost:8080 utilizando algum browser

# Import o arquivo Postman_API_ParkingControl.json disponibilizado na pasta do projeto no Postman e execute os endpoints disponibilizados para testar o sistema

```


---

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:


-   **[Jdk11](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)**
-   **[Git](https://git-scm.com)**
-   **[Spring Boot](https://spring.io/projects/spring-boot)**
-   **[MAVEN](https://maven.apache.org/)**
-   **[Eclipse](https://www.eclipse.org/downloads/)**
-   **[Postman](https://www.postman.com/)**

> Veja o arquivo  [pom.xml](https://github.com/thiagonunes-silva/parking-control/blob/master/pom.xml)


---


## 💪 Como contribuir no projeto

1. Faça um **fork** do projeto.
2. Crie uma nova branch com as suas alterações: `git checkout -b my-feature`
3. Salve as alterações e crie uma mensagem de commit contando o que você fez: `git commit -m "feature: My new feature"`
4. Envie as suas alterações: `git push origin my-feature`

---

## 🦸 Autor

 <b>Thiago Pereira Nunes e Silva</b> 🚀

[![Gmail Badge](https://img.shields.io/badge/-thiagonunes.silva@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagonunes.silva@gmail.com)](mailto:thiagonunes.silva@gmail.com)
