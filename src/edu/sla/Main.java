package edu.sla;

public class Main {

    public static void main(String[] args) {
        // Let's launch 10 rockets
        for (int i = 1; i <= 10; i++) {
            Rocket rocket = new Rocket(String.valueOf(i));
            rocket.run();
            // DON'T continue launching more rockets until this rocket is launched
        }
    }
}
