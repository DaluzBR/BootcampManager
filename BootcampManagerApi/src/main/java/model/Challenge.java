package model;

import utils.Level;

import java.io.Serializable;
import java.util.List;

/**
 * Classe que representa um desafio.
 */
public class Challenge extends Activity {

    private List<Test> tests;

    /**
     * @param id          Id do desafio.
     * @param title       Título do desafio.
     * @param description Descrição do desafio.
     * @param level       Nível do desafio.
     * @param tests       Lista com todos os testes do desafio.
     */
    public Challenge(int id, String title, String description, Level level, List<Test> tests) {
        super(id, title, description, level, 0);
        this.tests = tests;
    }

    @Override
    public String getActivityType() {
        return "Desafio";
    }

    /**
     * Teste do desafio.
     */
    public static class Test implements Serializable {
        private String title;
        private boolean status;

        public Test(String title) {
            this.title = title;
            this.status = false;
        }
    }
}
