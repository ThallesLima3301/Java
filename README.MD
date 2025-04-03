API de Pedidos de E-commerce 🚀

Visão Geral

Este projeto consiste em uma API para gerenciamento de pedidos de e-commerce, utilizando Spring Boot e padrões de projeto como Factory Method, Strategy e Observer.

Motivos para Escolher Esse Projeto:

✅ Usa múltiplos padrões de projeto para um código modular e escalável.
✅ Tem aplicação prática e pode ser expandido para um sistema real.
✅ Integra com tecnologias populares como Spring Boot, Spring Data JPA e Spring Security.
✅ Possibilidade de futuras expansões, como um microserviço de estoque ou relatórios.

Arquitetura do Projeto 🏗️

A API é estruturada da seguinte forma:

🛒 Pedido (Order)

Representa um pedido feito pelo cliente.

🏭 Factory Method

Cria diferentes tipos de pedidos, como:

Pedido Comum

Pedido de Assinatura

Pedido Digital

💳 Strategy (Método de Pagamento)

Implementa diferentes estratégias para pagamento:

Cartão de Crédito

Boleto Bancário

Pix

📢 Observer (Notificações)

Notifica o cliente sobre mudanças no status do pedido via:

E-mail

SMS

Push Notification

Tecnologias Utilizadas 🛠️

✅ Spring Boot - Estrutura do projeto
✅ Spring Data JPA - Persistência de dados
✅ Spring Security (opcional) - Autenticação
✅ H2 Database - Banco de dados em memória (ótimo para testes rápidos)
✅ Lombok - Redução de código boilerplate
✅ MySQL/PostgreSQL - Banco de dados para produção
✅ REST Client (Postman/Insomnia) - Para testar endpoints da API

Como Rodar o Projeto 

1️⃣ Clonar o Repositório

git clone https://github.com/ThallesLima3301/Java.git
cd pedidos-api

2️⃣ Configurar Banco de Dados H2 (Padrão para Testes)

O banco de dados H2 é executado em memória por padrão. Para acessar a interface gráfica do H2:

Inicie a aplicação.

Acesse http://localhost:8080/h2-console

Use as credenciais:

JDBC URL: jdbc:h2:mem:testdb

Usuário: sa

Senha: (deixe em branco)

Caso queira usar MySQL ou PostgreSQL, configure no application.properties.

3️⃣ Executar a Aplicação

mvn spring-boot:run

A API rodará em http://localhost:8080.

4️⃣ Testar Endpoints com REST Client

Você pode testar os endpoints usando Postman ou Insomnia. Exemplo de requisição para criar um pedido com pagamento via cartão:

POST http://localhost:8080/pedidos/cartao

{
  "cliente": { "nome": "Maria Oliveira" },
  "valorTotal": 350.50
}

Conclusão 🎯

Durante o desenvolvimento enfrentamos desafios como configuração do Git, gerenciamento de submódulos e recuperação de arquivos apagados. No entanto, superamos essas dificuldades e conseguimos estruturar um projeto escalável e bem documentado. 

Se tiver dúvidas ou sugestões, fique à vontade para contribuir! 

