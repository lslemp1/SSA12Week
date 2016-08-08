package com.tiy.ssa.weektwo.assignmentone;

public class Athletes {

    private final String name;
    private final Nationality nationality;
    private final Sport sport;

    public Athletes(String name, Nationality nationality, Sport sport) {

        this.name = name;
        this.nationality = nationality;
        this.sport = sport;
    }

    public enum Nationality {
        AMERICAN, PORTUGUESE, DOMINICAN;
    };

    public enum Sport {
        SOCCER, SWIMMING, BASEBALL;
    };

    public String getName() {
        return this.name;
    }

    public Nationality getNationality() {
        return this.nationality;
    }

    public Sport getSport() {
        return this.sport;
    }
}
