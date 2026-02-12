🚀 Demo DAO JDBC

Projeto desenvolvido com foco em consolidar fundamentos sólidos de Java Backend, utilizando JDBC puro e aplicando o padrão de arquitetura DAO (Data Access Object).

A proposta do projeto é demonstrar domínio da camada de acesso a dados sem o uso de frameworks como JPA ou Spring Data, reforçando a base técnica essencial para aplicações corporativas.

🎯 Objetivo do Projeto

Construir uma aplicação Java estruturada em camadas, aplicando:

Conexão com banco de dados via JDBC

Implementação do padrão DAO

Operações completas de CRUD

Relacionamento entre entidades (Seller ↔ Department)

Tratamento de exceções personalizado

Organização limpa e escalável do código

🛠 Tecnologias Utilizadas

Java 17+

JDBC

MySQL

Eclipse IDE

Programação Orientada a Objetos (POO)

Padrão DAO

🏗 Arquitetura do Projeto

O projeto foi estruturado seguindo boas práticas de separação de responsabilidades:

application   → Classe principal (execução e testes)
entities      → Entidades do domínio (Seller, Department)
dao           → Interfaces DAO
dao.impl      → Implementações JDBC
db            → Conexão com banco e exceções customizadas


Essa organização facilita manutenção, testes e evolução do sistema.

📌 Funcionalidades Implementadas
🔹 Seller

Inserção de registro

Atualização de dados

Remoção por ID

Busca por ID

Busca por Departamento

Listagem completa

🔹 Department

Inserção

Atualização

Remoção

Busca por ID

Listagem completa

🗄 Modelo Relacional

O sistema trabalha com duas entidades principais:

Department

Seller (relacionado a Department via chave estrangeira)

O relacionamento reforça conceitos de integridade referencial e mapeamento manual de objetos via JDBC.

⚙️ Configuração do Banco de Dados

As credenciais de conexão devem ser configuradas no arquivo:

db.properties

Exemplo:

user=seu_usuario
password=sua_senha
dburl=jdbc:mysql://localhost:3306/seu_banco
useSSL=false

▶️ Como Executar o Projeto

Clonar o repositório

Importar como projeto Java no Eclipse

Criar o banco de dados MySQL

Configurar o arquivo db.properties

Executar a classe Program

📚 Principais Aprendizados

Controle manual de conexões JDBC

Uso de PreparedStatement

Manipulação de ResultSet

Separação de camadas (Application → DAO → DB)

Tratamento adequado de exceções

Estruturação profissional de projeto backend

💼 Sobre o Projeto

Este projeto faz parte da minha jornada de aprofundamento em Java Backend, consolidando fundamentos essenciais antes da utilização de frameworks como Spring Boot.

Ele demonstra domínio dos conceitos base que sustentam aplicações corporativas e reforça minha evolução na construção de sistemas estruturados e bem organizados.

👨‍💻 Autor

Lucileudo Lopes
Estudante de Análise e Desenvolvimento de Sistemas
Foco em Java Backend
