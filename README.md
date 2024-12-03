# Projeto: Web Services com Spring Boot e JPA/Hibernate

Este projeto foi desenvolvido como parte do curso completo de Java e tem como objetivo a criação de uma aplicação de web services utilizando **Spring Boot** e **JPA/Hibernate**. O projeto aborda conceitos fundamentais de desenvolvimento backend, como estruturação de camadas lógicas, integração com banco de dados e manipulação de dados via API RESTful.

## 📖 Sobre o Projeto

A aplicação implementa funcionalidades básicas de um sistema de gerenciamento de usuários, pedidos e produtos. O projeto é estruturado com foco em boas práticas, incluindo:

- Criação de entidades de domínio e mapeamento JPA.
- Implementação de operações CRUD (Create, Retrieve, Update, Delete).
- Camadas de **Resource**, **Service** e **Repository** para organização do código.
- Configuração de banco de dados para desenvolvimento e testes (H2 e PostgreSQL).
- Tratamento de exceções e respostas padronizadas para a API.

## Modelo do Domínio
![image](https://github.com/user-attachments/assets/e1f06e98-eae4-4c2b-b164-2aa7df5c1657)

## Modelo da instância
![image](https://github.com/user-attachments/assets/411eaa4f-003a-4c94-814a-cede564efe16)

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3+**
- **JPA / Hibernate**
- **Banco de Dados H2 (ambiente de teste)**
- **PostgreSQL (opcional para produção)**
- **Maven**
- **Postman** (para testar os endpoints)

## 🗂️ Estrutura do Projeto

O projeto segue uma arquitetura bem definida com as seguintes camadas:

- **Entities**: Representação das entidades do sistema.
- **Repository**: Acesso e manipulação de dados no banco.
- **Service**: Regras de negócio e lógica intermediária.
- **Resource**: Endpoints da API REST.

Além disso, o projeto implementa associações como "um-para-muitos" e "muitos-para-muitos", utilizando tabelas intermediárias e atributos extras.

## 🚀 Como Executar a Aplicação

### Pré-requisitos

- Java 17 ou superior instalado.
- Maven configurado no ambiente.
- Banco de dados PostgreSQL (opcional para produção).

### Passos para Execução

1. **Clonar o repositório**:
   ```bash
   git clone https://github.com/acenelio/workshop-springboot2-jpa.git
   cd workshop-springboot2-jpa
   ```
2. 🔧 **Configurar o Banco de Dados**

- **Para testes**: O banco H2 já está configurado no arquivo `application-test.properties`.
- **Para produção**: Configure o PostgreSQL no arquivo `application-dev.properties`.

3. 🏗️ **Compilar e Executar**

Execute o seguinte comando no terminal para iniciar a aplicação:

```bash
mvn spring-boot:run
```

## 🌐 Acessar a Aplicação

- **Console H2 (modo teste)**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **Endpoints da API**: [http://localhost:8080](http://localhost:8080)

## 🧪 Testes  

A aplicação contém exemplos de entidades e endpoints para testes, incluindo:

- Inserção, atualização e remoção de usuários.
- Associação entre pedidos, produtos e categorias.
- Cálculo de totais e subtotais de pedidos.

## ✍️ Autor

**[Jonathan Eichenbeger](https://www.linkedin.com/in/jonathan-eichenberger/)**

Desenvolvido como parte do curso de Java oferecido por [Udemy-curso-java-completo](https://www.udemy.com/course/java-curso-completo).



  
