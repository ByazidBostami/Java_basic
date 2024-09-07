import java.util.*;
public class minusn {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner user=new Scanner(System.in);
        int UserInput=user.nextInt();
        int y=0;
        for (int i=0;i<UserInput+1;i++){
            if(i%2==0){
                y=y-(i*i);
            }
            else{
                y=y+i*i;
            }

        }
        System.out.println(y);

        
    }
    
}
