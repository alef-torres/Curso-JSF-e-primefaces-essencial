# Curso JSF e PrimeFaces Essencial

Este é um projeto de exemplo de uma aplicação web desenvolvida em Java, utilizando JSF e PrimeFaces. O objetivo do projeto é demonstrar os conceitos básicos e essenciais do desenvolvimento de aplicações web com essas tecnologias.

## Tecnologias Utilizadas

* **JavaServer Faces (JSF)**: Um framework web baseado em componentes para construir interfaces de usuário para aplicações web baseadas em Java.
* **PrimeFaces**: Uma popular biblioteca de componentes de UI para JSF, que fornece um rico conjunto de componentes para criar interfaces de usuário modernas e responsivas.
* **Contexts and Dependency Injection (CDI)**: Um padrão de injeção de dependência do Java EE que permite maior flexibilidade e desacoplamento do código.
* **Hibernate**: Um framework de mapeamento objeto-relacional (ORM) para persistência de dados em um banco de dados relacional.
* **MySQL**: O sistema de gerenciamento de banco de dados relacional utilizado no projeto.
* **Maven**: Uma ferramenta de automação de compilação e gerenciamento de dependências.

## Estrutura do Projeto

O projeto segue a estrutura padrão de um projeto web Java com Maven:

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── alef
│   │   │           └── erp
│   │   │               ├── controller  // Managed Beans do JSF
│   │   │               ├── model       // Entidades JPA
│   │   │               ├── repository  // Classes de acesso a dados (DAOs)
│   │   │               ├── service     // Lógica de negócio
│   │   │               └── util        // Classes utilitárias
│   │   ├── resources
│   │   │   └── META-INF
│   │   │       ├── persistence.xml // Configuração do JPA
│   │   │       └── sql
│   │   │           └── dados_iniciais.sql // Script para popular o banco
│   │   └── webapp
│   │       ├── *.xhtml         // Páginas JSF
│   │       ├── resources       // Recursos estáticos (CSS, imagens)
│   │       └── WEB-INF
│   │           ├── beans.xml       // Configuração do CDI
│   │           ├── faces-config.xml// Configuração do JSF
│   │           └── web.xml         // Deployment Descriptor da aplicação
└── pom.xml                     // Arquivo de configuração do Maven
```

## Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/curso-jsf-e-primefaces-essencial.git
   ```

2. **Configure o banco de dados:**
   - Crie um banco de dados MySQL com o nome `curso_jsf`.
   - Execute o script `src/main/resources/META-INF/sql/dados_iniciais.sql` para criar a tabela e popular o banco de dados com dados iniciais.
   - Atualize as informações de conexão com o banco de dados no arquivo `src/main/resources/META-INF/persistence.xml`.

3. **Compile e empacote o projeto:**
   ```bash
   mvn clean package
   ```

4. **Implante o arquivo .war:**
   - Faça o deploy do arquivo `target/curso-jsf-e-primefaces-essencial-0.0.1-SNAPSHOT.war` em um servidor de aplicação compatível com Servlet 3.1 (por exemplo, Tomcat 8 ou superior).

5. **Acesse a aplicação:**
   - Acesse a aplicação em seu navegador através da URL `http://localhost:8080/curso-jsf-e-primefaces-essencial/GestaoEmpresas.xhtml`.