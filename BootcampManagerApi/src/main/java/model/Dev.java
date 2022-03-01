package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Classe que representa um desenvolvedor (usuário).
 */
public class Dev implements Serializable {
    private final int id;
    private final String name;
    private final Login login;
    private int experience;
    private Bootcamp bootcampActive;
    private final List<Activity> activities;

    /**
     * Construtor da classe Dev (desenvolvedor).
     *
     * @param id    Id do desenvolvedor.
     * @param name  Nome do desenvolvedor.
     * @param login Login do desenvolvedor.
     */
    public Dev(int id, String name, Login login) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.experience = 0;
        this.bootcampActive = null;
        this.activities = new ArrayList<>();
    }

    /**
     * Login do usuário.
     *
     * @return Retorna o login do usuário.
     */
    public Login getLogin() {
        return login;
    }

    /**
     * Nome completo do usuário.
     *
     * @return Retorna o nome completo do usuário.
     */
    public String getFullName() {
        return name;
    }

    /**
     * Primeiro nome do usuário.
     *
     * @return Retorna o primeiro nome do usuário.
     */
    public String getFistName() {
        String firstName = name.split(" ")[0];
        if (firstName != null) {
            return firstName.toUpperCase(Locale.getDefault());
        } else {
            return "<Desconhecido>";
        }
    }

    /**
     * Adiciona uma atividade a lista de atividades concluída pelo usuário.
     *
     * @param activity Atividade concluída a ser acrescentada.
     */
    public void setActivities(Activity activity) {
        activities.add(activity);
    }

    /*
     * Verifica se o usuário possui algum bootcamp em andamento.
     *
     * @return True se o usuário possui um bootcamp ativo, false caso contrário.

    public boolean hasBootcampActive() {
        return bootcampActive != null;
    } */

    /**
     * Bootcamp ativo.
     *
     * @return Retorna o bootcamp ativo.
     */
    public Bootcamp getBootcampActive() {
        return bootcampActive;
    }

    /**
     * Define um novo bootcamp.
     *
     * @param bootcampActive Novo bootcamp a ser realizado.
     */
    public void setBootcampActive(Bootcamp bootcampActive) {
        this.bootcampActive = bootcampActive;
    }

    /*
     * Lista das atividades concluídas pelo usuário.
     *
     * @return Retorna a lista de atividades concluídas.

    public List<Activity> getActivities() {
        return activities;
    }*/

    /**
     * Aulas concluídas.
     *
     * @return Retorna todas as aulas concluídas.
     */
    public List<Lesson> getLessons() {
        List<Lesson> lessonList = new ArrayList<>();
        for (Activity a : activities) {
            if (a instanceof Lesson) {
                lessonList.add((Lesson) a);
            }
        }
        return lessonList;
    }

    /**
     * Projetos concluídas.
     *
     * @return Retorna todos os projetos concluídos.
     */
    public List<Project> getProjects() {
        List<Project> projectList = new ArrayList<>();
        for (Activity a : activities) {
            if (a instanceof Project) {
                projectList.add((Project) a);
            }
        }
        return projectList;
    }

    /*
     * Bootcamps concluídas.
     *
     * @return Retorna todos os bootcamps concluídos.

    public List<Bootcamp> getBootcamps() {
        List<Bootcamp> bootcampList = new ArrayList<>();
        for (Activity a : activities) {
            if (a instanceof Bootcamp) {
                bootcampList.add((Bootcamp) a);
            }
        }
        return bootcampList;
    }*/

    /**
     * Define o nível de experiência do usuário.
     *
     * @param experience Experiência a ser acrescentada.
     */
    public void setExperience(int experience) {
        if (experience > 0) {
            this.experience += experience;
        }
    }

    /**
     * Nível de experiência do usuário.
     *
     * @return Retorna a experiência do usuário.
     */
    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Dev{id = " + id +
                ", Name = " + name +
                ", XP = " + experience + "}";
    }
}
