package model;

import utils.Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe de apoio.
 * Auxilia pré carregando algumas listas.
 */
public class Settings {

    /**
     * Retorna a lista com todas as aulas livres do bootcamp.
     *
     * @return Retorna a lista com as aulas do bootcamp.
     */
    public List<Lesson> getLessonList() {
        int i = 5000;
        List<String> subTopic = Arrays.asList(
                "Sub_tópico_1",
                "Sub_tópico_3",
                "Sub_tópico_3");

        List<Lesson.Topic> topicList = Arrays.asList(
                new Lesson.Topic("Tópico 1", subTopic),
                new Lesson.Topic("Tópico 2", subTopic),
                new Lesson.Topic("Tópico 3", subTopic)
        );

        List<Lesson> lessonList = new ArrayList<>();

        lessonList.add(new Lesson(i++, "Fundamentos de Orientação a Objetos com Kotlin", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento Mobile Nativo Para Android", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Componentes, Layouts e UI/UX Em Apps Android", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Java e Kotlin Juntos!? Construindo Apps Android", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Explorando o Firebase Para Apps Android Resilientes", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução ao Angular 8", "<Breve descrição>", Level.BASIC, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "A arquitetura de componentes e a gestão da complexidade no front-end", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Técnicas avançadas em Angular 8", "<Breve descrição>", Level.INTERMEDIATE, 8, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Aplicações avançadas com Angular", "<Breve descrição>", Level.ADVANCED, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Conceitos avançados de performance e otimização usando Angular", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Implementando testes automatizados usando Cypress em uma aplicação Angular", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Trabalhando com Páginas SPA com Angular", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Instalando e Preparando o Ambiente Angular", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Explorando Diretivas com Angular", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Implementando Serviços e Injeção de Dependências com Angular", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a Serviços Assíncronos no Angular", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "O Poder do Data Binding no Angular", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Trabalhando com Componentes em Angular", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criação de Pipes com Angular", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Aprenda o que são Estrutura de Dados e Algoritmos", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Fundamentos de Arquitetura de Sistemas", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Arquitetura de dados essencial", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução ao HTTP/HTTPS", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Arquitetura de Sistemas avançado", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução aos Conceitos de API e Clean Architecture", "<Breve descrição>", Level.ADVANCED, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Primeiros passos com AWS", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução prática a computação em nuvem usando AWS", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criando uma Aplicação Serverless na AWS", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Orquestrando Big Data em Ambiente de Nuvem", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criando uma API REST Conectada ao Amazon RDS com Java", "<Breve descrição>", Level.ADVANCED, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criando um Microsserviço de Upload de Imagens com o Amazon S3", "<Breve descrição>", Level.ADVANCED, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a mensageria na Azure", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Configuração e Deploy na nuvem Microsoft Azure Cloud", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criando API Gateways no ambiente Azure Spring Cloud", "<Breve descrição>", Level.ADVANCED, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução ao MongoDB e Bancos de Dados NoSQL", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a PostgreSQL", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Conceitos e melhores práticas com bancos de dados PostgreSQL", "<Breve descrição>", Level.BASIC, 9, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "SQL SERVER - Criando suas primeiras consultas", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Modelando um banco de dados na prática com SQL SERVER", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "MySql - Trabalhando com as suas primeiras tabelas", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "MySql - Explorando relacionamentos com workbench", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "MySQL - Consultas com Join", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "SQL Server: Boas práticas em bancos relacionais", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a orquestração de contêineres com Docker", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Mentalidade Empreendedora", "<Breve descrição>", Level.BASIC, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Fundamentos do Intraempreendedorismo", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Fundamentos de Negócios Digitais Escaláveis", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criação de Soluções Inovadoras", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Modelagem de Negócios", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Fundamentos para a Criação de Produtos Digitais", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Estratégia de Negócios com OKR", "<Breve descrição>", Level.BASIC, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Estratégias para Captação de Investimentos", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Liderança de Negócios com Cultura Ágil", "<Breve descrição>", Level.INTERMEDIATE, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Inovação Aberta e Ecossistema de Inovação", "<Breve descrição>", Level.BASIC, 8, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Primeiros passos com Dart", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Trabalhando com variáveis e condicionais no Dart", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Primeiros passos com Flutter", "<Breve descrição>", Level.BASIC, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Flutter Prático: criando um aplicativo do zero", "<Breve descrição>", Level.ADVANCED, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Projetos ágeis com SCRUM", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução ao Git e ao GitHub", "<Breve descrição>", Level.BASIC, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Trabalhando com Branches no GitHub", "<Breve descrição>", Level.INTERMEDIATE, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Git e GitHub Focado em PullRequest", "<Breve descrição>", Level.INTERMEDIATE, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Trabalhando com Git e GitLab na prática", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Primeiros passos para desenvolvimento web", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Lógica de Programação Essencial", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a criação de websites com HTML5 e CSS3", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Construindo páginas para internet com Bootstrap", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Conceitos de responsividade e experiência do usuário", "<Breve descrição>", Level.INTERMEDIATE, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Posicionando elementos com Flexbox em CSS", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Posicionando elementos com Flexbox em CSS", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Dominando IDEs Java", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "IDE Instalação e Configuração (Visual Studio Code)", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Instalando e Configurando seu Ambiente Node.js", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desmistificando o Android Studio na Prática", "<Breve descrição>", Level.INTERMEDIATE, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Configurando Ambiente de Desenvolvimento Java no Linux", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Instalando o Visual Studio e SDK", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Pensamento Computacional", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Primeiros Passos Para Começar a Programar", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Dominando IDEs Java", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução ao Ecossistema e Documentação Java", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Configurando Ambiente de Desenvolvimento Java no Linux", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Variáveis, Tipos de Dados e Operadores Matemáticos em Java", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Entendendo Métodos Java", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Lógica Condicional e Controle de Fluxos em Java", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Estruturas de Repetição e Arrays em Java", "<Breve descrição>", Level.BASIC, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Reforçando o Conceito de Laços em Java", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Estrutura de dados em Java", "<Breve descrição>", Level.INTERMEDIATE, 10, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Estruturas de Dados em Java: Introdução", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Estruturas de Dados em Java: Pilhas e Filas", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Estruturas de Dados em Java: Listas", "<Breve descrição>", Level.BASIC, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Estruturas de Dados em Java: Árvores", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Estruturas de Dados em Java: Principais Implementações", "<Breve descrição>", Level.INTERMEDIATE, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Trabalhando com Collections Java", "<Breve descrição>", Level.INTERMEDIATE, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Implementando Collections e Streams com Java", "<Breve descrição>", Level.INTERMEDIATE, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a orientação a objetos com Java", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Tratamento de Exceções em Java", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Debugging Java", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento básico em Java", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento avançado em Java", "<Breve descrição>", Level.ADVANCED, 8, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Gerenciamento de Dependências e Build em Java com Maven", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Entrada e Saída de Arquivos (I/O) em Java", "<Breve descrição>", Level.INTERMEDIATE, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Projetos Java com Gradle", "<Breve descrição>", Level.INTERMEDIATE, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Trabalhando com Banco de Dados utilizando JDBC e JPA", "<Breve descrição>", Level.INTERMEDIATE, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "JPA com Hibernate", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução ao Spring Framework", "<Breve descrição>", Level.BASIC, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a sistemas de mensagerias com Java", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Microsserviços em Spring Cloud com Java", "<Breve descrição>", Level.INTERMEDIATE, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução ao framework Spring Boot", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Simplificando Projetos Java com o Spring Boot", "<Breve descrição>", Level.BASIC, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Imersão no Spring Framework com Spring Boot", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Aumente sua Produtividade com Spring Boot e Lombok", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Adicionando Segurança a uma API REST com Spring Security", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criando uma API REST Documentada com Spring Web e Swagger", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a JSF para aplicação web", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Programação reativa com Spring Web Flux", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Domine o Estilo Arquitetural REST com o Spring Web", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Aprenda a aplicar testes com Java", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criando aplicações web com Spring Web MVC", "<Breve descrição>", Level.INTERMEDIATE, 7, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a microsserviços", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criando API Gateways no ambiente Azure Spring Cloud", "<Breve descrição>", Level.ADVANCED, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução aos Conceitos de API e Clean Architecture", "<Breve descrição>", Level.ADVANCED, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a Behavior Driven Development (BDD) com Java", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Simplificando Projetos Java com o Spring Boot", "<Breve descrição>", Level.BASIC, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a microsserviços", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Spring AMQP com RabbitMQ", "<Breve descrição>", Level.ADVANCED, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Sintaxe Básica em JavaScript", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Programação para internet com JavaScript", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "JavaScript ES6 essencial", "<Breve descrição>", Level.INTERMEDIATE, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento avançado com JavaScript ES6", "<Breve descrição>", Level.ADVANCED, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução à biblioteca jQuery", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento Mobile Nativo Para Android", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Componentes, Layouts e UI/UX Em Apps Android", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Java e Kotlin Juntos!? Construindo Apps Android", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Explorando o Firebase Para Apps Android Resilientes", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desmistificando o Android Studio na Prática", "<Breve descrição>", Level.INTERMEDIATE, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Arquitetura MVVM na prática", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a Arquitetura Hexagonal com Spring Boot e Kotlin", "<Breve descrição>", Level.ADVANCED, 6, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Linux: Introdução ao Sistema Operacional e Terminal", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Linux: Diretórios e Comandos Essenciais", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Linux: Fundamentos de Redes e Comandos avançados", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Linux: Controle de Usuários e (Des)Compactação de Arquivos", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Linux: Gerenciamento de Pacotes", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Linux: A introdução ao sistema operacional", "<Breve descrição>", Level.BASIC, 10, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Shell script - Manipulando Arquivos", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução ao Node.js com Express", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Primeiros passos com .NET", "<Breve descrição>", Level.BASIC, 7, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento back-end com Node.js", "<Breve descrição>", Level.INTERMEDIATE, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento de aplicações com .NET", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Orientação a objetos em .NET", "<Breve descrição>", Level.INTERMEDIATE, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criando uma API REST com Node.js e TypeORM", "<Breve descrição>", Level.INTERMEDIATE, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Configuração da arquitetura back-end com .NET Core", "<Breve descrição>", Level.ADVANCED, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Configuração da Arquitetura do front-end", "<Breve descrição>", Level.ADVANCED, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvendo sua aplicação com C# usando DDD", "<Breve descrição>", Level.ADVANCED, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Aplicando design patterns na prática com C#", "<Breve descrição>", Level.INTERMEDIATE, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Configuração e Deploy na nuvem Microsoft Azure Cloud", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Configuração da Suíte de testes e aplicando testes integrados em .NET", "<Breve descrição>", Level.ADVANCED, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Instalando o Visual Studio e SDK", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvendo sua aplicação com C# usando SOLID", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a Design Patterns com .NET", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a microsserviços com .NET", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Trabalhando com chatbots com .NET", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento mobile com .NET MAUI", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução ao Entity framework", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a Clean Code e SOLID com .NET e C#", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Deploy de aplicações .Net Core com ambiente Dockerizado", "<Breve descrição>", Level.BASIC, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Continuous Integration (CI) e Continuous Delivery(CD) na prática com .NET", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução ao PHP", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Formulários com condicionais e sessões com PHP", "<Breve descrição>", Level.BASIC, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Conhecendo funções e validação de dados com PHP", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Orientação a objetos, exceções e banco de dados PHP", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento avançado em PHP", "<Breve descrição>", Level.ADVANCED, 10, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução à programação com Python", "<Breve descrição>", Level.BASIC, 8, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento para Internet e Banco de Dados com Python e Django", "<Breve descrição>", Level.INTERMEDIATE, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento avançado Python com Flask e REST API", "<Breve descrição>", Level.ADVANCED, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Segurança da informação com Python", "<Breve descrição>", Level.INTERMEDIATE, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a Qualidade de Software", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criando uma API REST com Node.js e TypeORM", "<Breve descrição>", Level.INTERMEDIATE, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução ao ReactJS", "<Breve descrição>", Level.BASIC, 3, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Trabalhando com Componentes em React", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Práticas avançadas em projetos com ReactJS", "<Breve descrição>", Level.ADVANCED, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvimento de aplicações para internet com ReactJS", "<Breve descrição>", Level.INTERMEDIATE, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução a Redux com ReactJS", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Introdução aos React Hooks", "<Breve descrição>", Level.INTERMEDIATE, 5, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Criando aplicações móveis multiplataforma com React Native", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvendo aplicativos móveis com Redux e React Native", "<Breve descrição>", Level.INTERMEDIATE, 7, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i++, "Desenvolvendo aplicativos móveis com React Native com Firebase", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        lessonList.add(new Lesson(i, "React: Trabalhando com componentes encadeados", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));

        return lessonList;
    }

    /**
     * Retorna a lista com todos os projetos livres.
     *
     * @return Retorna a lista com os projetos do bootcamp.
     */
    public List<Project> getProjectList() {
        int i = 4000;

        List<Project.Step> stepList = Arrays.asList(
                new Project.Step("Apresentação"),
                new Project.Step("Passo 1"),
                new Project.Step("Passo 2"),
                new Project.Step("Passo 3"),
                new Project.Step("Passo 4"),
                new Project.Step("Passo 5"),
                new Project.Step("Passo 6"),
                new Project.Step("Passo 7"),
                new Project.Step("Conclusão")
        );

        List<Project> projectList = new ArrayList<>();
        projectList.add(new Project(i++, "Criando seu Primeiro Repositório no GitHub Para CompartilharSeu Progresso", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", stepList));
        projectList.add(new Project(i++, "Criando um Banco Digital com Java e Orientação a Objetos", "<Breve descrição>", Level.INTERMEDIATE, 1, "<Instrutor(a) - Tech Expert>", stepList));
        projectList.add(new Project(i++, "Criando um App de Cartão de Visitas em Kotlin", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", stepList));
        projectList.add(new Project(i++, "Criando um App para Apresentar seu Portfólio do GitHub", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", stepList));
        projectList.add(new Project(i++, "Recriando a página inicial do Instagram", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", stepList));
        projectList.add(new Project(i++, "Recriando a Interface do Netflix", "<Breve descrição>", Level.ADVANCED, 4, "<Instrutor(a) - Tech Expert>", stepList));
        projectList.add(new Project(i++, "Recriando o jogo da cobrinha com JavaScript", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", stepList));
        projectList.add(new Project(i++, "Desenvolvendo um sistema de gerenciamento de pessoas em API", "<Breve descrição>", Level.INTERMEDIATE, 6, "<Instrutor(a) - Tech Expert>", stepList));
        projectList.add(new Project(i++, "Crie seu gerenciador de salas de reuniões com Java e Angular", "<Breve descrição>", Level.INTERMEDIATE, 6, "<Instrutor(a) - Tech Expert>", stepList));
        projectList.add(new Project(i, "Desenvolvimento de testes unitários para validar uma API REST", "<Breve descrição>", Level.ADVANCED, 5, "<Instrutor(a) - Tech Expert>", stepList));

        return projectList;
    }

    /**
     * Retorna a lista com todos os bootcamps.
     *
     * @return Retorna a lista dos bootcamps.
     */
    public List<Bootcamp> getBootcampList() {
        List<Bootcamp> bootcampList = new ArrayList<>();

        bootcampList.add(getBootcampSportheca());
        bootcampList.add(getBootcampHtmlWebDeveloper());
        bootcampList.add(getBootcampJavaDeveloper());

        return bootcampList;
    }

    /**
     * Bootcamp Sportheca.
     *
     * @return Retorna o Bootcamp Sportheca.
     */
    private Bootcamp getBootcampSportheca() {
        int i = 3000;
        List<String> subTopic = Arrays.asList(
                "Sub_tópico_1",
                "Sub_tópico_3",
                "Sub_tópico_3");

        List<Lesson.Topic> topicList = Arrays.asList(
                new Lesson.Topic("Tópico 1", subTopic),
                new Lesson.Topic("Tópico 2", subTopic),
                new Lesson.Topic("Tópico 3", subTopic)
        );

        List<Project.Step> stepList = Arrays.asList(
                new Project.Step("Apresentação"),
                new Project.Step("Passo 1"),
                new Project.Step("Passo 2"),
                new Project.Step("Passo 3"),
                new Project.Step("Passo 4"),
                new Project.Step("Passo 5"),
                new Project.Step("Passo 6"),
                new Project.Step("Conclusão")
        );

        List<Challenge.Test> testList = Arrays.asList(
                new Challenge.Test("Desafio 1"),
                new Challenge.Test("Desafio 2"),
                new Challenge.Test("Desafio 3"),
                new Challenge.Test("Desafio 4")
        );

        List<Activity> bootcampList = new ArrayList<>();
        bootcampList.add(new Lesson(i++, "Pensamento Computacional", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Introdução ao Git e ao GitHub", "<Breve descrição>", Level.BASIC, 5, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Project(i++, "Criando seu Primeiro Repositório no GitHub Para CompartilharSeu Progresso", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", stepList));
        bootcampList.add(new Lesson(i++, "Dominando IDEs Java", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Estruturas de Dados em Java: Introdução", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Estruturas de Dados em Java: Pilhas e Filas", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Estruturas de Dados em Java: Listas", "<Breve descrição>", Level.BASIC, 3, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Estruturas de Dados em Java: Árvores", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Estruturas de Dados em Java: Principais Implementações", "<Breve descrição>", Level.INTERMEDIATE, 1, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Introdução a orientação a objetos com Java", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Project(i++, "Criando um Banco Digital com Java e Orientação a Objetos", "<Breve descrição>", Level.INTERMEDIATE, 1, "<Instrutor(a) - Tech Expert>", stepList));
        bootcampList.add(new Lesson(i++, "Debugging Java", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Tratamento de Exceções em Java", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Trabalhando com Collections Java", "<Breve descrição>", Level.INTERMEDIATE, 6, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Challenge(i++, "Desafios em Java - Sportheca", "<Breve descrição>", Level.BASIC, testList));
        bootcampList.add(new Lesson(i++, "SQL SERVER - Criando suas primeiras consultas", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Modelando um banco de dados na prática com SQL SERVER", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "SQL Server: Boas práticas em bancos relacionais", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Desenvolvimento Mobile Nativo Para Android", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Componentes, Layouts e UI/UX Em Apps Android", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Java e Kotlin Juntos!? Construindo Apps Android", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Explorando o Firebase Para Apps Android Resilientes", "<Breve descrição>", Level.ADVANCED, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Arquitetura MVVM na prática", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Desmistificando o Android Studio na Prática", "<Breve descrição>", Level.INTERMEDIATE, 1, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Fundamentos de Orientação a Objetos com Kotlin", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Introdução ao Kotlin", "Breve descrição", Level.BASIC, 6, "Instrutor(a) - Tech Expert DIO", topicList));
        bootcampList.add(new Lesson(i++, "Aplicando Conceitos de Coleções, Arrays e Listas", "Breve descrição", Level.BASIC, 1, "Instrutor(a) - Tech Expert DIO", topicList));
        bootcampList.add(new Lesson(i++, "Trabalhando com o Android Studio e Principais Ferramentas", "Breve descrição", Level.INTERMEDIATE, 3, "Instrutor(a) - Tech Expert DIO", topicList));
        bootcampList.add(new Lesson(i++, "Projetando o Primeiro Aplicativo Android Usando Kotlin", "Breve descrição", Level.INTERMEDIATE, 3, "Instrutor(a) - Tech Expert DIO", topicList));
        bootcampList.add(new Lesson(i++, "Melhores Práticas para Debugging, Tratamento de Erros e Exceções", "Breve descrição", Level.ADVANCED, 2, "Instrutor(a) - Tech Expert DIO", topicList));
        bootcampList.add(new Lesson(i++, "Utilizando Recursos Nativos do Android", "Breve descrição", Level.BASIC, 5, "Instrutor(a) - Tech Expert DIO", topicList));
        bootcampList.add(new Lesson(i++, "Introdução a Arquitetura da Plataforma Android com Kotlin", "Breve descrição", Level.INTERMEDIATE, 2, "Instrutor(a) - Tech Expert DIO", topicList));
        bootcampList.add(new Lesson(i++, "Aplicando TDD e Padrões de Testes no Desenvolvimento de Aplicativos Android", "Breve descrição", Level.INTERMEDIATE, 8, "Instrutor(a) - Tech Expert DIO", topicList));
        bootcampList.add(new Lesson(i++, "Conceitos de Navegação, Aparência e Estilo de Aplicativos Android", "Breve descrição", Level.ADVANCED, 6, "Instrutor(a) - Tech Expert DIO", topicList));
        bootcampList.add(new Lesson(i++, "Princípios do Desenvolvimento Kotlin com Clean Architecture e MVVM", "Breve descrição", Level.ADVANCED, 2, "Instrutor(a) - Tech Expert DIO", topicList));
        bootcampList.add(new Lesson(i++, "Desenvolvimento Integrado de Dados com SQLite no Android", "Breve descrição", Level.INTERMEDIATE, 2, "Instrutor(a) - Tech Expert DIO", topicList));
        bootcampList.add(new Challenge(i++, "Desafios Sportheca", "<Breve descrição>", Level.BASIC, testList));
        bootcampList.add(new Project(i++, "Criando um App de Cartão de Visitas em Kotlin", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", stepList));
        bootcampList.add(new Project(i, "Criando um App para Apresentar seu Portfólio do GitHub", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", stepList));

        return new Bootcamp(
                3,
                "Sportheca Mobile Developer",
                "Breve descrição",
                Level.INTERMEDIATE,
                114,
                bootcampList
        );
    }

    /**
     * Bootcamp Html Web Developer.
     *
     * @return Retorna o Bootcamp Html Web Developer.
     */
    private Bootcamp getBootcampHtmlWebDeveloper() {
        int i = 2000;

        List<String> subTopic = Arrays.asList(
                "Sub_tópico_1",
                "Sub_tópico_3",
                "Sub_tópico_3");

        List<Lesson.Topic> topicList = Arrays.asList(
                new Lesson.Topic("Tópico 1", subTopic),
                new Lesson.Topic("Tópico 2", subTopic),
                new Lesson.Topic("Tópico 3", subTopic)
        );

        List<Project.Step> stepList = Arrays.asList(
                new Project.Step("Apresentação"),
                new Project.Step("Passo 1"),
                new Project.Step("Passo 2"),
                new Project.Step("Passo 3"),
                new Project.Step("Passo 4"),
                new Project.Step("Passo 5"),
                new Project.Step("Passo 6"),
                new Project.Step("Conclusão")
        );

        List<Challenge.Test> testList = Arrays.asList(
                new Challenge.Test("Desafio 1"),
                new Challenge.Test("Desafio 2"),
                new Challenge.Test("Desafio 3"),
                new Challenge.Test("Desafio 4")
        );

        List<Activity> bootcampList = new ArrayList<>();
        bootcampList.add(new Lesson(i++, "Bem-vindo à DIO", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Introdução ao Git e ao GitHub", "<Breve descrição>", Level.BASIC, 5, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Introdução a criação de websites com HTML5 e CSS3", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Project(i++, "Recriando a página inicial do Instagram", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", stepList));
        bootcampList.add(new Lesson(i++, "Programação para internet com JavaScript", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Challenge(i++, "Introdução a Programação com JavaScript", "<Breve descrição>", Level.BASIC, testList));
        bootcampList.add(new Project(i++, "Recriando a Interface do Netflix", "<Breve descrição>", Level.ADVANCED, 4, "<Instrutor(a) - Tech Expert>", stepList));
        bootcampList.add(new Lesson(i++, "Construindo páginas para internet com Bootstrap", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Challenge(i++, "Fundamentos Aritméticos em JavaScript", "<Breve descrição>", Level.BASIC, testList));
        bootcampList.add(new Project(i, "Recriando o jogo da cobrinha com JavaScript", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", stepList));


        return new Bootcamp(
                2,
                "HTML Web Developer",
                "Breve descrição",
                Level.BASIC,
                27,
                bootcampList
        );
    }

    /**
     * Bootcamp Java Developer.
     *
     * @return Retorna o Bootcamp Java Developer.
     */
    private Bootcamp getBootcampJavaDeveloper() {
        int i = 1000;

        List<String> subTopic = Arrays.asList(
                "Sub_tópico_1",
                "Sub_tópico_3",
                "Sub_tópico_3");

        List<Lesson.Topic> topicList = Arrays.asList(
                new Lesson.Topic("Tópico 1", subTopic),
                new Lesson.Topic("Tópico 2", subTopic),
                new Lesson.Topic("Tópico 3", subTopic)
        );

        List<Project.Step> stepList = Arrays.asList(
                new Project.Step("Apresentação"),
                new Project.Step("Passo 1"),
                new Project.Step("Passo 2"),
                new Project.Step("Passo 3"),
                new Project.Step("Passo 4"),
                new Project.Step("Passo 5"),
                new Project.Step("Passo 6"),
                new Project.Step("Conclusão")
        );

        List<Challenge.Test> testList = Arrays.asList(
                new Challenge.Test("Desafio 1"),
                new Challenge.Test("Desafio 2"),
                new Challenge.Test("Desafio 3"),
                new Challenge.Test("Desafio 4")
        );

        List<Activity> bootcampList = new ArrayList<>();
        bootcampList.add(new Lesson(i++, "Bem-vindo à DIO", "<Breve descrição>", Level.BASIC, 1, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Lógica de Programação Essencial", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Introdução ao Git e ao GitHub", "<Breve descrição>", Level.BASIC, 5, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Fundamentos de Arquitetura de Sistemas", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Desenvolvimento básico em Java", "<Breve descrição>", Level.BASIC, 6, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Challenge(i++, "Introdução a Programação com Java", "<Breve descrição>", Level.BASIC, testList));
        bootcampList.add(new Lesson(i++, "Implementando Collections e Streams com Java", "<Breve descrição>", Level.INTERMEDIATE, 6, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Challenge(i++, "Fundamentos Aritméticos em Java", "<Breve descrição>", Level.BASIC, testList));
        bootcampList.add(new Lesson(i++, "Desenvolvimento avançado em Java", "<Breve descrição>", Level.ADVANCED, 8, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Linux: A introdução ao sistema operacional", "<Breve descrição>", Level.BASIC, 10, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Challenge(i++, "Ordenação e Filtros em Java", "<Breve descrição>", Level.INTERMEDIATE, testList));
        bootcampList.add(new Lesson(i++, "Introdução ao framework Spring Boot", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Arquitetura de Sistemas avançado", "<Breve descrição>", Level.INTERMEDIATE, 3, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Challenge(i++, "Introdução a Busca e Substituição em Java", "<Breve descrição>", Level.INTERMEDIATE, testList));
        bootcampList.add(new Lesson(i++, "Conceitos e melhores práticas com bancos de dados PostgreSQL", "<Breve descrição>", Level.BASIC, 9, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Introdução a orquestração de contêineres com Docker", "<Breve descrição>", Level.BASIC, 4, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Trabalhando com Banco de Dados utilizando JDBC e JPA", "<Breve descrição>", Level.INTERMEDIATE, 4, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Project(i++, "Desenvolvendo um sistema de gerenciamento de pessoas em API", "<Breve descrição>", Level.INTERMEDIATE, 6, "<Instrutor(a) - Tech Expert>", stepList));
        bootcampList.add(new Lesson(i++, "Projetos ágeis com SCRUM", "<Breve descrição>", Level.BASIC, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Challenge(i++, "Solução de Problemas com Java", "<Breve descrição>", Level.ADVANCED, testList));
        bootcampList.add(new Challenge(i++, "Resolvendo Algoritmos com Java", "<Breve descrição>", Level.ADVANCED, testList));
        bootcampList.add(new Lesson(i++, "Criando aplicações web com Spring Web MVC", "<Breve descrição>", Level.INTERMEDIATE, 7, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Lesson(i++, "Introdução a JSF para aplicação web", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Project(i++, "Crie seu gerenciador de salas de reuniões com Java e Angular", "<Breve descrição>", Level.INTERMEDIATE, 6, "<Instrutor(a) - Tech Expert>", stepList));
        bootcampList.add(new Lesson(i++, "Aprenda a aplicar testes com Java", "<Breve descrição>", Level.INTERMEDIATE, 2, "<Instrutor(a) - Tech Expert>", topicList));
        bootcampList.add(new Project(i, "Desenvolvimento de testes unitários para validar uma API REST", "<Breve descrição>", Level.ADVANCED, 5, "<Instrutor(a) - Tech Expert>", stepList));


        return new Bootcamp(
                1,
                "Java Developer",
                "Breve descrição",
                Level.INTERMEDIATE,
                120,
                bootcampList
        );
    }
}
