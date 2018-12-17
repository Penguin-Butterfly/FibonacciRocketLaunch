package edu.sla;

public class Rocket implements Runnable {
    String name;
    int launchTime;
    boolean canLaunch;

    Rocket(String number) {
        name = number;
        // launchTime is random amount between 2 and 8
        launchTime = 2 + (int)(Math.random() * 8);
        canLaunch = false;
    }

    private void countdown() {
        System.out.println("Rocket " + name + " countdown commence.");
        for (int i = launchTime; i >= 1; i--) {
            System.out.println("Rocket " + name + " launching in " + i + " seconds.");
            try {
                // wait 1 second (which is same as 1000 milliseconds
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        canLaunch = true;
    }

    private void launch() {
            System.out.println("Rocket "+ name + " launching!!!!!!");
            System.out.println("");
    }

    public void run() {
        countdown();
        launch();
    }
}
