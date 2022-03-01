package utils;

import java.io.Serializable;

/**
 * Nível de dificuldade das atividades e bootcamps.
 */
public enum Level implements Serializable {
    BASIC("Básico"),
    INTERMEDIATE("Intermediário"),
    ADVANCED("Avançado");

    private final String level;

    Level(String level) {
        this.level = level;
    }

    /**
     * Nível de dificuldade.
     *
     * @return Retorna o nível de dificuldade.
     */
    public String getLevel() {
        return this.level;
    }
}
