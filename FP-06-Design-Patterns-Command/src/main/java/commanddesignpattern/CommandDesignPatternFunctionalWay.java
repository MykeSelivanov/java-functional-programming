package commanddesignpattern;

public class CommandDesignPatternFunctionalWay {
    public static void main(String[] args) {

        /**
         * Command is a behavioral design pattern, which is about encapsulating a request as an object
         * In this we write code that sequences and executes methods based on runtime decisions (commands)
         *
         * For ex. all the implementations of Runnable interface (java.land.Runnable), like creating thread by
         * implementing runnable so each implementation that we give to runnable is a different command on which
         * the methods of runnable gets executed
         *
         * Command pattern is a way to encapsulate a request as an object, parametrize clients with different requests and
         * perform corresponding operations
         */

        AC ac1 = new AC();
        AC ac2 = new AC();

        ACAutomationRemote remote = new ACAutomationRemote();
        remote.setCommand(() -> ac2.turnOn());
        remote.buttonPressed();

    }

}
