class StringStat{
      public static void main(String args[]){
            String s1=args[0];
            int words=0,sentence=0,chars=0;
            for(int i=0; i<s1.length(); i++){
                  chars++;

                  if(s1.charAt(i)==' ') words++;

                  if(s1.charAt(i)=='.' || s1.charAt(i)=='!') sentence++;
            }
            
            System.out.println("No of charactrs : "+chars);
            System.out.println("No of wrds : "+(words+1));
            System.out.println("No of sentences : "+sentence);

      }

}