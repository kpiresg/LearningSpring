# Person Management API (CRUD)

Este é um projeto simples e prático desenvolvido para consolidar conhecimentos fundamentais em **Spring Boot**. A aplicação é uma API REST que gerencia o cadastro de pessoas, permitindo realizar as quatro operações básicas (Create, Read, Update e Delete).

---

## Tecnologias e Ferramentas
* **Linguagem:** Java 17+
* **Framework:** Spring Boot (Web, Data JPA)
* **Banco de Dados:** H2 Database (Banco em memória para desenvolvimento)
* **Gerenciador de Dependências:** Maven

## Atributos do Objeto 'Person'
Cada registro de pessoa no sistema contém:
- **Nome** (Ex: "João Silva")
- **Idade** (Ex: 25)
- **Profissão** (Ex: "Desenvolvedor")

## Endpoints da API
Abaixo estão as rotas principais para interagir com a aplicação:

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **GET** | `/persons/list` | Retorna a lista de todas as pessoas. |
| **POST** | `/persons/add` | Cria um novo registro de pessoa. |
| **PATCH** | `/persons/update` | Atualiza os dados de uma pessoa existente. |
| **DELETE** | `/persons/delete/{id}` | Remove uma pessoa do banco de dados. |

---

## Como Executar e Testar
Clone o repositório: git clone https://github.com/kpiresg/LearningSpring.git

Rode a aplicação: Abra o projeto na sua IDE e execute a classe principal ou use o comando: ./mvnw spring-boot:run

Acesse o Banco de Dados (H2 Console):

URL: http://localhost:8080/h2

JDBC URL: jdbc:h2:mem:banco

Usuário: admin (senha em branco)

## O que eu aprendi com este projeto
Estruturar uma API seguindo o padrão MVC (Model-View-Controller).

Como o Spring Data JPA facilita a criação de tabelas e consultas ao banco.

Como configurar e utilizar o banco H2 para desenvolvimento ágil.

O conceito de Injeção de Dependências do Spring.

-----------------------
Projeto criado para estudos de backend com Java e Spring.
-----------------------
