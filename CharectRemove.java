
import java.util.*; 
import java.io.*;

public class CharectRemove {

  public static int CharacterRemoval(String[] strArr) {
    // code goes here  
    
   String[] str2= strArr[1].split(",");
    
   for(int i=0;i<str2.length;i++)
      {
       for(int j=i+1;j<str2.length;j++)
       {
          if(str2[i].length()<str2[j].length())
          {
            String temp= str2[i];
            str2[i]=str2[j];
            str2[j]=temp;
          }}}
    
int lst[]=new int [str2.length];
for(int i=0; i<lst.length; i++) lst[i]=0;
     
   for(int i=0; i<str2.length; i++){
       if(strArr[0].contains(str2[i])){
          lst[i]=strArr[0].length()-str2[i].length();
       }
       else{String dup=""+strArr[0]; int din=0;
           for(int j=0; j<str2[i].length(); j++)
               if(dup.charAt(j-din)!=str2[i].charAt(j-din)) { lst[i]++; dup=charRemoveAt(dup,j-din);  din++; }
           if(! dup.equals(str2[i]))lst[i]+=(dup.length());}
   }

   Arrays.sort(lst);
   return lst[0];
  }

 public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  

  public static void main (String[] args) {  
    // keep this function call here     

   
    Scanner sc = new Scanner(System.in);
    String[] input = new String[2];
    for (int i = 0; i < 2; i++) { 
        String userInput = sc.next(); 
        input[i] = userInput; 
    } 
    
    if(CharacterRemoval(input)==input[0].length())System.out.println(input[0].length()+" length");
    else System.out.print(CharacterRemoval(input)); 
  }
}
