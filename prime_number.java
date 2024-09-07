import java.util.*;
public class prime_number {
    public static void main(String[]args){
        System.out.println("Please enter a Number :");
        Scanner input=new Scanner(System.in);
        int user=input.nextInt();
        for (int i=1;i<user+1;i++){
            int count=0;
            for (int j=1;j<i+1;j++){
                if (i%j==0){
                    count=count+1;

                }
                

            }
            if (count==2){
                System.out.println(i+" is a prime number");
            }
            count=0;
        }
    }
    
}
