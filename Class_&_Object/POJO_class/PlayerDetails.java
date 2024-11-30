import java.util.*;

class Player {
    private int jno;
    private String name;
    private int run;
    private int match;

    public void setJno(int no) {
        this.jno = no;
    }

    public int getJno() {
        return jno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getRun() {
        return run;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public int getMatch() {
        return match;
    }

    public void displayPlayer() {
        System.out.println("Jersey No: " + jno + ", Name: " + name + ", Runs: " + run + ", Matches: " + match);
    }
}

public class PlayerDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] p1 = new Player[3];

        for (int i = 0; i < p1.length; i++) {
            p1[i] = new Player();
            System.out.print("Enter the jersey number of player: ");
            int jno = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter the name of the player: ");
            String name = sc.nextLine();

            System.out.print("Enter the runs of the player: ");
            int run = sc.nextInt();

            System.out.print("Enter the number of matches of this player: ");
            int match = sc.nextInt();

            p1[i].setJno(jno);
            p1[i].setName(name);
            p1[i].setRun(run);
            p1[i].setMatch(match);
        }

        System.out.println("\nPlayer Details:");
        for (int i = 0; i < p1.length; i++) {
            if (p1[i] != null) {
                p1[i].displayPlayer();
            }
        }

        System.out.println("\nEnter the index of the player to delete ");
        int deleteIndex = sc.nextInt();

        if (deleteIndex >= 0 && deleteIndex < p1.length) {
            p1[deleteIndex] = null;
            System.out.println("Player at index " + deleteIndex + " deleted.");
        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("\nRemaining Player Details:");
        for (int i = 0; i < p1.length; i++) {
            if (p1[i] != null) {
                p1[i].displayPlayer();
            }
        }
	 // Sort p1 by matches in ascending order
        for (int i = 0; i < p1.length - 1; i++) {
            for (int j = i + 1; j < p1.length; j++) {
                if (p1[i] != null && p1[j] != null && p1[i].getMatch() > p1[j].getMatch()) {
                    Player temp = p1[i];
                    p1[i] = p1[j];
                    p1[j] = temp;
                }
            }
        }

        // Display sorted player information by matches
        System.out.println("\nPlayers' Information after Sorting by Matches:");
        for (int i = 0; i < p1.length; i++) {
            if (p1[i] != null) {
                p1[i].displayPlayer();
            }
        }
        sc.close();
    }
}