package sg.edu.nus.iss.app;

import java.util.Random;

public class SCP {
    public Integer generateComputerChoice(){
        Random rand = new Random();
        int randomInt = rand.nextInt(3);
        // System.out.println("Random answer >>>" + randomInt);
        return randomInt;
    }

    public String checkWinner(int playerChoice, int computerChoice){
        String winner = "";

        int results = playerChoice - computerChoice;

        switch(results){
            case -1:
                winner = "Player";
                break;
            case -2:
                winner = "Computer";
                break;
            case 1:
                winner = "Computer";
                break;
            case 2:
                winner = "Player";
                break;
            default:
                winner = "Its a tie, no winner";
                break;
        }
        // System.out.println(results);
        return winner;
    }
}