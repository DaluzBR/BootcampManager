package model;

import utils.Level;

import java.io.Serializable;
import java.util.List;

/**
 * Classe que representa um projeto.
 */
public class Project extends Activity {

    private String instructor;
    private List<Step> steps;

    public Project(int id,String title, String description, Level level, int duration, String instructor, List<Step> steps) {
        super( id,title, description, level, duration);
        this.instructor = instructor;
        this.steps = steps;
    }

    @Override
    public String getActivityType() {
        return "Projeto";
    }

    /**
     * Passos do projeto.
     */
    public static class Step implements Serializable {
        private String title;
        private boolean status;

        public Step(String title) {
            this.title = title;
            this.status = false;
        }
    }
}
