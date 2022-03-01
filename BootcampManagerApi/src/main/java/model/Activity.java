package model;

import utils.Level;

import java.io.Serializable;

/**
 * Classe que representa uma atividade do bootcamp.
 */
public abstract class Activity implements Serializable {
    private final int id;
    private final String title;
    private final String description;
    private final Level level;
    private final int duration;
    private final int experience;
    private boolean status;

    /**
     * Construtor da classe Activity.
     *
     * @param id          Id da atividade.
     * @param title       Título da atividade.
     * @param description Descrição da atividade.
     * @param level       Nível da atividade.
     * @param duration    Duração da atividade.
     */
    public Activity(int id, String title, String description, Level level, int duration) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.level = level;
        this.duration = duration;
        this.experience = 20 + level.ordinal() * 30 + duration * 10;
        this.status = false;
    }

    /**
     * Tipo da atividade.
     *
     * @return Retorna o tipo da atividade.
     */
    public abstract String getActivityType();

    /*
     * Id da atividade.
     *
     * @return Retorna o id da atividade.

    public int getId() {
        return id;
    }*/

    /**
     * Título da atividade.
     *
     * @return Retorna da atividade.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Descrição da atividade.
     *
     * @return Retorna a descrição da atividade.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Nível da atividade.
     *
     * @return Retorna o nível da atividade.
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Duração da atividade.
     *
     * @return Retorna a duração da atividade.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Experiência atribuída a atividade.
     *
     * @return Retorna a experiência atribuída a atividade.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Define se a atividade está concluída.
     *
     * @param status Situação de conclusão da atividade.
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Retorna a situação da atividade.
     *
     * @return Retorna true se a atividade está concluída.
     */
    public boolean isDone() {
        return status;
    }

    /**
     * Retorna um texto com a situação da atividade.
     *
     * @return Retorna texto com a situação da atividade.
     */
    public String getStatus() {
        return (isDone()) ? "Concluído" : "Começar";
    }
}
