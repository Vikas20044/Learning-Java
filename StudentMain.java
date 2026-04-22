class Student{
      byte marks[];
      String name;

      Student(byte marks[],String name){
            this.marks=marks;
            this.name=name;            
      }
      int CalculateTotal(){
            int total=0;
            for(int i=0; i<marks.length; i++){
                  total+=marks[i];
            }
            return total;
      }
      double CalculateAvg(int total){
            return (total/marks.length);
      }

      char calculateGrade(double avg){
            for(int i=0; i<marks.length; i++){
                  if(marks[i]<50) return 'F';
            }
            if(avg>=90) return 'O';
            else if(avg>=80) return 'A';
            else if(avg>=70) return 'B';
            else if(avg>=60) return 'C';
            else return 'D';
           

      }
      void displayGrade(){
            int total=CalculateTotal();
            double avg=CalculateAvg(total);
           
            System.out.print("\n\n");
            System.out.print("Name : "+name+" ");
            for(int i=0; i<marks.length; i++){
                  System.out.print(" Mark "+(i+1)+" : "+marks[i]);
            }
            System.out.print(" Total : "+total+" Average : "+avg+" Grade :"+calculateGrade(avg));
      }


}
class StudentMain{
      public static void main(String[] args) {
            String names[]={"a","b","c","d","e"};
            byte marks[][]={{70,50,90,100,86},
                        {30,70,50,90,40},
                        {80,70,60,51,64},
                        {90,80,70,76,70},
                        {90,91,99,100,92}};
            Student s[]= new Student[5];
            for(int i=0; i<marks.length; i++){
                  s[i]=new Student(marks[i],names[i]);
                  s[i].displayGrade();
            }

            
      }
}