
import java.util.*; 
import java.io.*;

public class CharectRemove {

  public static int CharacterRemoval(String[] strArr) {
    // code goes here  
    int lest=strArr[1].length();
    int l1=lest;
    
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
  }
  }}
int lst[]=new int [str2.length];
for(int i=0; i<lst.length; i++) lst[i]=0;
     
   for(int i=0; i<str2.length; i++){
       if(strArr[0].contains(str2[i])){
          lst[i]=strArr[0].length()-str2[i].length();
       }
       else{String dup=""+strArr[0]; int min=0;
           for(int j=0; j<str2[i].length(); j++)
               if(dup.charAt(j)!=str2[i].charAt(j)) {lst[i]++; dup=charRemoveAt(dup,j);  }
           lst[i]+=(dup.length()-str2[i].length());}
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
    System.out.print(CharacterRemoval(input)); 
  }

}