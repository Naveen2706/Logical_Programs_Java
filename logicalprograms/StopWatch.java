package com.bridgelabz.logicalprograms;

public class StopWatch {
    public static void main(String[] args) {
        RunStopWatch timerObj = new RunStopWatch();
        System.out.println("Clock is ON!");
        System.out.println("Clock is OFF!");
        double timeElapsed = timerObj.elapsedTime();
        System.out.printf("The time elapsed is :: " + timeElapsed + " seconds");
    }

}

class RunStopWatch {
    private final long START;

    public RunStopWatch() {                                    //Initializes a new stopwatch.
        START = System.currentTimeMillis();
    }

    /*
      Returns the elapsed CPU time (in seconds) since the stopwatch was created.
    */
    public double elapsedTime() {                            // CPU time (in seconds) since the stopwatch was created
        long now = System.currentTimeMillis();
        return (now - START);
    }
}
