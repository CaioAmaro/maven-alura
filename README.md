# Aprendizados com Maven

Este repositório contém os aprendizados adquiridos ao longo das aulas sobre o uso do Maven em projetos Java. O objetivo é documentar o conhecimento obtido e servir como referência para futuros desenvolvimentos.

---

## ✅ Aula 1: Criando e Compreendendo um Projeto Maven

### O que foi aprendido:

- ✅ Como criar um projeto do zero utilizando o Maven.
- ✅ Estrutura de diretórios de um projeto Maven:
  - `src/main/java`: código-fonte da aplicação.
  - `src/main/resources`: arquivos de configuração e outros recursos.
  - `src/test/java`: testes automatizados.
  - `src/test/resources`: recursos utilizados nos testes.
  - `pom.xml`: arquivo principal de configuração do Maven.
- ✅ O Maven como ferramenta de:
  - Gerenciamento de dependências.
  - Organização da estrutura do projeto.
  - Processo de build (empacotamento da aplicação).
- ✅ Diferenças entre:
  - `groupId`: identificador único da organização.
  - `artifactId`: nome do projeto.

---

## ✅ Aula 2: Adicionando Bibliotecas e Utilizando Arquivos CSV

### O que foi aprendido:

- ✅ Como buscar bibliotecas no [MVN Repository](https://mvnrepository.com).
- ✅ Como incluir dependências no projeto via `pom.xml`.
- ✅ Configuração de repositórios externos no Maven.
- ✅ Desenvolvimento de um programa para:
  - Leitura de arquivos `.csv`.
  - Criação de objetos com base nos dados lidos.
- ✅ Desenvolvimento de uma funcionalidade de tradução de textos.

---

## ✅ Aula 3: Preparando o Build da Aplicação

### O que foi aprendido:

- ✅ Preparar a aplicação para o processo de build.
- ✅ Realizar o build:
  - Via IntelliJ.
  - Via terminal com o script `mvnw` do Spring Boot.
- ✅ Utilização de perfis Maven:
  - Perfil de produção.
  - Perfil de desenvolvimento.
- ✅ Comando útil:
  ```bash
  ./mvnw clean package -Pprod -DskipTests
  ```
  - `clean`: limpa os builds anteriores.
  - `package`: empacota a aplicação.
  - `-Pprod`: utiliza o perfil de produção.
  - `-DskipTests`: ignora os testes automatizados.

---

## ✅ Aula 4: Usando Plugins no Maven

### O que foi aprendido:

- ✅ Como utilizar plugins para estender o processo de build.
- ✅ Plugin PMD:
  - Análise estática de código.
  - Detecção de possíveis erros ou más práticas.
- ✅ Plugin Jacoco:
  - Análise de cobertura de testes.
- ✅ Configuração de proxy no arquivo `settings.xml` para permitir o download de dependências mesmo em ambientes com restrições de rede.

---

## ✅ Aula 5: Projetos com Múltiplos Módulos (Multi-module)

### O que foi aprendido:

- ✅ Como configurar múltiplos módulos em um projeto Maven.
- ✅ Ajustes necessários no `pom.xml` para suportar múltiplos módulos.
- ✅ Como o Maven facilita:
  - O gerenciamento de dependências entre módulos.
  - A construção de sistemas complexos de forma modular e organizada.

---

## 📁 Estrutura do Projeto (Exemplo)

```
meu-projeto/
│
├── modulo-principal/
│   └── src/
│
├── modulo-secundario/
│   └── src/
│
└── pom.xml (pai)
```

---

## 🚀 Conclusão

Com esses aprendizados, é possível estruturar e manter projetos Java de forma eficiente utilizando Maven, tanto em ambientes simples quanto complexos, com múltiplos módulos e perfis de execução.

---

📚 **Referências**:
- [Documentação oficial do Maven](https://maven.apache.org/)
- [MVN Repository](https://mvnrepository.com/)
