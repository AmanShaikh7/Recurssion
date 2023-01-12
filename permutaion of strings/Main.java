import java.util.*;
  
public class Main{
  
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String s=scn.nextLine();
      String asf="";
      permutationPrint(s,asf);
   }
   public static void permutationPrint(String ques, String asf)
    {
       if(ques.length()==0){
		   System.out.println(asf);
		   return;
	   }
		for(int i=0;i<ques.length();i++){            // because at every place their can be a ,b, or c to to have each every time we are using for loop
			char toAdd = ques.charAt(i);
			String left = ques.substring(0,i);
			String right = ques.substring(i+1);
			String siq = left+right ;
			permutationPrint(siq,asf+toAdd);
		}
    }
  }