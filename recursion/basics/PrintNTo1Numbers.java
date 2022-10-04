/*
    i/p: n=5;
    o/p: 5 4 3 2 1  
 */

class PrintNTo1Numbers {
  public static void main(String args[]){
    int n=5;
    printNto1(n);
  }

  public static void printNto1(int n) {
    // base condition
     if(n==0){
        return;
    }
    // recursive condition
    System.out.println(n);
    printNto1(n-1);
  }
}
