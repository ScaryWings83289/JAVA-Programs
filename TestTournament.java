// Tournament Problem
import java.util.Scanner;
public class TestTournament {
    public static void main(String[] args) {
        Tournament testTournament = new Tournament();
        testTournament.fillTournament();
        testTournament.displayTournament();
    }
}
class Player {
    String name;
    int age;
    String role;
    public void setName(String text) {
        name = text;
    }
    public void setAge(int number) {
        age = number;
    }
    public void setRole(String text) {
        role = text;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getRole() {
        return role;
    }
    public void displayDetails() {
        System.out.println("\nName: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Role: " + this.getRole());
    }
    public void setDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.setName(scan.next());
        System.out.print("Enter age: ");
        this.setAge(scan.nextInt());
        System.out.print("Enter role: ");
        this.setRole(scan.next());
        scan.close();
    }
}
class Team {
    String teamName;
    int numPlayers;
    Player[] playerArr;
    public void setTeamName(String text) {
        teamName = text;
    }
    public void setNumPlayers(int number) {
        numPlayers = number;
    }
    public String getTeamName() {
        return teamName;
    }
    public int getNumPlayers() {
        return numPlayers;
    }
    public void fillTeam() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Team Name: ");
        this.setTeamName(scan.nextLine());
        System.out.print("Enter number of players: ");
        this.setNumPlayers(scan.nextInt());
        playerArr = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            playerArr[i] = new Player();
            System.out.println("Player " + (i+1) + ":");
            playerArr[i].setDetails();
        }
    }
    public void displayTeam() {
        System.out.println("\nTeam name: " + this.getTeamName());
        System.out.println("Total players: " + this.getNumPlayers());
        for (int i = 0; i < this.getNumPlayers(); i++) {
            System.out.println("Player " + (i+1) + " Details:");
            playerArr[i].displayDetails();
        }
    }
}
class Tournament {
    String tournamentName;
    int numTeams;
    Team[] teamArr;
    public void setTournamentName(String text) {
        tournamentName = text;
    }
    public void setNumTeams(int number) {
        numTeams = number;
    }
    public String getTournamentName() {
        return tournamentName;
    }
    public int getNumTeams() {
        return numTeams;
    }
    public void fillTournament() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Tournament Name: ");
        this.setTournamentName(scan.next());
        System.out.print("Enter number of teams: ");
        this.setNumTeams(scan.nextInt());
        teamArr = new Team[numTeams];
        for (int i = 0; i < numTeams; i++) {
            teamArr[i] = new Team();
            System.out.println("Team " + (i+1) + ":");
            teamArr[i].fillTeam();
        }
    }
    public void displayTournament() {
        System.out.println("\nTournament name: " + this.getTournamentName());
        System.out.println("Total teams: " + this.getNumTeams());
        for (int i = 0; i < this.getNumTeams(); i++) {
            System.out.println("Team " + (i+1) + " Details:");
            teamArr[i].displayTeam();
        }
    }
}