public class If_Elseif_Else {
    public static void main(String[] args) {
        int value = 1; //expression count: 1
        if (value == 1) { //expression count: 1
            System.out.println("Value was 1"); //expression count: 1
        } else if (value == 2) { //expression count: 1
            System.out.println("Value was 2"); //expression count: 1
        } else {
            System.out.println("Was not 1 or 2"); //expression count: 1
        }
    }
}