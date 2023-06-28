public class Pointer {
    public static void main(String[] args) {
       int num = 4;
       int c = 2;

       while(c < num){
           if(num % c == 0){
               System.out.println("not prime");
               break;
           }
           else{
               c++;
           }
       }
       System.out.println("Prime");
    }
}
