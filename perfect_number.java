import java.util.*;;
public class perfect_number {
    public static void main(String[] args) {
        System.out.println("Please enter a number :");
        Scanner input=new Scanner(System.in);
        int user=input.nextInt();
        int count=0;
        for (int i=1;i<user+1;i++){
            int usercount=0;
            for (int j=1;j<i;j++){
                if(i%j==0){
                    usercount=usercount+j;
                }
                
                

            }
            if (usercount==i){
                System.out.println(i+" is a perfect Number ");
            }
            usercount=0;
        }
        
        


        //Need to recheck the programme 
        //yes! i did
    }
    
}
