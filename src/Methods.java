public class Methods {
    public static void main(String[] args) {
        //1st index
        int highScore = calculateScore(true, 800,5,100);
        System.out.println("The first high score is: " + highScore);
        //2nd index
        highScore = calculateScore(true,10000, 8, 200);
        System.out.println("The next high score is: " + highScore);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted * bonus) + 1000;
        }
        return finalScore;
    }
}

