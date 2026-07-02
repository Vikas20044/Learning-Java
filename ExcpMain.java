import java.util.Scanner;
class Excep{
	void arithmeticE(int num1,int num2) throws ArithmeticException {
		System.out.println("Division of num1 and num2 : "+(num1/num2));
	}
	void arrayIndexop(int[] arr,int idx) throws ArrayIndexOutOfBoundsException{
		
            	System.out.println(arr[idx]);
      	}
      	void nullptrExcep(String s)throws NullPointerException{
            	System.out.println("Length of string : "+s.length());

      	}
      	void stringIndex(String s,int idx)throws StringIndexOutOfBoundsException{
            System.out.println("Chart at index "+idx+": "+s.charAt(idx));
      	}
	void stringtoNum(String s) throws NumberFormatException{
            
            int convertedNum = Integer.parseInt(s); 
            System.out.println("Converted Number: " + convertedNum);
    	}
	
}
class ExcpMain{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Excep ob1 = new Excep();   
           	    
            	int ch;
		
            	System.out.println("Handling exception");
            	System.out.println("1. ArithmetcicDivision exception \n2. Handing array index \n3. String null ptr exeption \n4. String index exp \n5. Number format expt  0. Exit");
            	ch = sc.nextInt();
		try{
			switch(ch){
				case 0:
					return;
				case 1:	
					System.out.println("Enter num1 and num 2");
					int n1 = sc.nextInt();
					int n2 = sc.nextInt();
					ob1.arithmeticE(n1,n2);
					break;
				case 2:
					int[] arr = {5,4,6,2};
					System.out.println("Array elements are and give index to print :");
					for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
					System.out.println();
					int idx = sc.nextInt();
					ob1.arrayIndexop(arr,idx);
					break;
				case 3:
                              		String s = null;
                              		ob1.nullptrExcep(s);
                              		break;

                        	case 4:
                              		String s1 = "Victuss";
					System.out.println("String is"+s1);
					System.out.println("Enter index to access :");
					int id = sc.nextInt();
                              		ob1.stringIndex(s1,id);
                              		break;
				case 5:
					System.out.println("Enter a number in string to convert :");

                              		String s2 = sc.next();
                              		ob1.stringtoNum(s2);
                              		break;
										
			}
		}
		catch (ArithmeticException e) {
                  	System.out.println("Arithmetic Exception error");
                  
            	}
		catch(ArrayIndexOutOfBoundsException e){
                  	System.out.println("Array index is outof bound");
            	}
		catch(NullPointerException e){
                  	System.out.println("Null Pointer exception occured");
            	}

            	catch(StringIndexOutOfBoundsException e){
                  	System.out.println("String index is outof bound");
            	}
		catch (NumberFormatException e) {
                  	System.out.println(" NumberFormat Exception: ");
            	}
            	catch (Exception e) {
                  	System.out.println("General Exception occured");
            	}		
	}		
}