import java.util.*;

//do recurssion by keeping first digit 
// then do recurrsion by keeping two digit (only if digits are <=26 and length of digits >=2 )

public class Main {
    public static void printEncodings(String str,String asf) {

	if(str.length()==0){
	System.out.println(asf);
		return ;
	}
	if(str.charAt(0)=='0'){
		return;
	}

		int firstDigit = str.charAt(0)-'0';
		String ss = str.substring(1);
		char toAdd = (char)('a'+firstDigit-1);
		printEncodings(ss,asf+toAdd);

		if(str.length()>=2){
			int twoDigit = Integer.parseInt(str.substring(0,2));
			if(twoDigit <=26){
				char toadd = (char)('a'+twoDigit-1);
				ss = str.substring(2);
				printEncodings(ss,asf+toadd);
			}
		}
		
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str,"");
    }
}