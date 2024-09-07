import java.util.*;
public class n{
    public static void main(String[] args) {
        System.out.println("Plese enter a number");
        Scanner input=new Scanner(System.in);
        int UserInput=input.nextInt();
        int y=0;
        for (int i=1;i<UserInput+1;i++){
            y=y+(i*i);

        }
        System.out.println(y);

    }
}