import java.util.Scanner;
class Excep{
      void division(int num1, int num2){
            int res = num1 / num2;
            System.out.println("Division of two numbers : "+res);
      } 
      void arrayIndexop(int[] arr,int idx){
            System.out.println(arr[idx]);
      }
      void nullptrExcep(String s){
            System.out.println("Length of string : "+s.length());

      }
      void stringIndex(String s){
            System.out.println("Chart at index 10 : "+s.charAt(10));
      }
      void stringtoNum(String s) {
            
            int convertedNum = Integer.parseInt(s); 
            System.out.println("Converted Number: " + convertedNum);
    }
}
class ExcpMain{
      public static void main(String[] args) {
            Excep ob1 = new Excep();   
            Scanner sc = new Scanner(System.in);       
            int ch;
            System.out.println("Handling exception");
            System.out.println("1. ArithmetcicDivision exception 2. Handing array index 3. Nullptr excp 4. String index exception 5. Numberformat exception 0. Exit");
            ch = sc.nextInt();
            try {
                 switch(ch){
                        case 1:
                              System.out.println("Enter two numbers : ");
                              int n1 = 10;
                              int n2= 0;
                              ob1.division(n1,n2);
                              break;
                        case 2:
                              int[] arr = {5,7,2,4};
                              System.out.println("Array elements are : ");
                              for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
                  
                              int idx = 4;
                              ob1.arrayIndexop(arr,idx);
                              break;

                        case 3:
                              String s = null;
                              ob1.nullptrExcep(s);
                              break;

                        case 4:
                              String s1 = "Victuss";
                              ob1.stringIndex(s1);
                              break;

                        case 5:
                              String s2 = "abc";
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