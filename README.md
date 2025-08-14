

---


# 📚 Sistema de Biblioteca em Java

Este projeto é um sistema simples de gerenciamento de livros em uma biblioteca, desenvolvido com foco em praticar conceitos de orientação a objetos em Java. Ele permite cadastrar livros, listar todos os livros disponíveis e buscar livros pelo título de forma flexível.

---

## 🧠 Objetivo do projeto

O principal objetivo é consolidar conhecimentos em:
- Criação de classes e objetos
- Manipulação de arrays
- Interação com o usuário via terminal
- Boas práticas de organização de código

---

## 🚀 Funcionalidades

- ✅ Cadastro de livros com título, autor, ano de publicação, preço e disponibilidade
- 📋 Listagem de todos os livros cadastrados
- 🔍 Busca por título com suporte a:
  - Parte do nome (não precisa digitar o título completo)
  - Maiúsculas/minúsculas ignoradas (ex: "harry" encontra "Harry Potter")

---

## 🛠️ Tecnologias utilizadas

- Java (JDK 17 ou superior recomendado)
- IDE de sua preferência (IntelliJ, Eclipse, VS Code, etc.)
- Terminal para execução via linha de comando

---

## 📦 Estrutura do projeto


📁 src/  
├── Livro.java         // Classe que representa um livro  
├── Biblioteca.java    // Classe que gerencia o acervo de livros  
└── Main.java          // Interface de interação com o usuário


---

## 📌 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/diogoneriscwb/Biblioteca
   ```

2. Compile os arquivos:
   ```bash
   javac src/*.java
   ```

3. Execute o programa:
   ```bash
   java src/Main
   ```

---

## ✨ Melhorias implementadas

- 🔡 Busca por título agora é **flexível**, permitindo encontrar livros mesmo com parte do nome e sem se preocupar com letras maiúsculas/minúsculas.
- 🧼 Código modular e fácil de expandir para novas funcionalidades (como busca por autor, empréstimos, histórico de leitura, etc.)
- 🧪 Validação simples de entrada para evitar erros comuns

---

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e compartilhar conforme desejar.

---

Feito com 💻 por [Diogo](https://github.com/diogoneriscwb)

