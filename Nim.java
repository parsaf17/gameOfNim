public class Nim{
    public static void main(String args[]){
        

        System.out.println("Welcome to the Game of Nim!");

        Board.populate(); // static method call
        
        Game nim = new Game(); 
        nim.play();





    }
}
