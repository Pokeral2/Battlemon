package BattleMon;
import java.util.Scanner;

public class StartGame {
    public static void main(String[] args) throws Exception {
        changeSettings();
        displayWelcomeScreen();
        chooseGameMode();
        chooseDifficulty();
        startGame();
    }

    private static void displayWelcomeScreen() {
        System.out.println("Welcome to BattleMon!");
        System.out.println("Please choose your game mode and difficulty level to start.");
    }

    private static void chooseGameMode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Game Mode:");
        System.out.println("1. Normal Mode");
        System.out.println("2. Custom Mode");
        System.out.println("3. Actual Mode");
        System.out.print("Enter your choice  : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                settings.currentGameMode = 1;
                System.out.println("Normal mode selected.");
                break;
            case 2:
                settings.currentGameMode = 2;
                System.out.println("Custom mode selected.");
                break;
            case 3:
                settings.currentGameMode = 3;
                System.out.println("Actual mode selected.");
                break;
            default:
                System.out.println("Invalid choice. Re-enter your choice.");
                chooseGameMode();
        }
    }

    private static void chooseDifficulty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Difficulty Level:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                settings.currentGameDifficulty = 1;
                System.out.println("Easy difficulty selected.");
                break;
            case 2:
                settings.currentGameDifficulty = 2;
                System.out.println("Medium difficulty selected.");
                break;
            case 3:
                settings.currentGameDifficulty = 3;
                System.out.println("Hard difficulty selected.");
                break;
            default:
                System.out.println("Invalid choice. Re-enter your choice.");
                chooseDifficulty();
        }
    }

    private static void startGame() throws Exception {
        System.out.println("Starting the game ...");
        Thread.sleep(2000);
        SelectionEngine.main(null);
    } 

    private static void changeSettings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Change Settings:");
        System.out.println("1. Toggle Mega Forms (Currentlly "+((settings.areMegaFormsAllowed)?"Allowed)":"Not Allowed)"));
        System.out.println("2. Toggle Legendary Pokemons (Currentlly "+((settings.areLegendaryPokemonsAllowed)?"Allowed)":"Not Allowed)"));
        System.out.println("3. Toggle Pseudo Legendary Pokemons (Currentlly "+((settings.arePseudoLegendaryPokemonsAllowed)?"Allowed)":"Not Allowed)"));
        System.out.println("4. Toggle Ultra Beasts (Currentlly "+((settings.areUltraBeastsAllowed)?"Allowed)":"Not Allowed)"));
        System.out.println("5. Toggle Mythical Pokemons (Currentlly "+((settings.areMythicalPokemonsAllowed)?"Allowed)":"Not Allowed)"));
        System.out.println("6. Toggle Z-Moves (Currentlly "+((settings.areZMovesAllowed)?"Allowed)":"Not Allowed)"));
        System.out.println("7. Toggle Dynamax (Currentlly "+((settings.areDynamaxAllowed)?"Allowed)":"Not Allowed)"));
        System.out.println("8. Toggle Gigantamax (Currentlly "+((settings.areGigantamaxAllowed)?"Allowed)":"Not Allowed)"));
        System.out.println("else Exit");
        settingsLoop: while (true) {
            System.out.print("Enter your choice (1-8): ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    settings.areMegaFormsAllowed = (settings.areMegaFormsAllowed) ? false : true;
                    System.out.println("Mega Forms"+((settings.areMegaFormsAllowed)?"":" not")+" allowed.");
                    break;
                case 2:
                    settings.areLegendaryPokemonsAllowed = (settings.areLegendaryPokemonsAllowed) ? false : true;
                    System.out.println("Legendary Pokemons"+((settings.areLegendaryPokemonsAllowed)?"":" not")+" allowed.");
                    break;
                case 3:
                    settings.arePseudoLegendaryPokemonsAllowed = (settings.arePseudoLegendaryPokemonsAllowed) ? false : true;
                    System.out.println("Pseudo Legendary Pokemons"+((settings.arePseudoLegendaryPokemonsAllowed)?"":" not")+" allowed.");
                    break;
                case 4:
                    settings.areUltraBeastsAllowed = (settings.areUltraBeastsAllowed) ? false : true;
                    System.out.println("Ultra Beasts"+((settings.areUltraBeastsAllowed)?"":" not")+" allowed.");
                    break;
                case 5:
                    settings.areMythicalPokemonsAllowed = (settings.areMythicalPokemonsAllowed) ? false : true;
                    System.out.println("Mythical Pokemons"+((settings.areMythicalPokemonsAllowed)?"":" not")+" allowed.");
                    break;
                case 6:
                    settings.areZMovesAllowed = (settings.areZMovesAllowed) ? false : true;
                    System.out.println("Z-Moves"+((settings.areZMovesAllowed)?"":" not")+" allowed.");
                    break;
                case 7:
                    settings.areDynamaxAllowed = (settings.areDynamaxAllowed) ? false : true;
                    System.out.println("Dynamax"+((settings.areDynamaxAllowed)?"":" not")+" allowed.");
                    break;
                case 8:
                    settings.areGigantamaxAllowed = (settings.areGigantamaxAllowed) ? false : true;
                    System.out.println("Gigantamax"+((settings.areGigantamaxAllowed)?"":" not")+" allowed.");
                    break;
                default:
                    System.out.println("Settings updated.");
                    break settingsLoop;
            }
        }
    }
}