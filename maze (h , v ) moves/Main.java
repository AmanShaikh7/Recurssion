import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

			if(sr==dr && sc==dc){
				ArrayList<String> ba = new ArrayList<String>();
				ba.add("");
				return ba;
			}
		if(sr>dr || sc > dc){
			ArrayList<String> ba = new ArrayList<String>();		
				return ba;
			}

			ArrayList<String> ans = new ArrayList<String>();
		
		//hpaths
			ArrayList<String> hpaths = getMazePaths(sr,sc+1,dr,dc);	
		for(int i=0;i<hpaths.size();i++){
			String toadd =hpaths.get(i);
			String res = "h"+toadd;
			ans.add(res);
		}

		//now find vertical paths
		ArrayList<String> vpaths = getMazePaths(sr+1,sc,dr,dc);
		for(int i=0;i<vpaths.size();i++){
			String got = vpaths.get(i);
			String result = "v"+got;
			ans.add(result);
		}
		return ans ;
	
    }
}


                        
                        
                        
                        
                        
                                

                        
                                