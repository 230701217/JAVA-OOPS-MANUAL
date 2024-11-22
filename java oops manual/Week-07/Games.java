// Input 
// Sadhvin
// Sanjay
// Sruthi
// Output
// Sadhvin is Playing football
// Sanjay is Playing volleyball
// Sruthi is Playing basketball
//code:
import java.util.Scanner;
interface Playable {
    void play();
}
class Football implements Playable {
    String name;
    public Football(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println(name + " is Playing football");
    }
}
class Volleyball implements Playable {
    String name;
    public Volleyball(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println(name + " is Playing volleyball");
    }
}
class Basketball implements Playable {
    String name;

    public Basketball(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println(name + " is Playing basketball");
    }
}

public class Games{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String footballPlayer = sc.nextLine(); 
        Football football = new Football(footballPlayer);
        football.play();
        String volleyballPlayer = sc.nextLine();
        Volleyball volleyball = new Volleyball(volleyballPlayer);
        volleyball.play();
        String basketballPlayer = sc.nextLine();
        Basketball basketball = new Basketball(basketballPlayer);
        basketball.play();
        sc.close();
    }
}
