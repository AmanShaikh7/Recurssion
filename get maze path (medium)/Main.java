import java.io.*;
import java.util.*;

/*
  you can only make the following moves:

Move one cell to the right (denoted as h1)
Move two cells to the right (denoted as h2)
Move one cell down (denoted as v1)
Move two cells down (denoted as v2)
Move one cell diagonally down and right (denoted as d1)
Move two cells diagonally down and right (denoted as d2)
 */
public class Main {
	public static ArrayList<String> getPaths(int i,int j, int n, int m){
		if(i==m-1 && j==n-1){
			ArrayList<String> ba = new ArrayList<String>();
			ba.add("");
			return ba;
		}
		if(i>=m || j >=n){
			ArrayList<String> ba = new ArrayList<String>();
			return ba;
		}
		ArrayList<String> ans = new ArrayList<>();
		//one cell to right (h1)
		ArrayList<String> h1paths = getPaths(i,j+1,n,m);
		for(int k =0;k<h1paths.size();k++){
			String removed = h1paths.get(k);
			String toAdd = "h1"+removed;
			ans.add(toAdd);
		}
		//h2 moves
		ArrayList<String> h2paths = getPaths(i,j+2,n,m);
		for(int k =0;k<h2paths.size();k++){
			String removed = h2paths.get(k);
			String toAdd = "h2"+removed;
			ans.add(toAdd);
		}
		//v1 moves
		ArrayList<String> v1paths = getPaths(i+1,j,n,m);
		for(int k =0;k<v1paths.size();k++){
			String removed = v1paths.get(k);
			String toAdd = "v1"+removed;
			ans.add(toAdd);
		}
		//v2 moves
		ArrayList<String> v2paths = getPaths(i+2,j,n,m);
		for(int k =0;k<v2paths.size();k++){
			String removed = v2paths.get(k);
			String toAdd = "v2"+removed;
			ans.add(toAdd);
		}
		//d1 moves
		ArrayList<String> d1paths = getPaths(i+1,j+1,n,m);
		for(int k =0;k<d1paths.size();k++){
			String removed = d1paths.get(k);
			String toAdd = "d1"+removed;
			ans.add(toAdd);
		}
		//d2 moves
		ArrayList<String> d2paths = getPaths(i+2,j+2,n,m);
		for(int k =0;k<d2paths.size();k++){
			String removed = d2paths.get(k);
			String toAdd = "d2"+removed;
			ans.add(toAdd);
		}
		return ans;
		
	}
    public static ArrayList<String> allPossiblePaths(int n, int m) {
			ArrayList<String> ans = getPaths(0,0,n, m);
		return ans ;
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> result = allPossiblePaths(n, m);
        Collections.sort(result);
        for (String str : result) {
            System.out.println(str);
        }

    }
}
