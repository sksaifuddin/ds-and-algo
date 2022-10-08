class SumOfDigits {
  public static void main(String args[]) {
    int result = sumOfDigit(123);
    System.out.println(result); 
  }

  public static int sumOfDigit(int n) {
    if(n==0){
      return 0;
    };

    return n%10 + sumOfDigit(n/10);
  }
}
