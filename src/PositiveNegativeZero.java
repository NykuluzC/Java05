public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(0);
        checkNumber(-5);
    }

    public static void checkNumber(int number){
        //method will not return any value
        if(number > 0){
            System.out.println("positive");
        } else if(number < 0){
            System.out.println("negative");
        } else {
            System.out.println("0");
        }
    }
}
