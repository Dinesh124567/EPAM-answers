import java.util.*;

public class PlusMin{
   public static void main(String []ar){
       Scanner s=new Scanner(System.in);
       if(backtr(0,0,"", Integer.toString(s.nextInt())));
       else System.out.println("not possible");
}

   public static boolean backtr(int sum, int pos, String str, String num){
         String t="";
                 for(int i=0; i<num.length(); i++) t+="-";
         if(sum==0 && pos==num.length())
             { if(str.charAt(0)=='+')System.out.println(str.substring(1,str.length()));
               else System.out.println(str); return true;}             

  
        else if(pos<num.length()){
             if(backtr(sum+Integer.parseInt(Character.toString(num.charAt(pos))), pos+1, str+"+", num))return true;
             if(backtr(sum-Integer.parseInt(Character.toString(num.charAt(pos))), pos+1, str+"-", num))return true; 
             }
       
        return false;

      
}}
