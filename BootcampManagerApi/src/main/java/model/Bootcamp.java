package model;

import utils.Level;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Classe que representa um bootcamp.
 */
public class Bootcamp extends Activity {
    private final LocalDate dateStart;
    private final LocalDate dateEnd;
    private final List<Activity> activities;

    /**
     * Construtor da classe Bootcamp.
     *
     * @param id          Id do bootcamp.
     * @param title       Título do bootcamp.
     * @param description Descrição do bootcamp.
     * @param level       Nível do bootcamp.
     * @param duration    Duração do bootcamp.
     * @param activities  Atividades do bootcamp.
     */
    public Bootcamp(int id, String title, String description, Level level, int duration, List<Activity> activities) {
        super(id, title, description, level, duration);
        this.dateStart = LocalDate.now();
        this.dateEnd = LocalDate.now().plusDays(Math.max(duration / 2, 60));
        this.activities = activities;
    }

    @Override
    public String getActivityType() {
        return "Bootcamp";
    }

    /**
     * Duração do bootcamp.
     * É a soma de todas as atividades obrigatórias.
     *
     * @return Número de horas do bootcamp.
     */
    public int getDuration() {
        return activities.stream().mapToInt(Activity::getDuration).sum();
    }

    /**
     * Lista de atividades.
     *
     * @return Retorna a lista de atividades.
     */
    public List<Activity> getActivities() {
        return activities;
    }

    /**
     * Data de finalização do bootcamp.
     *
     * @return Retorna a data de finalização do bootcamp.
     */
    public String getDateFinish() {
        return dateEnd.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    /**
     * Verifica se o bootcamp está concluído.
     *
     * @return True se o bootcamp está concluído, false caso contrário.
     */
    public boolean isBootcampFinish() {
        for (Activity a : activities) {
            if (!a.isDone()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Quantidade de atividades do bootcamp
     *
     * @return Número de atividades do bootcamp.
     */
    public int getNumberOfActivities() {
        return activities.size();
    }
}
