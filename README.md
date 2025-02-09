# Cadastro de Medicamentos JSF JPA 💊

Este projeto é um sistema de **cadastro de medicamentos**, a aplicação permite o cadastro e gerenciamento de informações de medicamentos de forma simples e eficiente. Desenvolvido utilizando **JSF** (JavaServer Faces), **PrimeFaces**, **CDI** (Contexts and Dependency Injection), **Hibernate** e **PostgreSQL**

#🎨 Imagens do Site  

### Interface de medicamento 💊

![Tela Crud Medicamentos](https://github.com/CauZy-Goes/Cadastro_Medicamentos_JSF_JPA/blob/main/screen_imgs/tela_medicamento.png)

### Interface de Laboratório🔬

![Tela Crud laboratórios](https://github.com/CauZy-Goes/Cadastro_Medicamentos_JSF_JPA/blob/main/screen_imgs/Tela_Laboratorio.png)


## 📑 Funcionalidades

- Cadastro de medicamentos, com campos como nome, apresentação, laboratório, registro MS e preço.
- Listagem de medicamentos cadastrados com opções de edição e exclusão.
- Validação de campos obrigatórios e mensagens de erro amigáveis.
- Interface intuitiva e fácil de usar, desenvolvida com PrimeFaces.
- Cadastro de laboratórios, com campos como nome, CNPJ, endereço, telefone, e e-mail.
- Relacionamento OneToMany entre medicamento e laboratório, onde cada medicamento é vinculado a um laboratório específico.
- Listagem e edição dos laboratórios cadastrados.

---

## ⚙️ Estrutura do Projeto

O projeto é estruturado da seguinte forma:

- **persistence.xml** - Configurações de conexão com o banco de dados.
- **Faces** - Arquivos JSF para construção das páginas de visualização e interação.
- **DAO** - Objetos de acesso a dados para interação com o banco de dados usando Hibernate.
- **Services** - Lógica de negócios da aplicação.
- **Model** - Definições de entidades (por exemplo, Medicamento, Laboratorio).
- **DTO** - Objetos de Transferência de Dados (utilizando MapStruct para conversão entre entidades e DTOs).

---

## 🛠️ Tecnologias e Bibliotecas Utilizadas

- **Java 21** - Versão do Java utilizada para desenvolver a aplicação.
- **PrimeFaces 15.0.0** - Biblioteca para construção de interfaces ricas e interativas.
- **JSF 4.0.2 (Mojarra)** - Framework para construção de aplicações web baseadas em Java.
- **CDI 4.0.2** - Para injeção de dependências.
- **Hibernate 6.4.0.Final** - Framework ORM (Object-Relational Mapping) para persistência de dados.
- **PostgreSQL 42.7.4** - Banco de dados relacional utilizado para armazenar as informações.
- **Jakarta EE 10** - Conjunto de especificações para desenvolvimento de aplicações corporativas em Java.
- **JPA (Jakarta Persistence API)** - API para trabalhar com persistência de dados.
- **JDBC** - Conexão do banco de dados com o PostgreSQL.
- **MapStruct 1.6.3.Final** - Para criação de DTOs de forma eficiente e simplificada.
- **GlassFish 7.0.21** - Servidor de aplicações para hospedar a aplicação web.

  
---

## 📦 Como Usar

Para rodar a aplicação localmente, siga os passos abaixo:

1. **Clone o repositório**:
   
   ```bash
   git clone https://github.com/SEU_USUARIO/Cadastro_Medicamentos_JSF_JPA.git
   
2. **Configuração do Banco de Dados**:
   
   - Instale o PostgreSQL na sua máquina.
   - Configure a conexão no `persistence.xml`.

3. **Build do projeto**:
   
   Execute o comando Maven para compilar o projeto:

   ```bash
   mvn clean install

4. **Deploy**:

   - Importe o projeto no servidor GlassFish ou outro servidor compatível com Jakarta EE.
   - Acesse a aplicação pelo navegador em: [http://localhost:8080/Cadastro_Medicamentos_JSF_JPA](http://localhost:8080/Cadastro_Medicamentos_JSF_JPA)

---

## 💡 Como Contribuir

1. Fork o repositório.
2. Crie uma branch para a sua feature:
   
   ```bash
   git checkout -b minha-feature

3. Faça o commit das suas mudanças:
   
   ```bash
   git commit -m 'Adicionando nova feature'

4. Envie para o seu repositório forkado:
   
   ```bash
   git push origin minha-feature

5. Abra um Pull Request para o repositório principal.

---

## 🧑‍💻 Desenvolvedor

Feito com 💙 por Cauã Farias

