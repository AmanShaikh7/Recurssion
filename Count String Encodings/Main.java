import java.util.*;

//do recurssion by keeping first digit 
// then do recurrsion by keeping two digit (only if digits are <=26 and length of digits >=2 )

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    System.out.println(countEncodings(str));
  }

  public static int countEncodings(String str) {

	  if(str.length()==0){
		  return 1;
	  }
	  if(str.charAt(0)=='0'){
		  return 0;
	  }
	  int oneDigit=countEncodings(str.substring(1));
	  int twodigit=0;
	  if(str.length()>=2){
		  int secondchar = Integer.parseInt(str.substring(0,2));
		  if(secondchar <=26){
		   twodigit = countEncodings(str.substring(2));
		  }
	  }
	  int ans = oneDigit+twodigit;
	  return ans;
  }
}