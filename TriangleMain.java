class TrianglePattern{
      int limit;
      TrianglePattern(int limit){
            this.limit = limit;
      }
      void printPattern(){
            for(int i=1; i<=limit; i++){
                  for(int j=1; j<=i; j++){
                        System.out.print(j+" ");
                  }
                  System.out.println();
            }
            System.out.println();
      }

}
class TriangleMain{
      public static void main(String args[]){
            
            int p1=Integer.parseInt(args[0]);
            int p2=Integer.parseInt(args[1]);
            int p3=Integer.parseInt(args[2]);

            TrianglePattern ob1=new TrianglePattern(p1);
            TrianglePattern ob2=new TrianglePattern(p2);
            TrianglePattern ob3=new TrianglePattern(p3);

            ob1.printPattern();
            ob2.printPattern();
            ob3.printPattern();
          
            /*

            TrianglePattern ob[]=new TrianglePattern[10];
            for(int i=0; i<args.length; i++){
                  ob[i]=new TrianglePattern(Integer.parseInt(args[i]));
                  ob[i].printPattern();
            }
            */

      }
}