package sg.edu.nus.iss.app;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int playerWinCount = 0;
        int compWinCount = 0;
        Console cons = System.console();

        while(true){
            System.out.println( "Input your choice: sc = scissor | pp = paper | st = stone | q = quit");

            String playerAns = cons.readLine();
            int playerAnsInt = 0;
            
            if(playerAns.equalsIgnoreCase("q")){
                System.out.println("Ending the game...Winner is >>> " + (playerWinCount > compWinCount? "Player" : "Computer"));
                break;
            }

            switch(playerAns){
                case "sc":
                    playerAnsInt = 0;
                    break;
                case "pp":
                    playerAnsInt = 1;
                    break;
                case "st":
                    playerAnsInt = 2;
                    break;
                default:
                    break;
            }

            SCP scp = new SCP();
            int compAnsInt = scp.generateComputerChoice();
            String compAns = "";
            switch(compAnsInt){
                case 0:
                    compAns = "sc";
                    break;
                case 1:
                    compAns = "pp";
                    break;
                case 2:
                    compAns = "st";
                    break;
                default:
                    break; 
            }

            String winner = scp.checkWinner(playerAnsInt, compAnsInt);
            if(winner.equalsIgnoreCase("player")){
                playerWinCount++;
            }else if(winner.equalsIgnoreCase("computer")){
                compWinCount++;
            }
            System.out.printf("Computer answer is: %s.\nWinner is >>> %s\n",compAns,winner); 
            System.out.printf("Player win count: %d || Computer win count: %d\n",playerWinCount,compWinCount);
        }
    }
}
