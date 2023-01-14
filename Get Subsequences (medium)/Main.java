import java.io.*;
import java.util.*;
// try with faith as ab ==> for string abc

public class Main {
    public static ArrayList<String> generateSubsequences(String str)
    {
        if(str.length()==0){
			ArrayList<String> ba = new ArrayList<String>();
			ba.add("");
			return ba;
		}
		char lc = str.charAt(str.length()-1);
		String ss = str.substring(0,str.length()-1);
		
		ArrayList<String> sans =  generateSubsequences(ss);
		ArrayList<String> ans = new ArrayList<String>();
		for(int i=0;i<sans.size();i++){
			String removed = sans.get(i);
			ans.add(removed);

			String toadd = removed+ lc;
			ans.add(toadd);
		}
		
		Collections.sort(ans);
		
		return ans;
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        ArrayList<String> res = generateSubsequences(s);
		res.remove(0);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}