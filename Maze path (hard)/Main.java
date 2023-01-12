import java.io.*;
import java.util.*;
// this is recurssion on the way up as we are printing while going up
public class Main {
	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
		if(sr ==dr && sc == dc){  // if destination reached print path and return
			System.out.println(psf);
			return;
		}
		// if(sr>dc || sc>dr){
		// 	return;
		// }
		// due to this for loops we are not getting the negative value and due to that no need to take care if we go out of matrix or not 

		// horizontal calls
		for(int jumps=1;jumps<=dc-sc;jumps++){    
			printMazePaths(sr,sc+jumps,dr,dc,psf+"h"+jumps);
		}

		//vertical calls 
		for(int jumps =1;jumps<=dr-sr;jumps++){
			printMazePaths(sr+jumps,sc,dr,dc,psf+"v"+jumps);
		}

		//diagonal calls 
		for(int jumps =1;jumps<=(Math.min(dc-sc,dr-sr));jumps++){
			printMazePaths(sr+jumps,sc+jumps,dr,dc,psf+"d"+jumps);
		}
		
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}