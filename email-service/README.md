# Viasoft Email — Desafio Backend

API desenvolvida por **Lucas Bassanesi** para o desafio técnico da Viasoft.  
O sistema recebe dados de e-mail via POST, adapta para o modelo AWS ou OCI conforme configuração, serializa em JSON e imprime no console.

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot 4.0.1
- Spring Web MVC
- Spring Validation
- Lombok
- Jackson
- Mockito
- JUnit 4
- Maven

---

## ✔️ Como executar

### 🔧 Pré-requisitos
- Java 17 instalado
- Maven instalado

### ▶️ Passo a passo
```bash
# Clonar o repositório
git clone <url-do-repositorio>

# Entrar no diretório do projeto
cd viasoft-email

Executar a aplicação:
mvn spring-boot:run

A aplicação iniciará por padrão em: http://localhost:8080

# 📧 Serviço de Integração de E-mail

Este projeto disponibiliza uma API para o envio de e-mails utilizando diferentes provedores de integração.

## 🚀 Processo de Execução

Por padrão, a aplicação é executada localmente no seguinte endereço:
> **URL Base:** `http://localhost:8080`

---

## 🛠️ Como Utilizar

Para realizar um envio, utilize o **Postman**, **Insomnia** ou qualquer ferramenta de requisições HTTP de sua preferência.

### 1. Endpoint e Parâmetros
A requisição deve ser enviada para a URL abaixo, informando o provedor desejado via *Query Parameter*:

* **Método:** `POST`
* **URL:** `http://localhost:8080/email?mail.integracao=AWS`

### 2. Formato do JSON (Body)
No corpo da requisição, selecione a opção **raw** e o tipo **JSON**. Utilize o seguinte formato:

```json
{
  "emailDestinatario": "cliente@teste.com",
  "nomeDestinatario": "João da Silva",
  "emailRemetente": "empresa@teste.com",
  "assunto": "Bem-vindo!",
  "conteudo": "Seu cadastro foi realizado com sucesso."
}
