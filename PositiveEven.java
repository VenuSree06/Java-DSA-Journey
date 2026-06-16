public class PositiveEven {
    public static void main(String[] args) {
        int num =20;
        if( num>0){
            if(num%2==0){
                System.out.println("posivie even number");
            }
            else{
                System.out.println("positive odd number");
            }
        }
         else if(num<0){
            if(num %2==0){
                System.out.println("negative even number");
            }
            else{
                System.out.println("negative odd number");
            }
        }
        else{
            System.out.println("number is zero");
        }
    }
    
}
