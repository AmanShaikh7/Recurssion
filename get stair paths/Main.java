import java.io.*;
import java.util.*;

// solve for n-1 , n-2 ,n-3 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);7
    }

    public static ArrayList<String> getStairPaths(int n) {

		if(n==0){
			ArrayList<String> ba = new ArrayList<>();
			ba.add("");
			return ba;
		}
		if(n<0){
			ArrayList<String> ba = new ArrayList<>();
			return ba;
		}
		ArrayList<String> ans = new ArrayList<String>();
		ArrayList<String> sans=getStairPaths(n-1);
		for(int i=0;i<sans.size();i++){
			String removed = sans.get(i);
			String toadd = "1"+removed;
			ans.add(toadd);
		}
		sans=getStairPaths(n-2);
		for(int i=0;i<sans.size();i++){
			String removed = sans.get(i);
			String toadd = "2"+removed;
			ans.add(toadd);
		}
		 sans=getStairPaths(n-3);
		for(int i=0;i<sans.size();i++){
			String removed = sans.get(i);
			String toadd = "3"+removed;
			ans.add(toadd);
		}
		return ans;
    }
}


                        
                                