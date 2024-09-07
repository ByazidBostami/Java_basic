import java.util.*;
public class divisible_counter {
    public static void main(String[] args) {
        System.out.println("Please input a number :");
        Scanner user=new Scanner(System.in);
        int input=user.nextInt();
        int count=0;
        for (int i=1;i<input+1;i++){
            if(input%i==0){
                count++;
                System.out.println(input+"%"+i+"="+0);


            }
        }
        System.out.println("Total divisor "+count);
    }
    
}
