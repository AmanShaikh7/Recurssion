import java.util.*;
import java.io.*;
public class Main {
    public static void aMazePaths(int i,int j,int n, int m, String psf){
       if(i>=n || j>= m){   // if index out of bound 
		   return;
	   }
		if(i==n-1 && j==m-1){  // if destination is reached 
			System.out.println(psf);
			return;
		}
		aMazePaths(i,j+1,n,m,psf+"h");
		aMazePaths(i+1,j,n,m,psf+"v");
		
    }
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        inputLine = br.readLine().trim().split(" ");
        int m = Integer.parseInt(inputLine[0]);
        aMazePaths(0,0,n, m, "");
  }
}