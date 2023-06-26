public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        calculateScore(gameOver,finalScore,levelCompleted,bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        calculateScore(gameOver, finalScore, levelCompleted, bonus);
    }
    public static void calculateScore(boolean gameOver, int finalScore, int levelCompleted, int bonus){
        if(gameOver){
            finalScore += (levelCompleted * bonus) + 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}

