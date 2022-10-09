class PowerOfNumber { 
  public static void main(String args[]) {
    int res = power(2,2);
    System.out.println(res);
  }

  public static int power(int base, int exp){
    if(exp == 0){
      return 1;
    }
    return base * power(base, exp-1);
  }
}
