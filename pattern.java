import java.util.*;
public class pattern {
    public static void main(String[] args){
        System.out.println("Please enter how many row :");
        Scanner user=new Scanner(System.in);
        int input=user.nextInt();
        for (int count=1;count<input+1;count++){
            for(int space=1;space<(input-count)+1;space++){
                System.out.print("  ");
            }
            for(int num=1;num<(2*count-1)+1;num++){
                System.out.print(num+" ");
            }
            System.out.println("");
            
        }
    }
    
}
