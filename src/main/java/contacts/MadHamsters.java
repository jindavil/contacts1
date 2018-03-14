package contacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MadHamsters {
    public static void main(String[] args) {

        List<Playersinformation> playersinformation = new ArrayList<>();
        while (true) {
            printProgramMenu();
            int menuItem = getFromUserMenuItemToExecute();
            if (menuItem == 4) {
                break;
            }
            switch (menuItem) {
                case 1: {
                    addPlayersToList(playersinformation);
                    break;
                }
                case 2: {
                    removePlayersFromList(playersinformation);
                    break;
                }
                case 3: {
                    printPlayersListToConsole(playersinformation);
                    break;
                }
            }
        }

    }


    private static void addPlayersToList(List<Playersinformation> playersinformation) {

        System.out.println();
        System.out.println("Add player to list execution start!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter player Name:");
        String name = sc.nextLine();
        System.out.print("Enter player Surname:");
        String surname = sc.nextLine();
        System.out.print("Enter player Telefonnumber:");
        Integer telefonumber = sc.nextInt();
        Playersinformation players = new Playersinformation();
        players.setName(name);
        players.setSurname(surname);
        players.setTelefonumber(telefonumber);
        playersinformation.add(players);
        System.out.println("Add players to list execution end!");
        System.out.println();
    }


    private static void removePlayersFromList(List<Playersinformation> playersinformation) {

        System.out.println();
        System.out.println("Remove players from list execution start!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter players Telefonnumber:");
        final Integer telefonumber = sc.nextInt();
       /* Optional<Playersinformation> foundPlayers = players.stream()
                .filter(p -> p.gettelefonnumber().equals(telefonumber))
                .findFirst();
        if (foundPlayers.isPresent()) {
            System.out.println("Player with telefonnumber " + telefonnumber + " was found and will be removed from list!");
            Playersinformation player = foundPlayers.get();
            players.remove(player);
        } else {
            System.out.println("Player with telefonnumber " + telefonumber + " not found and not be removed from list!");
        }*/
        System.out.println("Remove player from list execution end!");
        System.out.println();
    }

    private static void printPlayersListToConsole(List<Playersinformation> players) {
        System.out.println();
        System.out.println("Print players list to console execution start!");
        for (Playersinformation player : players) {
            System.out.println(player.getName() + "[" + player.getSurname() + "[" + player.getTelefonumber() + "]");
        }
        System.out.println("Print players list to console execution end!");
        System.out.println();
    }

    private static void printProgramMenu() {
        System.out.println("Program Menu:");
        System.out.println("1. Add players to list");
        System.out.println("2. Remove players from list");
        System.out.println("3. Print list to console");
        System.out.println("4. Exit");
    }

    private static int getFromUserMenuItemToExecute() {
        System.out.print("Please enter menu item number to execute:");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

}
