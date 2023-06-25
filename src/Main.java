public class Main {
    public static void main(String[] args) {
        int value = 2; //expression count: 1

        switch(value){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actual value is : " + value);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }
    }
}