// sample Input:

// Rajalakshmi
// Saveetha
// 22
// 21

// Output:

// Rajalakshmi 22 scored
// Saveetha 21 scored
// Rajalakshmi is the Winner!
//Code
import java.util.Scanner;

interface Sports {
    public void setHomeTeam(String name);
    public void setVisitingTeam(String name);
}

interface Football extends Sports {
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
}

class College implements Football {
    String homeTeam;
    String visitingTeam;
    int homeTeamPoints;
    int visitingTeamPoints;

    @Override
    public void setHomeTeam(String name) {
        this.homeTeam = name;
    }

    @Override
    public void setVisitingTeam(String name) {
        this.visitingTeam = name;
    }

    @Override
    public void homeTeamScored(int points) {
        this.homeTeamPoints = points;
        System.out.println(homeTeam + " " + points + " scored");
    }

    @Override
    public void visitingTeamScored(int points) {
        this.visitingTeamPoints = points;
        System.out.println(visitingTeam + " " + points + " scored");
    }

    public void winningTeam() {
        if (homeTeamPoints > visitingTeamPoints) {
            System.out.println(homeTeam + " is the winner!");
        } else if (homeTeamPoints < visitingTeamPoints) {
            System.out.println(visitingTeam + " is the winner!");
        } else {
            System.out.println("It's a tie match.");
        }
    }
}

public class Winning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hname = sc.nextLine();
        String vteam = sc.nextLine();

        int htpoints = sc.nextInt();
        int vtpoints = sc.nextInt();

        College s = new College();
        s.setHomeTeam(hname);
        s.setVisitingTeam(vteam);
        s.homeTeamScored(htpoints);
        s.visitingTeamScored(vtpoints);

        s.winningTeam();
        
        sc.close();
    }
}
