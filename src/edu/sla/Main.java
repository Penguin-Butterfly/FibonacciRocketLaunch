package edu.sla;

public class Main {

    public static void main(String[] args) {
        boolean sequentialRocketLaunches = true;
        boolean concurrentRocketLaunches = false;

        if (sequentialRocketLaunches) {
            // Let's launch 10 rockets
            for (int i = 1; i <= 10; i++) {
                Rocket rocket = new Rocket(String.valueOf(i));
                rocket.run();
                // DON'T continue launching more rockets until this rocket is launched
            }
            System.out.println("Rocket launcher WAITED for all launches to countdown.");
        }

        if (concurrentRocketLaunches) {
            // Let's launch 10 rockets CONCURRENTLY
            for (int i = 1; i <= 10; i++) {
                Runnable rocket = new Rocket(String.valueOf(i));
                // create a new thread to launch this rocket concurrently as the other rockets
                Thread thread = new Thread(rocket);
                // tell that thread to launch the rocket
                thread.start();
                // DO continue launching more rockets while this rocket is launched
            }
            System.out.println("Rocket launcher LET all launches countdown at the same time.");
        }

    }
}
