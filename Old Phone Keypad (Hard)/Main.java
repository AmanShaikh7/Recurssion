import java.util.*;
// expectaions : give all the possbile combinations of keys 
//faith : for n-1 array its gives me correct ans || so now just add the chars of 1 first digit to faith and thats it!!!
class Main {
	static String sArr [] = {"","ABC","DEF","GHI","JKL","MNO","PQRS","TU","VWX","YZ"};
    static ArrayList <String> OldPhone(int n, int[] keys){

		if(n==0){
			ArrayList<String> ba = new ArrayList<String>();
			ba.add("");
			return ba;
		}

		// taking elements of keys from 2nd element to temp array
		
		int temp [] = new int [n-1];
			int k =0;
		for(int i=1;i<keys.length;i++){
			
			temp[k]=keys[i];
			k++;
		}
		ArrayList<String> ans = new ArrayList<>();
		ArrayList<String> sans=OldPhone(n-1,temp);
		int outerNo = keys[0];
		String outer = sArr[outerNo];   // string of 7 initially  ==> T,U
		for(int s=0;s<outer.length();s++){
			char toAdd = outer.charAt(s);
			for(int b=0;b<sans.size();b++){
				String ssan = sans.get(b);
				String res = toAdd+ssan;
				ans.add(res);
			}
		}
		return ans;
		
    }
	
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        for(int i=0;i<n;++i){
            keys[i] = sc.nextInt();
        }
        ArrayList <String> ans=OldPhone(n,keys);
        for(String i:ans) System.out.print(i+" ");
    }
}