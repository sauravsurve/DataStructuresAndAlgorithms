import java.util.*;
import java.io.*;

class gcdandlcm {

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

       static int gcd(int a, int b) {
              if(a==0)
                     return b;
              return gcd(b%a, a);
       }

       static int lcm(int a, int b) {
              return (a*b)/gcd(a, b);
       }

       public static void main(String args[]) {
              FastScanner in = new FastScanner(System.in);
              int a,b;
              a=in.nextInt();
              b=in.nextInt();
              //print gcd
              System.out.println("gcd of "+a+" and "+b+" is "+gcd(a, b));
              //print lcm
              System.out.println("lcm of "+a+" and "+b+" is "+lcm(a, b));
       }
}
