package edu.sla;

public class Main {

    public static void main(String[] args) {

        Fibonacci FibSeq1 = new Sequence(24,0,1);
        FibSeq1.run();

        Fibonacci FibSeq2 = new Sequence(16,2,2);

        /*
        boolean recursiveMode = false;
        int numRockets = 2;

        System.out.println("Will launch " + numRockets + " Rockets" + (recursiveMode ? " recursively." : " iteratively."));
        System.out.println("");

        // Let's launch some rockets
        for (int i = 0; i < numRockets; i++) {
            Launchable rocket = new Rocket(i+1, recursiveMode);
            rocket.run();

            // DON'T continue launching more rockets until this rocket is launched
            if (!rocket.launched()) {
                System.out.println("ERROR: Continuing to next rocket without launching current rocket!");
            }
        }

        System.out.println("All Rockets launched successfully!");
         */
    }
}
