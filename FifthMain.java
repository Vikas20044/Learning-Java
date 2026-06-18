import java.util.Scanner;
abstract class Shape{

	abstract double area();
	abstract double perimeter();
	abstract void display();
}
class Circle extends Shape{
	float radius;
	Circle(float radius){
		this.radius=radius;
	}	
	@Override
	void display(){
		System.out.println("The radius of circle : "+radius);
		System.out.println("The area of circle : "+area());
		System.out.println("The circumstances of circle : "+perimeter());
	}
	double area(){
		return ((22/7)*(radius*radius));

	}
	double perimeter(){
		return (2*(22/7)*radius);
	}

}
class Rectangle extends Shape{
	float length,breadth;
	Rectangle(float length,float breadth){
		this.length=length;
		this.breadth=breadth;
	}
	@Override	
	void display(){
		System.out.println("The length : "+length);
		System.out.println("The breadth : "+breadth);
		System.out.println("The area of rectangle : "+area());
		System.out.println("The circumstances of rectangle : "+perimeter());
	}
	double area(){
		return length*breadth;

	}
	double perimeter(){
		return 2*(length+breadth);
	}

}

class Triangle extends Shape{
	float a,b,c;
	Triangle(float a,float b,float c){
		this.a=a;
		this.b=b;
		this.c=c;
	}	
	@Override
	void display(){
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("C : "+c);
		System.out.println("The area of triangle : "+area());
		System.out.println("The perimeter of triangle : "+perimeter());
	}
	double area(){
		float s=(float)(a+b+c)/2;
		return Math.sqrt((s*((s-a)*(s-b)*(s-c))));

	}
	double perimeter(){
		return a+b+c;
	}

}
class Prime{
	int num;
	Prime(int num){
		this.num=num;
	}
	boolean isPrime(int num){
		if(num<=1) return false;
		for(byte i=2; i<num; i++) if(num%i==0) return false;
	
		return true;

	}
	void printNum(){
	
		for(byte i=2; i<=num; i++) if(isPrime(i)) System.out.print(i+" ");		

	}

	void display(){
		if(isPrime(num)) System.out.println("The number "+num+" is Prime");
		else System.out.println("The number "+num+" is not Prime");

		System.out.println("Prime number till "+num);
		printNum();

	}
	
}
class Fib{
	int num;
	Fib(int num){
		this.num=num;
	}
	void display(){
		System.out.println("Fibonnaci number till n : "+num);
		for(int i=0; i<num; i++) System.out.print(fib(i)+" ");

	}
	int fib(int n){
		if(n==0 || n==1) return 1;

		return fib(n-1)+fib(n-2);
	}

}

class FifthMain{
	public static void main(String args[]){
		int choice;
		Scanner s=new Scanner(System.in);
		boolean flag = true;
		while(flag){
			System.out.println("1. Cricle 2. Rectangle 3. Triangle 4. Prime Number 5. Fibonacci 0. Exit");
			System.out.print("Enter your choice : ");
			int ch=s.nextInt();
			switch(ch){
				case 1:
					System.out.println("Circle : ");
					System.out.println("Enter radius of circle  : ");
					float n1= s.nextFloat();
					Circle ob1= new Circle(n1);
					ob1.display();                                                                                                   
					System.out.println();
					break;
				case 2:
					System.out.println("Rectangle : ");		
					System.out.println("Enter Length and breadth Rectangle : ");
					float n2= s.nextFloat();
					float n3= s.nextFloat();

					Rectangle ob2=new Rectangle(n2,n3);
					ob2.display(); 
					System.out.println();
					break;

				case 3:	
					System.out.println("Triangle : ");		
					System.out.println("Enter a, b and c of triangle : ");

					float n4= s.nextFloat();

					float n5= s.nextFloat();

					float n6= s.nextFloat();

					Triangle ob3=new Triangle(n4,n5,n6);
					ob3.display();
					System.out.println();
					break;
				case 4:
					System.out.println("Prime number :");
					System.out.print("Enter a number : ");
					int n7=s.nextInt();
					Prime ob4=new Prime(n7);
		
					ob4.display();
					break;
				case 5:
					
					System.out.print("Enter a number : ");
					int n8=s.nextInt();
					Fib ob5=new Fib(n8);
		
					ob5.display();
					break;
				case 6:
					flag = false;
					break;
				

			}
		}
	}


}