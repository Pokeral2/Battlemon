package BattleMon;
public class TypingEffect {
    public static void main(String[] args) throws InterruptedException {
        String message = "Hello, this text will appear letter by letter!\n";
        String message2 = "This is another line with a typing effect.";

        // Print first message with a typing effect
        //printWithTypingEffect(message, 50);

        // Add some spacing
        System.out.println();
        Thread.sleep(500); // Pause for half a second before printing the next message

        // Print second message with a different speed
        //printWithTypingEffect(message2, 100);
    }

    // Method to print a message with typing effect
    public static void printWithTypingEffect(String text) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);    // Print each character without a newline
            System.out.flush();     // Ensure the character is displayed immediately
            Thread.sleep(50);    // Delay in milliseconds between characters
        }
        System.out.println();
    }
}
