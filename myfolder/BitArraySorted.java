class BitArraySorted {
 public static void main(String[] args) {
   System.out.println("Hello world!");
   int[] a = new int[]{};
   int s = 0;
   int e = a.length - 1;
   int m = 0;
   while(s<=e) {
     //int i = 0;
     m = (s+e)/2;
     System.out.println("mid: " + m);
     if(a[m] == 0) {
       s = m + 1;
       System.out.println("start: " + s);
     } else {
       e = m - 1;
       System.out.println("end: " + e);
     }
   }
   System.out.println("# of 0's: " + (e + 1));
   System.out.println("# of 1's: " + (a.length - e - 1));
 }
}
