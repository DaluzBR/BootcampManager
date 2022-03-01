package model;

import utils.Level;

import java.time.LocalDate;

/**
 * Classe que representa uma mentoria.
 */
public class Live extends Activity{

    private String instructor;
    private LocalDate date;

    public Live(int id,String title, String description, Level level, int duration, String instructor, LocalDate date) {
        super( id,title, description, level, duration);
        this.instructor = instructor;
        this.date = date;
    }

    @Override
    public String getActivityType() {
        return "Mentoria";
    }
}
