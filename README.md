# Cadastro de Medicamentos JSF JPA 💊

Este projeto é um sistema de **cadastro de medicamentos** desenvolvido utilizando **JSF** (JavaServer Faces), **PrimeFaces**, **CDI** (Contexts and Dependency Injection), **Hibernate** e **PostgreSQL**. A aplicação permite o cadastro e gerenciamento de informações de medicamentos de forma simples e eficiente.

🎨 Imagem do Site
Aqui está uma imagem que representa a interface do sistema:

![Tela Crud Medicamentos](imagens/Tela Crud Medicamentos.png)


## 📑 Funcionalidades

- Cadastro de medicamentos, com campos como nome, apresentação, laboratório, registro MS e preço.
- Listagem de medicamentos cadastrados com opções de edição e exclusão.
- Validação de campos obrigatórios e mensagens de erro amigáveis.
- Interface intuitiva e fácil de usar, desenvolvida com PrimeFaces.

---

## ⚙️ Estrutura do Projeto

O projeto é estruturado da seguinte forma:

- **persistence.xml** - Configurações de conexão com o banco de dados.
- **Faces** - Arquivos JSF para construção das páginas de visualização e interação.
- **DAO** - Objetos de acesso a dados para interação com o banco de dados usando Hibernate.
- **Services** - Lógica de negócios da aplicação.
- **Model** - Definições de entidades (por exemplo, Medicamento).


## 🛠️ Tecnologias e Bibliotecas Utilizadas

- **Java 21** - Versão do Java utilizada para desenvolver a aplicação.
- **PrimeFaces 14.0.0** - Biblioteca para construção de interfaces ricas e interativas.
- **JSF 3.0.0 (Mojarra)** - Framework para construção de aplicações web baseadas em Java.
- **CDI 4.0.1** - Para injeção de dependências.
- **Hibernate 6.3.1** - Framework ORM (Object-Relational Mapping) para persistência de dados.
- **PostgreSQL 42.7.2** - Banco de dados relacional utilizado para armazenar as informações.
- **Jakarta EE 10** - Conjunto de especificações para desenvolvimento de aplicações corporativas em Java.
- **JPA (Jakarta Persistence API)** - API para trabalhar com persistência de dados.
- **JDBC** - Conexão do banco de dados com o PostgreSQL.

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




