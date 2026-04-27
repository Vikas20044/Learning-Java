class Factorial{
      int n;
      Factorial(int n){
            this.n=n;
      }
      void printSteps(){
            for(int i=n; i>=1; i--){
                  System.out.print(i);
                  if(i!=1){
                        System.out.print(" * ");
                  }
            }
      }
      int fact(int num){
            int fact=1;
            while(num>=1){
                  fact=fact*num;
                  num--;
            }
            return fact;
      }
      void display(){
            System.out.print(n +" ! = ");
            printSteps();
            System.out.print(" = "+fact(n));
      }
}
class FactorialMain{
      public static void main(String args[]){
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            int n3=Integer.parseInt(args[2]);
            int n4=Integer.parseInt(args[3]);

            Factorial f1=new Factorial(n1);
            f1.display();
            System.out.println();

            System.out.println("Factorial from 1 to "+n2);

            Factorial f2=new Factorial(n2);

            for(int i=1; i<=n2; i++){
                  System.out.print(i+"!= ");
                  System.out.print(f2.fact(i));
                  System.out.println();
            }

            System.out.println();
            System.out.println("Factorial from "+n3+" to "+n4);

            Factorial f3=new Factorial(n3);
            for(int i=n3; i<=n4; i++){
                  System.out.print(i+"!= ");
                  System.out.print(f3.fact(i));
                  System.out.println();
            }



      }
}
