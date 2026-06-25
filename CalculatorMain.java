import java.util.Scanner;
class Calculator{
	double n1,n2;

	Calculator(double n1,double n2){
		this.n1 = n1; 
		this.n2 =n2;	
	}
	
	void calc(){
		try{
			if(n2==0) throw new ArithmeticException("Divisor cannot be zero");
			else{
				double res = n1/n2;
				System.out.print("Div of 2 numbers : "+res);
			}
			
		}
		catch(ArithmeticException e){
			System.out.print("Diviosr cannot be zero");
		}
	}
	
}
class CalculatorMain{
	public static void main(String[] args){
		
		Calculator ob1 = new Calculator(12,0);
		ob1.calc();
		System.out.println();
		Calculator ob2 = new Calculator(12,4);
		ob2.calc();
	}
		

}