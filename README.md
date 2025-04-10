# Contas-Crud
# Projeto Contas

## Descrição

Este projeto consiste em uma aplicação Spring Boot desenvolvida em Kotlin, implementando as operações básicas de um CRUD (Create, Read, Update, Delete) para a gestão de contas a pagar e a receber. A aplicação permite o registro, acompanhamento e gerenciamento estruturado de informações financeiras, **persistindo os dados em um banco de dados real e não utilizando dados mockados.**

[**Inclua aqui uma descrição mais detalhada das funcionalidades específicas da sua aplicação.** Detalhe os tipos de operações CRUD suportadas para as entidades (se houver mais de uma), e quaisquer funcionalidades adicionais relevantes.]

## Tecnologias Empregadas

* **Linguagem de Programação:** Kotlin
* **Framework de Desenvolvimento:** Spring Boot
* **Persistência de Dados:** Spring Data JPA, Hibernate
* **Sistema de Gerenciamento de Banco de Dados:** H2 (configurado para ambiente de desenvolvimento)
* **Ferramenta de Build:** Maven
* **Biblioteca de Serialização/Desserialização JSON:** Jackson
* **Validação de Dados:** Jakarta Bean Validation

[**Caso outras tecnologias ou bibliotecas tenham sido utilizadas, liste-as aqui.**]

## Guia de Utilização

As instruções a seguir detalham o processo de configuração e execução da aplicação em um ambiente local.

### Pré-requisitos

* Instalação do Java Development Kit (JDK) versão 17 ou superior.
* Instalação da ferramenta de gerenciamento de build Maven.

### Procedimentos de Instalação

1.  **Clonar o Repositório (se aplicável):**
    ```bash
    git clone [https://docs.github.com/articles/referencing-and-citing-content](https://docs.github.com/articles/referencing-and-citing-content)
    cd projeto-contas
    ```

2.  **Compilar o Projeto utilizando o Maven:**
    ```bash
    ./mvnw clean install
    ```
    ou
    ```bash
    mvn clean install
    ```

3.  **Executar a Aplicação Spring Boot:**
    A aplicação pode ser iniciada diretamente através da sua IDE de desenvolvimento (como IntelliJ IDEA) ou utilizando o plugin do Spring Boot no Maven:
    ```bash
    ./mvnw spring-boot:run
    ```
    ou
    ```bash
    mvn spring-boot:run
    ```

    Após a execução, a aplicação estará acessível através do endereço `http://localhost:8080` (a porta padrão pode ser configurada conforme a necessidade).

##
