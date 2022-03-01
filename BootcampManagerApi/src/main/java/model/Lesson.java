package model;

import utils.Level;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma aula.
 */
public class Lesson extends Activity {
    private final String instructor;
    private final List<Topic> topics;

    public Lesson(int id,String title, String description, Level level, int duration, String instructor, List<Topic> topics) {
        super( id,title, description, level, duration);
        this.instructor = instructor;
        this.topics = topics;
    }
    @Override
    public String getActivityType() {
        return "Aula";
    }

    public String getInstructor() {
        return instructor;
    }

    /**
     * Tópico da aula.
     * TODO: Não será usada no momento. [INCOMPLETO].
     */
    public static class Topic implements Serializable {
        private final String title;
        private final List<String> subTopics;
        private boolean status;

        public Topic(String title, List<String> subTopics) {
            this.title = title;
            this.subTopics = subTopics;
            this.status = false;
        }
    }

    @Override
    public String toString() {
        return "\n Título: " + this.getTitle() +
                "\n Descrição: " + this.getDescription() +
                "\n Nível: " + this.getLevel().getLevel() +
                "\n Duração: " + this.getDuration() + " hrs" +
                "\n instrutor(a): " + instructor;
    }
}
