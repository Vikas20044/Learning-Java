import java.util.Scanner;
interface Rectangle{
	double rectArea(float length,float breadth);
	//void rectDisplay(float length,float breadth);
		
}

interface Triangle{
	double TriArea(float a,float b,float c);
	//void triDisplay(float a,float b,float c);
	
}
interface Line{
	//void lineDisplay(float m,float x, float c);
	double lineY(float m,float x,float c);

}
interface Circle{
	//void circDisplay(float radius);
	double area(float radius);
	

}
class Geometry implements Rectangle,Triangle,Line,Circle{
	//float length,breadth,a,b,c,m,x,cc,radius;

	public void rectDisplay(float length,float breadth){
		System.out.println("The length : "+length);
		System.out.println("The breadth : "+breadth);
		System.out.println("The area of rectangle : "+rectArea(length,breadth));
	}
	@Override
	public double rectArea(float length,float breadth){
		return length*breadth;
	}

	
	public void triDisplay(float a,float b,float c){
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("C : "+c);
		System.out.println("The area of triangle : "+TriArea(a,b,c));
	}
	@Override
	public double TriArea(float a,float b,float c){
		float s=(float)(a+b+c)/2;
		return Math.sqrt((s*((s-a)*(s-b)*(s-c))));

	}

	
	public void lineDisplay(float m,float x, float cc){
		System.out.println("M : "+m);
		System.out.println("X : "+x);
		System.out.println("C : "+cc);
		System.out.println("Y : "+lineY(m,x,cc));


	}
	@Override
	public double lineY(float m,float x,float cc){
		return m*x+cc;
	}


	public void circDisplay(float radius){
		System.out.println("Radius : "+radius);
		System.out.println("Area of Circle : "+area(radius));


	}
	@Override
	public double area(float radius){
		return ((22/7)*(radius*radius));
	}

}
public class SixthMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Geometry rect = new Geometry();
		Geometry tri = new Geometry();
		Geometry ln = new Geometry();
		Geometry circ = new Geometry();

		System.out.println("Rectangle");
		System.out.println("Enter value for length and breadth : ");
		float length = sc.nextFloat();
		float breadth = sc.nextFloat();
		rect.rectDisplay(length,breadth);
		System.out.println();

		System.out.println("Triangle");
		System.out.println("Enter value for a, b ,c : ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		tri.triDisplay(a,b,c);
		System.out.println();

		System.out.println("Line");
		System.out.println("Enter value for m, x, c : ");
		float m = sc.nextFloat();
		float x = sc.nextFloat();
		float cc = sc.nextFloat();
		ln.lineDisplay(m,x,cc);
		System.out.println();
	
		System.out.println("Circle");
		System.out.println("Enter radius : ");
		float radius = sc.nextFloat();
		
		circ.circDisplay(radius);
		
		sc.close();


	}
  
}    