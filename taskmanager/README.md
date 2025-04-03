# Task Manager API

## Descrição do Projeto

Este projeto é uma API RESTful para gerenciamento de tarefas, construída com **Spring Boot**. A API permite criar, listar, atualizar e excluir tarefas, além de incluir regras de validação para os dados recebidos.

## Tecnologias Utilizadas
- **Java 21** (LTS)
- **Spring Boot** (Web, Data JPA, DevTools)
- **Lombok**
- **Banco de Dados H2** (em memória para testes)
- **Maven** (para gerenciamento de dependências)
- **Jakarta Validation** (para validação de dados)

## Funcionalidades Implementadas
- [x] Criar uma nova tarefa
- [x] Listar todas as tarefas
- [x] Buscar uma tarefa por ID
- [x] Atualizar uma tarefa
- [x] Excluir uma tarefa
- [x] Validação de dados no DTO
- [x] Tratamento global de exceções

## Estrutura do Projeto
```
/src/main/java/com/thalles/taskmanager
│── controller  → Contém os endpoints da API
│── dto         → Contém os objetos de transferência de dados (DTOs)
│── model       → Contém as entidades do banco de dados
│── repository  → Contém a camada de persistência (JPA Repository)
│── service     → Contém a lógica de negócios da aplicação
│── exception   → Contém o tratamento global de erros
```

## Endpoints da API
### Criar uma Tarefa
**POST** `/tasks`
```json
{
  "title": "Finalizar projeto",
  "description": "Finalizar implementação da API Task Manager",
  "completed": false
}
```

### Listar Todas as Tarefas
**GET** `/tasks`

### Buscar Tarefa por ID
**GET** `/tasks/{id}`

### Atualizar uma Tarefa
**PUT** `/tasks/{id}`
```json
{
  "title": "Atualizado",
  "description": "Descrição atualizada",
  "completed": true
}
```

### Excluir uma Tarefa
**DELETE** `/tasks/{id}`

## Desafios e Dificuldades
Durante o desenvolvimento, enfrentamos alguns desafios:
1. **Configuração do Lombok**: Inicialmente, houve problemas ao reconhecer as anotações do Lombok, resolvidos ativando a opção "Annotation Processing" no IntelliJ/VSCode.
2. **Validação de Dados (@Valid)**: Esquecemos de adicionar `@Valid` nos métodos do `Controller`, o que impedia a validação do DTO.
3. **Maven não reconhecido**: Tivemos um problema ao rodar `mvn spring-boot:run`, resolvido ao usar `./mvnw spring-boot:run` na raiz do projeto.
4. **Tratamento de Erros**: Implementamos um **GlobalExceptionHandler** para capturar erros e padronizar as respostas de erro da API.

## Como Executar o Projeto
```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/taskmanager.git

# Navegar para o diretório do projeto
cd taskmanager

# Executar a aplicação
./mvnw spring-boot:run
```
A API estará disponível em: `http://localhost:8080/tasks`

---
**Desenvolvido por Thalles Ricardo De Lima** 
