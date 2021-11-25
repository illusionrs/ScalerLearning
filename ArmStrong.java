public class ArmStrong {

    ArmStrong(){}

     //Return count of Arm strong number from 1 t N
     public void Sol(int n){
       
        for(int i=1;i<=n;i++){
            int a = i;
            int sum =0;
            while(a!=0){
   
               int rem = a%10;
               sum+= rem*rem*rem;
               a=a/10;
            }

            if(sum==i)
            System.out.println(i);
            
        }
        
         
     }
    
}
