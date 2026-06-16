public class Recursive {
    static int  power(int a, int n){
        if(n==0){
            return 1;
       // if(n==0|| n==1)       //fac
       //return 1;               //fac
         //if(n==0){                          //fib
           // return 0;                      //fib
         }
         return a*power(a,n-1);
        }
     //if(n==1){                               //fib
      // return 1;}                             //fib
        //return n*fac(n-1);            //fac
        // return fib(n-1)+fib(n-2);}            //fib
        
        public static void main(String[] args) {
            
            System.out.print(power(2,5));
        }
    }
    

