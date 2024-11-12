package javaapplication1;
public class RandomAlphabetPrinter {

    public static void main(String[] args) {
        // Create a new thread to print random alphabets
        Thread alphabetThread = new Thread(new AlphabetPrinter());
        alphabetThread.start();
    }
}

class AlphabetPrinter implements Runnable {

    @Override
    public void run() {
        try {
            // Loop to print 26 random characters
            for (int i = 0; i < 26; i++) {
                // Generate a random number between 0 and 25
                int randomNum = (int) (Math.random() * 26);
                // Convert the number to a character between 'A' and 'Z'
                char randomChar = (char) ('A' + randomNum);

                // Print the random character
                System.out.print(randomChar + " ");

                // Make the thread sleep for a random time (between 100 and 500 ms)
                int sleepTime = (int) (Math.random() * 400 + 100);
                Thread.sleep(sleepTime);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
