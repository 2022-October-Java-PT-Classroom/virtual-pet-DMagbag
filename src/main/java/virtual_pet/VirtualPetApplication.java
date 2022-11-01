package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        VirtualPet myVirtualPet = new VirtualPet(50, 50, 50, 0);

        System.out.println("Choose a dragon: black, red, pink, green, or blue");
        String dragonColor = input.nextLine().toLowerCase().strip();

        System.out.println("Enter your new pet's name:");
        String dragonName = input.nextLine().toUpperCase().strip();

        System.out.println("\nCongratulations! You adopted a " + dragonColor +
                " dragon, named " + dragonName + ".\n");

        myVirtualPet.gameInstructions();

        boolean quitGame = false;

        while (!quitGame) {

            if (myVirtualPet.getHealth() <= 0 || myVirtualPet.getEnergy() <= 0) {
                System.out.println("\nYour health or energy depleted."); //for loop for depletion statements
                quitGame = true;

            } else {
                myVirtualPet.printDragonStats();
                System.out.println("What do you want to do? Choose a number." +
                        "\n1: Ride " + dragonName +
                        "\n2: Train " + dragonName +
                        "\n3: Pet " + dragonName +
                        "\n4: Feed " + dragonName +
                        "\n5: Put " + dragonName + " to sleep" +
                        "\n6: Do nothing" +
                        "\n7: Give " + dragonName + " up for adoption and quit game");

                String userChoice = input.nextLine();

                switch (userChoice) {
                    case "1":
                        myVirtualPet.ride();
                        System.out.println("\nYou soar through the sky on " + dragonName + "'s back.\n" +
                                "--RAGE\n--ENERGY\n");
                        break;
                    case "2":
                        myVirtualPet.train();
                        System.out.println("\nYou train " + dragonName + " to defend your home.\n" +
                                "--ENERGY\n++SKILL LEVEL\n");
                        break;
                    case "3":
                        myVirtualPet.pet();
                        System.out.println("\nYou pet " + dragonName + " behind the ears.");
                        System.out.println("--RAGE\n");
                        break;
                    case "4":
                        myVirtualPet.feed();
                        System.out.println("\nYou feed " + dragonName + " a live billy goat.\n" +
                                "++HEALTH\n");
                        break;
                    case "5":
                        myVirtualPet.putToSleep();
                        System.out.println("\nYou put " + dragonName + " to sleep in the cave.");
                        System.out.println("++ENERGY\n");
                        break;
                    case "6":
                        System.out.println("\nYou both sit there doing absolutely nothing.\n");
                        break;
                    case "7":
                        System.out.println("\nYou give up on " + dragonName + ".");
                        quitGame = true;
                        break;
                    default:
                        System.out.println("I don't understand your choice. Please try again.");
                }
                myVirtualPet.tick();
            }
        }
        System.out.println("\nGAME OVER!!");
    }
}