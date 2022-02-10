package com.engeto.hotel;

public enum TypeOfStay {
    WORKING("working"), HOLIDAY("holiday");

    final String description;

    TypeOfStay(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}