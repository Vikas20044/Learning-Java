class Circle{
      float radius;
      Circle(float radius){
            this.radius=radius;
      }
      void display(){
            System.out.println("Area of circle : "+area());
            System.out.println("Circumstance of circle : "+circumference());
            System.out.println();
      }
      double area(){
            return ((22/7)*radius*radius);
      }
      double circumference(){
            return (2*(22/7)*radius);
      }
}
class Rectangle{
      float length,breadth;
      Rectangle(float length,float breadth){
            this.length=length;
            this.breadth=breadth;
      }
      void display(){
            System.out.println("Area of rectanlge : "+area());
            System.out.println("Perimeter of Rectangle : "+perimeter());
            System.out.println();
      }
      double area(){
            return (length*breadth);
      }
      double perimeter(){
            return (2*(length+breadth));
      }
      
}
class Triangle{
      float a,b,c;
      Triangle(float a,float b,float c){
            this.a=a;
            this.b=b;
            this.c=c;
      }
      void display(){
            System.out.println("Area of triangle : "+area());
            System.out.println("Perimeter of triangle : "+perimeter());
            System.out.println();
      }
      double area(){
            double s=(a+b+c)/2;
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
      }
      double perimeter(){
            return (a+b+c);
      }

}

class Program5Main{
      public static void main(String args[]){
            //circlee
            float radius=Float.parseFloat(args[0]);
            Circle circ=new Circle(radius);
            circ.display();

            //Recatngle
            float length=Float.parseFloat(args[1]),breadth=Float.parseFloat(args[2]);
            Rectangle r=new Rectangle(length,breadth);
            r.display();

            //Triangle
            float a=Float.parseFloat(args[1]),b=Float.parseFloat(args[2]),c=Float.parseFloat(args[2]);
            Triangle t=new Triangle(a,b,c);
            t.display();
            
            
      }
}