import java.util.Random;
public class Board{
    private static int pieces;
    public Board(){

    }
    public static void populate(){
        Random r= new Random();
        pieces = r.nextInt(41) +10;
    }
    public static int getNumPieces(){
        return pieces;
    }
    public static void removePieces(int numPieces){
        pieces -= numPieces;
    }
    public String toString(){
        return "Board has " + pieces + "pieces";   
    }
}

