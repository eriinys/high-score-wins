import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String gameScore = readLine(myScanner,"Enter the game score in x:y|0:0 format: ");

        //SPLIT Team Names/Team Scores
        String[] parts = gameScore.split("\\|");
        String teamNames = parts[0];
        String teamScores = parts[1];

        //Team Names
        String[] names = teamNames.split(":");
        String name1 =  names[0];
        String name2 = names[1];

        //Team Scores
        String[] scores = teamScores.split(":");
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt((scores[1]));

        //output
        if (score1 > score2) {
            System.out.println("Winner: " + name1);
        } else if (score2 > score1) {
            System.out.println("Winner: " + name2);
        } else {
            System.out.println("TIE");
        }

    }
    public static String readLine(Scanner in, String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }

    
}
