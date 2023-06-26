public class MethodChallenge {
    public static void main(String[] args) {
        //name: Carl, score : 1000
        //name: Nykuluz, score 1500
        //name: Irven, score 500
        //name: Fuentes, score 100
        //name: Millanes, score 25
        int position  = calculateHighScorePosition(1000);
        displayHighScorePosition("Carl",position);
        position = calculateHighScorePosition(1500);
        displayHighScorePosition("Nykuluz",position);
        position = calculateHighScorePosition(500);
        displayHighScorePosition("Irven", position);
        position = calculateHighScorePosition(100);
        displayHighScorePosition("Fuentes", position);
        position = calculateHighScorePosition(25);
        displayHighScorePosition("Millanes",position);
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }
    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        } else if(score >= 500){
            return 2;
        } else if(score >= 100){
            return 3;
        }
        return 4;
    }
}
