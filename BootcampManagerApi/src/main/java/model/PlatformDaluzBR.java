package model;

import database.FileDB;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Classe que representa a plataforma de ensino.
 */
public class PlatformDaluzBR {

    private final List<Dev> devs;
    private List<Lesson> lessonList;
    private List<Bootcamp> bootcampList;
    private List<Project> projectList;

    /**
     * Construtor da classe PlatformDaluzBR.
     */
    public PlatformDaluzBR() {
        this.devs = new ArrayList<>();
        this.lessonList = new ArrayList<>();
        this.bootcampList = new ArrayList<>();
        this.projectList = new ArrayList<>();
    }

    /**
     * Inicia a plataforma.
     */
    public void start() {
        final Scanner sc = new Scanner(System.in);
        int option;
        Dev dev;
        do {
            System.out.println();
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| @DaluzBR - ABSTRAINDO UM BOOTCAMP USANDO ORIENTAÇÃO A OBJETO EM JAVA   |");
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| #######                ###                     ########    ########    |");
            System.out.println("| ########               ###                     #########   ##########  |");
            System.out.println("| ###   ####             ###                     ###    ###  ###    ###  |");
            System.out.println("| ###    ###             ###                     ###     ### ###     ### |");
            System.out.println("| ###    ###             ###                     ###    ###  ###    ###  |");
            System.out.println("| ###    ###   ######    ### ###    ### #######  #########   #########   |");
            System.out.println("| ###    ###  ########   ### ###    ### #######  #########   ########    |");
            System.out.println("| ###    ### ###    ###  ### ###    ###    ###   ###    ###  ###  ###    |");
            System.out.println("| ###    ### ###    ###  ### ###    ###   ###    ###     ### ###   ###   |");
            System.out.println("| ###   #### ###    ###  ### ####  ####  ###     ###    ###  ###    ###  |");
            System.out.println("| ########    ########## ###  ########  #######  #########   ###     ### |");
            System.out.println("| #######      ######### ###   ######   #######  ########    ###     ### |");
            System.out.println("+----------------------+------------------------+------------------------+");
            System.out.println("|      [1] Entrar      |      [2] Cadastrar     |        [-1] Sair       |");
            System.out.println("+----------------------+------------------------+------------------------+");
            System.out.println();

            System.out.print(" Escolha uma opção: ");
            option = getInt(sc.next());

            if (option == 1) {
                dev = getAuthentication();
                if (dev != null) {
                    dashboard(dev);
                }
            } else if (option == 2) {
                dev = getRegister();
                if (dev != null) {
                    dashboard(dev);
                }
            } else if (option == -1) {
                return;
            }
        } while (true);
    }

    /**
     * Autenticação do usuário.
     *
     * @return Retorna o usuário.
     */
    public Dev getAuthentication() {
        System.out.println();
        System.out.println("+------------------------------------------------------------------------+");
        System.out.println("| @DaluzBR - ABSTRAINDO UM BOOTCAMP USANDO ORIENTAÇÃO A OBJETO EM JAVA   |");
        System.out.println("+------------------------------------------------------------------------+");
        System.out.println("|                      DIGITE SEUS DADOS PARA ENTRAR                     |");
        System.out.println("+------------------------------------------------------------------------+");
        System.out.println();

        final Scanner sc = new Scanner(System.in);
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Senha: ");
        String pass = sc.next();

        final Login login = new Login(email, pass);
        final FileDB fileDB = new FileDB();
        final Dev dev = fileDB.restoreDevByLogin(login);
        if (dev == null) {
            System.out.println("Erro: E-mail ou senha incorreta.");
        }
        return dev;
    }

    /**
     * Registra um usuário.
     *
     * @return Retorna o usuário.
     */
    public Dev getRegister() {
        System.out.println();
        System.out.println("+------------------------------------------------------------------------+");
        System.out.println("| @DaluzBR - ABSTRAINDO UM BOOTCAMP USANDO ORIENTAÇÃO A OBJETO EM JAVA   |");
        System.out.println("+------------------------------------------------------------------------+");
        System.out.println("|                      DIGITE SEUS DADOS PARA ENTRAR                     |");
        System.out.println("+------------------------------------------------------------------------+");
        System.out.println();

        final Scanner sc = new Scanner(System.in);
        System.out.print("Nome completo: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.next();
        System.out.print("Senha (4 dígitos): ");
        String pass = sc.next();

        Dev dev = new Dev(numberOfDev() + 1, name, new Login(email, pass));

        final FileDB fileDB = new FileDB();

        return (fileDB.saveDevFileDB(dev)) ? dev : null;
    }

    /**
     * Tela principal da plataforma.
     *
     * @param dev Desenvolvedor (usuário) autenticado que acessa o sistema.
     */
    public void dashboard(Dev dev) {
        // Carrega a lista de cursos.
        this.lessonList = new Settings().getLessonList();
        this.bootcampList = new Settings().getBootcampList();
        this.projectList = new Settings().getProjectList();

        int option;
        final Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| @DaluzBR - ABSTRAINDO UM BOOTCAMP USANDO ORIENTAÇÃO A OBJETO EM JAVA   |");
            System.out.println("+------------+---------------+----------+-------------------+------------+");
            System.out.println("| [1] Cursos | [2] Bootcamps | [3] Labs | [4] Meu Currículo | [-1] Sair  |");
            System.out.println("+------------+---------------+----------+-------------------+------------+");
            System.out.println("| OLÁ " + dev.getFistName() + ", É HORA DE ACELERAR O SEU APRENDIZADO COM TODA A COMUNIDADE.");
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println();

            System.out.print(" Escolha uma opção: ");
            option = getInt(sc.next());

            if (option == 1) {
                showLessonList(dev);
            } else if (option == 2) {
                showBootcampList(dev);
            } else if (option == 3) {
                // TODO: getLabsList();
                System.out.println("+------------------------------------------------------------------------+");
                System.out.println("| AVISO: Não implementado.                                               |");
                System.out.println("+------------------------------------------------------------------------+");
            } else if (option == 4) {
                myCurriculum(dev);
            } else if (option == -1) {
                return;
            }
        } while (true);
    }

    /**
     * Mostra tela com a lista de cursos da plataforma.
     *
     * @param dev Usuário.
     */
    public void showLessonList(Dev dev) {
        int option;
        final Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| @DaluzBR - ABSTRAINDO UM BOOTCAMP USANDO ORIENTAÇÃO A OBJETO EM JAVA   |");
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| CURSOS                                                                 |");
            System.out.println("| Cursos com certificado para você aprender as tecnologias mais usadas   |");
            System.out.println("| pelo mercado no seu próprio ritmo e com os melhores especialistas.     |");
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| TECNOLOGIAS                                                            |");
            System.out.println("|                                                                        |");
            for (int i = 0; i < lessonList.size(); i++) {
                System.out.printf("| [%3d] %s\n", (i + 1), lessonList.get(i).getTitle());
            }
            System.out.println("+-----------------------------------------------------------+------------+");
            System.out.println("|                                                           | [-1] Sair  |");
            System.out.println("+-----------------------------------------------------------+------------+");
            System.out.println();

            System.out.print(" Escolha uma opção: ");
            option = getInt(sc.next());

            if (option >= 1 && option <= lessonList.size()) {
                showLessonVideo(dev, lessonList.get(option - 1));
            } else if (option == -1) {
                return;
            }
        } while (true);
    }

    /**
     * Mostra tela para assistir o vídeo.
     *
     * @param dev    Usuário.
     * @param lesson Aula a ser assistida.
     */
    private void showLessonVideo(Dev dev, Lesson lesson) {
        int option;
        final Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| @DaluzBR - ABSTRAINDO UM BOOTCAMP USANDO ORIENTAÇÃO A OBJETO EM JAVA   |");
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| Vídeo da aula: " + lesson.getTitle());
            System.out.println("| Instrutor(a): " + lesson.getInstructor());
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| ###################################################   Tópico 1         |");
            System.out.println("| #         @@@@@@@@@@@         Android   GitHub    #     Subtópico 1.1  |");
            System.out.println("| #      @@@@         @@@@      JavaScript   QA     #     Subtópico 1.2  |");
            System.out.println("| #    @@@   _       _   @@@    Azure       Docker  #     Subtópico 1.3  |");
            System.out.println("| #    @@| (   )   (   ) | @@   C#       Assembly   #   Tópico 2         |");
            System.out.println("| #     @| ( O )   ( O ) | @    Banco_de_Dados      #     Subtópico 2.1  |");
            System.out.println("| #      |   -   ^   -   |      TypeScript          #     Subtópico 2.2  |");
            System.out.println("| #       |   ########  |       Java       Kotlin   #     Subtópico 2.3  |");
            System.out.println("| #        |    ####   |        Python    Linux     #   Tópico 3         |");
            System.out.println("| #         ___________         SQL  Scrum     IDE  #     Subtópico 3.1  |");
            System.out.println("| #                             C       AWS    JPA  #     Subtópico 3.2  |");
            System.out.println("| #  Angular  Ruby  Git  HTML   CSS  Spring Boot    #     Subtópico 3.3  |");
            System.out.println("| ###################################################     Teste          |");
            System.out.println("+------------------------------------+-----------------------------------+");
            System.out.println("|  [1] Marcar aula como concluída    |            [-1] Voltar            |");
            System.out.println("+------------------------------------+-----------------------------------+");
            System.out.println();

            System.out.print(" Escolha uma opção: ");
            option = getInt(sc.next());

            if (option == 1) {
                lesson.setStatus(true);
                dev.setActivities(lesson);
                dev.setExperience(lesson.getExperience());
                new FileDB().saveDevFileDB(dev);
                printCertification(dev, lesson);
                return;
            } else if (option == -1) {
                return;
            }
        } while (true);
    }

    /**
     * Mostra tela para assistir o certificado de conclusão do curso.
     *
     * @param dev    Usuário.
     * @param lesson Aula a ser assistida.
     */
    private void printCertification(Dev dev, Lesson lesson) {
        SimpleDateFormat sdf = new SimpleDateFormat(
                "dd 'de' MMMM 'de' yyyy",
                new Locale("pt", "BR"));

        String code = String.format(Locale.US, "%08X", new Random().nextLong(1999999999));

        System.out.println();
        System.out.println("+------------------------------------------------------------------------+");
        System.out.println("| @DaluzBR - ABSTRAINDO UM BOOTCAMP USANDO ORIENTAÇÃO A OBJETO EM JAVA   |");
        System.out.println("+------------------------------------------------------------------------+");
        System.out.println("|                       Certificado de conclusão                         |");
        System.out.println("+------------------------------------------------------------------------+");
        System.out.println("|  @DaluzBR                                                " + code + "      |");
        System.out.println("|                                                                        |");
        System.out.println("|  Certificamos que                                                      |");
        System.out.println("|  " + dev.getFullName());
        System.out.println("|  em " + (sdf.format(new Date())) + ", concluiu o curso");
        System.out.println("|                                                                        |");
        System.out.println("|  " + lesson.getTitle().toUpperCase(Locale.getDefault()));
        System.out.println("|                                                                        |");
        System.out.println("|  com carga horária de " + lesson.getDuration() + " horas.");
        System.out.println("|                                                                        |");
        System.out.println("|      Este certificado é válido em todo território nacional. ;-)        |");
        System.out.println("|                                                                        |");
        System.out.println("+-----------------------------------------------------------+------------+");
        System.out.println("|                                                           | [-1] Sair  |");
        System.out.println("+-----------------------------------------------------------+------------+");
        System.out.println();

        int option;
        final Scanner sc = new Scanner(System.in);
        do {
            System.out.print(" Escolha uma opção: ");
            option = getInt(sc.next());

            if (option == -1) {
                return;
            }
        } while (true);
    }

    /**
     * Mostra tela para exibir uma lista com todos os bootcamp
     * disponíveis na plataforma.
     *
     * @param dev Usuário.
     */
    public void showBootcampList(Dev dev) {
        int option;
        final Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| @DaluzBR - ABSTRAINDO UM BOOTCAMP USANDO ORIENTAÇÃO A OBJETO EM JAVA   |");
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| BOOTCAMPS                                                              |");
            System.out.println("| Aprenda de forma imersiva com aulas e projetos práticos que te         |");
            System.out.println("| preparam para o mercado de trabalho.                                   |");
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| TECNOLOGIAS                                                            |");
            System.out.println("|                                                                        |");
            for (int i = 0; i < bootcampList.size(); i++) {
                System.out.printf("| [%3d] %s\n", (i + 1), bootcampList.get(i).getTitle());
            }
            System.out.println("+-----------------------------------------------------------+------------+");
            System.out.println("|                                                           | [-1] Sair  |");
            System.out.println("+-----------------------------------------------------------+------------+");
            System.out.println();

            System.out.print(" Escolha uma opção: ");
            option = getInt(sc.next());

            if (option >= 1 && option <= bootcampList.size()) {
                // TODO: if (!dev.hasBootcampActive()) {   }
                dev.setBootcampActive(bootcampList.get(option - 1));
                showBootcampActivities(dev);

            } else if (option == -1) {
                return;
            }
        } while (true);
    }

    /**
     * Mostra tela que exibe as atividades dentro de um bootcamp.
     *
     * @param dev Usuário.
     */
    private void showBootcampActivities(Dev dev) {
        int option;
        Bootcamp bootcamp = dev.getBootcampActive();
        final Scanner sc = new Scanner(System.in);
        List<Activity> activityList = bootcamp.getActivities();
        do {
            System.out.println();
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| @DaluzBR - ABSTRAINDO UM BOOTCAMP USANDO ORIENTAÇÃO A OBJETO EM JAVA   |");
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| Nome do Bootcamp: " + bootcamp.getTitle());
            System.out.println("| Descrição: " + bootcamp.getDescription());
            System.out.println("| Duração: " + bootcamp.getDuration() + " horas");
            System.out.println("| Nº de Atividades: " + bootcamp.getNumberOfActivities());
            System.out.println("| O prazo para finalização do bootcamp é: " + bootcamp.getDateFinish());
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| ATIVIDADES                                                             |");
            System.out.println("|                                                                        |");
            for (int i = 0; i < activityList.size(); i++) {
                System.out.printf("| @[%2d] %s\n", (i + 1), activityList.get(i).getTitle());
                System.out.println("|       Nome: " + activityList.get(i).getTitle());
                System.out.println("|       Descrição: " + activityList.get(i).getDescription());
                System.out.println("|       Duração: " + activityList.get(i).getDuration() + " hrs   Nível: " + activityList.get(i).getLevel().getLevel());
                System.out.println("|       Tipo: " + activityList.get(i).getActivityType() + "   Status: " + activityList.get(i).getStatus());
                System.out.println("|");
            }
            System.out.println("+------------------------------------+-----------------------------------+");
            System.out.println("|      [0] Baixar certificado        |            [-1] Voltar            |");
            System.out.println("+------------------------------------+-----------------------------------+");
            System.out.println();

            System.out.print(" Escolha uma opção: ");
            option = getInt(sc.next());

            if (option == 0) {
                // TODO
                System.out.println("+------------------------------------------------------------------------+");
                System.out.println("| AVISO: Não implementado.                                               |");
                System.out.println("+------------------------------------------------------------------------+");
//                if (bootcamp.isBootcampFinish()) {
//                    //printCertification(dev, lesson);
//                } else {
//                    System.out.println("+------------------------------------------------------------------------+");
//                    System.out.println("|     AVISO                                                              |");
//                    System.out.println("|     Bootcamp não finalizado.                                           |");
//                    System.out.println("|     Conclua todas as atividades para imprimir                          |");
//                    System.out.println("|     o certificado de conclusão.                                        |");
//                    System.out.println("+------------------------------------------------------------------------+");
//                }
            } else if ((option >= 1) && (option <= activityList.size())) {
                // TODO
                System.out.println("+------------------------------------------------------------------------+");
                System.out.println("| AVISO: Não implementado.                                               |");
                System.out.println("+------------------------------------------------------------------------+");
//
//                if (!activityList.get(option - 1).isDone()) {
//                    //
//                } else {
//                    System.out.println("+------------------------------------------------------------------------+");
//                    System.out.println("|     AVISO                                                              |");
//                    System.out.println("|     Aula concluída.                                                    |");
//                    System.out.println("+------------------------------------------------------------------------+");
//                }
            } else if (option == -1) {
                return;
            }
        } while (true);
    }

    /**
     * Exibe uma tela que mostra as informações do usuário.
     *
     * @param dev usuário.
     */
    private void myCurriculum(Dev dev) {
        int option = 1;
        final Scanner sc = new Scanner(System.in);
        final List<Lesson> lessonList = dev.getLessons();
        final List<Project> projectList = dev.getProjects();
        do {
            System.out.println();
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| @DaluzBR - ABSTRAINDO UM BOOTCAMP USANDO ORIENTAÇÃO A OBJETO EM JAVA   |");
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("|                             Meu Currículo                              |");
            System.out.println("+------------------------------------------------------------------------+");
            System.out.println("| #####################  NOME:                                           |");
            System.out.println("| #     @@@@@@@@@     #   " + dev.getFullName());
            System.out.println("| #  @@@@@@@@@@@@@@@  #   'Eu salvaria o mundo se meu HD tivesse espaço. |");
            System.out.println("| # @@@  _     _  @@@ #  EXPERIÊNCIA (XP):                               |");
            System.out.println("| # @| ( O ) ( O ) |@ #   " + dev.getExperience() + " / 9999999999");
            System.out.println("| #  |      ^      |  #  CONQUISTAS:                                     |");
            System.out.println("| #   |   (---)   |   #   " + lessonList.size());
            System.out.println("| #     _________     #  PROJETOS:                                       |");
            System.out.println("| #####################   " + projectList.size());
            System.out.println("+-----------------------+------------------------+-----------------------+");
            System.out.println("|    [1] Conquistas     |      [2] Projetos      |       [-1] Voltar     |");
            System.out.println("+-----------------------+------------------------+-----------------------+");

            if (option == 1) {
                System.out.println("| CONQUISTAS                                                             |");
                System.out.println("+------------------------------------------------------------------------+");
                if (lessonList.size() > 0) {
                    for (int i = 0; i < lessonList.size(); i++) {
                        System.out.println("| " + (i + 1) + " - " + lessonList.get(i).getTitle());
                    }
                } else {
                    System.out.println("| Você ainda não terminou nenhum curso.                                  |");
                }
                System.out.println("+------------------------------------------------------------------------+");
            } else if (option == 2) {
                System.out.println("| PROJETOS                                                               |");
                System.out.println("+------------------------------------------------------------------------+");
                if (projectList.size() > 0) {
                    for (int i = 0; i < projectList.size(); i++) {
                        System.out.println("| [" + i + "] " + projectList.get(i).getTitle());
                    }
                } else {
                    System.out.println("| Você ainda não terminou nenhum projeto.                                |");
                }
                System.out.println("+------------------------------------------------------------------------+");
            } else if (option == -1) {
                return;
            }
            System.out.println();
            System.out.print(" Escolha uma opção: ");
            option = getInt(sc.next());

        } while (true);
    }

    /**
     * Número de desenvolvedores na plataforma.
     *
     * @return Retorna o número de desenvolvedores na plataforma.
     */
    private int numberOfDev() {
        return devs.size();
    }

    /**
     * Converte os dados de entrada em String para inteiro.
     *
     * @param input String que representa a entrada do teclado.
     * @return Retorna o valor convertido, ou zero se não consegui converter.
     */
    private int getInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ignored) {
        }

        return 0;
    }

}
