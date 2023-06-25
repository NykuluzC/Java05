public class StatementsWhiteSpaceAndIndenting {
    public static void main(String[] args) {
        int myVariable = 50; //1 expression 1 statement
        myVariable++; //1 statement
        myVariable--; //1 statement

        System.out.println("This is a test"); //1 statement

        System.out.println("This is" +
                " another" +
                " still more."); //1 statement

        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable); // 3 statements

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }
    }
}
