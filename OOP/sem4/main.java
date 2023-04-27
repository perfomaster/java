import SHIELD.buckler;
import WEAPON.bow;
import WEAPON.sword;

public class main {
    public static void main(String[] args) {
        team <swordTeam> team1 = new team<>();
        team1.addWarriorToTeam(new swordTeam("Vasya", 250, new sword(25)))
        .addWarriorToTeam(new swordTeam("John", 200, new sword(50), new buckler(50, 100)));

        for (swordTeam swordman : team1) {
            System.out.println(swordman);
        }

        team <bowTeam> team2 = new team<>();
        team2.addWarriorToTeam(new bowTeam("Kolya", 150, new bow(100, 50)))
        .addWarriorToTeam(new bowTeam("Paul", 200, new bow(75, 70)));

        for (bowTeam person : team2) {
            System.out.println(person);
        }

        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());
        System.out.println(team1.minArmor());
    }
    
    
}