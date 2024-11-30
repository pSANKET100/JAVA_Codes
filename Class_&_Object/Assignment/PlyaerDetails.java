class Player {
    private int id;
    private String name;
    private int runs;

   
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getRuns() {
        return runs;
    }
}
class Team {

   
    public void showPlayerDetails(Player... players) {
        System.out.println("Team Players Details:");
        System.out.println("ID\tName\tRuns");

      
        for (Player player : players) {
            System.out.println(player.getId() + "\t" + player.getName() + "\t" + player.getRuns());
        }
    }
}
public class PlyaerDetails {
    public static void main(String[] args) {
        
        Player player1 = new Player();
        player1.setId(1);
        player1.setName("Player A");
        player1.setRuns(50);

        Player player2 = new Player();
        player2.setId(2);
        player2.setName("Player B");
        player2.setRuns(70);

        Player player3 = new Player();
        player3.setId(3);
        player3.setName("Player C");
        player3.setRuns(30);

        
        Team team = new Team();
      
        team.showPlayerDetails(player1, player2, player3);
    }
}


