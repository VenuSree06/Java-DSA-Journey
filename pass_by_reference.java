public class pass_by_reference {
    
static void change(int x){
       x=30;
   }
    public static void main(String[] args){
       int a=10;
       change(a);
        System.out.print(a);
    }
}
  