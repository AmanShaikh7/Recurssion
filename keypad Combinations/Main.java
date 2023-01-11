import java.io.*;
import java.util.*;
public class Main
{
    static String sarr[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static ArrayList<String> PrintKPC(String str){
        if(str.length()==0){
            ArrayList<String> ba = new ArrayList<String>();
            ba.add("");
            return ba;
        }
        
        int firstChar = str.charAt(0) - '0';    // to get integer value of first char //eg: 5=53 and 0=48 so 53-48=5
        String ss = str.substring(1);
        ArrayList<String> sans = PrintKPC(ss);
        ArrayList<String> ans = new ArrayList<String>();
        String possibilities = sarr[firstChar];
        
        for(int i=0;i<possibilities.length();i++){
            char Toadd = possibilities.charAt(i);
            for(int j=0;j<sans.size();j++){
                String got = sans.get(j);
                
                String tobeadded = Toadd+got;
                ans.add(tobeadded);
            }
        }
        return ans;
    }
	public static void main(String[] args) {
	    Scanner Sc = new Scanner(System.in);
	    String input = Sc.nextLine();
		ArrayList<String>  ans = PrintKPC(input);
		System.out.print(ans);
	}
}
