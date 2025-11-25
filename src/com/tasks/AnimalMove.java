package com.tasks;

public interface AnimalMove {
    default void move() {
        String _class = this.getClass().getSimpleName();
        System.out.println(_class + " moves.");
    }
}
