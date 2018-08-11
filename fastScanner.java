import java.util.*;
import java.io.*;

class fastScanner {

	//fastscanner class
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

	}

	//driver function
	public static void main(String args[]) {
		FastScanner in = new FastScanner(System.in);
		int a,b;
		a=in.nextInt();
		b=in.nextInt();
		//print sum of a and b
		System.out.println(a+b);
	}
}
