# Contas-Crud
# Projeto Contas

## Descrição

Este projeto consiste em uma aplicação Spring Boot desenvolvida em Kotlin, implementando as operações básicas de um CRUD (Create, Read, Update, Delete) para a gestão de contas a pagar e a receber. A aplicação permite o registro, acompanhamento e gerenciamento estruturado de informações financeiras, **persistindo os dados em um banco de dados H2 em memória para desenvolvimento.**


## Tecnologias Empregadas

* **Linguagem de Programação:** Kotlin
* **Framework de Desenvolvimento:** Spring Boot
* **Persistência de Dados:** Spring Data JPA, Hibernate
* **Sistema de Gerenciamento de Banco de Dados:** H2 (configurado para ambiente de desenvolvimento)
* **Ferramenta de Build:** Maven
* **Biblioteca de Serialização/Desserialização JSON:** Jackson
* **Validação de Dados:** Jakarta Bean Validation


## Guia de Utilização

As instruções a seguir detalham o processo de configuração e execução da aplicação em um ambiente local.

### Pré-requisitos

* Instalação do Java Development Kit (JDK) versão 17 ou superior.
* Instalação da ferramenta de gerenciamento de build Maven.

### Procedimentos de Instalação

1.  **Clonar o Repositório (se aplicável):**
    ```bash
    git clone [https://github.com/dolthub/dolt](https://github.com/dolthub/dolt)
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

## Testes com Insomnia

Esta seção descreve como testar os endpoints da API utilizando o Insomnia, um cliente de API multiplataforma.

### Pré-requisitos

* **Instalação do Insomnia:** Caso não tenha o Insomnia instalado, você pode baixá-lo gratuitamente no site oficial: [Download Insomnia](https://insomnia.rest/download)

### Configuração das Requisições

Após instalar e abrir o Insomnia, você pode criar novas requisições para interagir com a API de Contas. Abaixo estão os detalhes dos endpoints disponíveis:

* **Obter o valor total das contas:**
    * **Método:** `GET`
    * **URL:** `http://localhost:8080/contas/total`
    * **Resposta (Exemplo - JSON):**
        ```json
        {
          "total": 1200.50
        }
        ```

* **Criar uma nova conta:**
    * **Método:** `POST`
    * **URL:** `http://localhost:8080/contas`
    * **Body (JSON Exemplo):**
        ```json
        {
          "etiqueta": "Conta de Luz",
          "dataVencimento": "2025-05-15",
          "url": "[https://www.companhiadeenergia.com.br/fatura](https://www.companhiadeenergia.com.br/fatura)",
          "pago": false,
          "valor": 85.50,
          "comentario": "Referente ao consumo de abril"
        }
        ```
    * **Resposta Esperada:** `201 Created` com o objeto da conta criada no corpo da resposta.

* **Listar todas as contas:**
    * **Método:** `GET`
    * **URL:** `http://localhost:8080/contas`
    * **Resposta Esperada:** `200 OK` com uma lista de objetos de conta no corpo da resposta ou `204 No Content` se não houver contas cadastradas.

* **Obter uma conta específica por ID:**
    * **Método:** `GET`
    * **URL:** `http://localhost:8080/contas/{id}` (substitua `{id}` pelo ID da conta desejada)
    * **Resposta Esperada:** `200 OK` com o objeto da conta no corpo da resposta ou `404 Not Found` se a conta não existir.

* **Atualizar uma conta existente por ID:**
    * **Método:** `PUT`
    * **URL:** `http://localhost:8080/contas/{id}` (substitua `{id}` pelo ID da conta a ser atualizada)
    * **Body (JSON Exemplo):**
        ```json
        {
          "etiqueta": "Conta de Luz - Maio",
          "dataVencimento": "2025-06-15",
          "url": "[https://www.companhiadeenergia.com.br/fatura/maio](https://www.companhiadeenergia.com.br/fatura/maio)",
          "pago": true,
          "valor": 92.75,
          "comentario": "Referente ao consumo de maio, paga com desconto"
        }
        ```
    * **Resposta Esperada:** `200 OK` com o objeto da conta atualizada no corpo da resposta ou `404 Not Found` se a conta não existir.

* **Filtrar contas por data de vencimento:**
    * **Método:** `GET`
    * **URL:** `http://localhost:8080/contas/filtro?dataVencimento=2025-05-15` (substitua a data desejada)
    * **Resposta Esperada:** `200 OK` com uma lista de contas com a data de vencimento especificada no corpo da resposta ou `204 No Content` se não houver contas com essa data.
        * **Observação:** Este endpoint atualmente filtra por uma data específica. Para obter as contas com as datas de vencimento mais próximas, a aplicação precisaria ser modificada conforme discutido anteriormente.

* **Excluir uma conta por ID:**
    * **Método:** `DELETE`
    * **URL:** `http://localhost:8080/contas/{id}` (substitua `{id}` pelo ID da conta a ser excluída)
    * **Resposta Esperada:** `204 No Content` se a conta foi excluída com sucesso ou `404 Not Found` se a conta não existir.

