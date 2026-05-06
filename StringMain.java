
class StringStat{
      String str;
      StringStat(String str){
            this.str=str;
      }
      int countCharacters(){
            int ccount=0;
            for(int i=0; i<str.length(); i++){
                  char c=str.charAt(i);
                  if(c!=' ') ccount++;
            }
            return ccount;
      }

      int countWords(){
            int wcount=0;
            for(int i=0; i<str.length(); i++){
                  char c=str.charAt(i);
                  if(c==' ') wcount++;
            }
            return wcount+1;
      }
      int countSentence(){
            int scount=0;
            for(int i=0; i<str.length(); i++){
                  char c=str.charAt(i);
                  if(c=='.' || c=='!') scount++;
            }
            return scount;
      }

      int VowelConsonentCount(boolean b){
            int count=0;
            for(int i=0; i<str.length(); i++){

                  char c=str.charAt(i);
                  c=Character.toLowerCase(c);
                  if(Character.isLetter(c)){
                        if(b && (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')) count ++;

                        if(!b && (c!='a' && c!='e' && c!='i' && c!='o' && c!='u')) count++;
                  }
            }
            return count;
      }
}
class StringMain{
      public static void main(String args[]){
            String s=args[0];
            
            StringStat ob1= new StringStat(s);
            System.out.println("The character in a string : "+ob1.countCharacters());
         
            System.out.println("The words in a string : "+ob1.countWords());

            System.out.println("The sentences in a string : "+ob1.countSentence());

            boolean b=Boolean.parseBoolean(args[1]); // True for vowel, fals consonent
            
            if(b)  System.out.println("The no of Vowels in a string : "+ob1.VowelConsonentCount(b));

            else  System.out.println("The Consonents in a string : "+ob1.VowelConsonentCount(b));
            

           



      }


}