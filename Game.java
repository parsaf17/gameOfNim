import java.util.Scanner;
import java.util.Random;
public class Game {
    private Player p1;
    private Player p2;
    private String playAgain;
    private String StartPlay;
    int p1Score = 0;
    int p2Score = 0;

    public Game(){
        playAgain ="";
        StartPlay="";
        p1= new Player();
        p2 = new Player();
    }
    public void play(){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play?");
        playAgain = sc.nextLine();
        if (playAgain.equalsIgnoreCase("yes")){// prompts user to choose names
            System.out.println("Enter first players name.");
            String name1= sc.nextLine();
            p1.setName(name1);
            System.out.println("Enter second players name. ");
            String name2= sc.nextLine();
            p2.setName(name2);
        }
        while(playAgain.equalsIgnoreCase("yes")) {
        //generate a random int 0 = player 1 and 1 = player 2
            Random r = new Random();
            int firstMove = r.nextInt(2);
            Board.populate();
            while(Board.getNumPieces() > 1){// this creates the number of board pieces  and prompts user to choose the number of pieces to be taken off the board 
                do{
                System.out.printf("The board has %d pieces", Board.getNumPieces());
                if(firstMove == 0)
                    System.out.printf("Enter number of pieces you want to remove %s", p1.getName());
                else if(firstMove == 1)
                     System.out.printf("Enter number of pieces you want to remove %s", p2.getName());
                 num = sc.nextInt();
                }while(num > Board.getNumPieces()/2);
                Board.removePieces(num);
                firstMove=(firstMove+1)%2;
                
             }
            if((firstMove+1)%2 == 0){//whichever player wins the game will have a score of 1
                System.out.printf("Congratulations you won %s", p1.getName());
                p1Score += 1;
                System.out.println(" ");
                System.out.println("Player ones score is: " + p1Score) ;
                System.out.println("Player twos score is: " + p2Score);
            }
            else if((firstMove+1)%2 == 1){
                System.out.printf("Congratulations you won %s", p2.getName());
                p2Score += 1;
                System.out.println(" ");
                System.out.println("Player twos score is: " + p2Score);
                System.out.println("Player ones score is: " + p1Score);
            }
            System.out.println("Do you want to continue playing? ");// prompts user to either play again or stop playing 
            sc.nextLine();
            playAgain = sc.nextLine();


            if(playAgain.equalsIgnoreCase("no")){// if player says no then game is over
                System.out.println("Game is over!");
            }
        }
        
    }   
}
