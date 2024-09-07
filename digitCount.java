import java.util.*;
public class digitCount {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        int input=user.nextInt();
        int count=0;
        while(count>0){
            input=input/10;// need to floor
            count++;
        }
        System.out.print("Total digit is "+count);
    }
    
}
