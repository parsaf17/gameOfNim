public class Player {
    private String name;
    private int score;

    // methods in class
    public Player(){
        name = "Player 1";
        score = 0;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void incrScore(){
        score++;
    }

    public  void setName(String newName){
        name = newName;
    }

    public void setScore(int newScore){
        score = newScore;
    }
    
    public String toString(){
        return  name + " has score of " + score;   
    }
}
