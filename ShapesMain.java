class Shapes{
      double area(float a){
            return (a*a);
      }
      double area(float l,float b){
            return (l*b);
      }
      double area(float a,float b,float c){
            double s=(a+b+c)/2;
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
      }

}
class ShapesMain{
      public static void main(String args[]){
            Shapes ob1=new Shapes();
            System.out.println("Area of square : "+ob1.area(5));
            System.out.println("Area of rectanlge : "+ob1.area(10,5));
            System.out.println("Area of triangle : "+ob1.area(10,10,5));
      }
}