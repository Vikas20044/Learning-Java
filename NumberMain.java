class Number{
      int num;
      Number(int num){
            this.num=num;
      }
      void fib(){
            System.out.println("The Fibonnaci series of first "+num+" numbers : ");
            int f1=0;
            int f2=1;
            System.out.print(f1);
            if(num>1) System.out.print(" "+f1);
            for(int i=2; i<num; i++){
                  int f3=f1+f2;
                  System.out.print(" ");
                  System.out.print(f3);
                  f1=f2;
                  f2=f3;
            }
            
      }
      void checkPrime(){
            if(num<2){
                  System.out.println("Number is not a prime.");
                  return;
            }
        
            for(int i=2; i<=((int)Math.sqrt(num)); i++){
                  if(num%i==0){
                        System.out.println("the number is not a prime.");
                        return;
                  }
            }
            System.out.println("the number is a prime.");
            
      }

}
class NumberMain{
      public static void main(String args[]){
            int n1=Integer.parseInt(args[0]);
            Number n=new Number(n1);
            n.checkPrime();
            n.fib();

      }
}