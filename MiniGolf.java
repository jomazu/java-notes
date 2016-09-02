import java.io.Console;
import java.util.Random;

public class MiniGolf {

    public static void main(String[] args) {
        Console console = System.console();
        Random luck = new Random();

        int numberOfPutts = 0;
        boolean ballInHole = false;

        do {
            console.printf("Putt putt %n");
            ballInHole = luck.nextBoolean();
            numberOfPutts++;  // numberOfPutts = numberOfPutts + 1;
        } while(!ballInHole);

        // %n = new line
        // %s = string
        // %d = decimal integer
        console.printf("You got it in %d putts %n", numberOfPutts);
    }
}