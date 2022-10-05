class SumOfNNatualNumbers {
    public static void main(String args[]){
    int n=5;
    int res = sumOfNaturalNum(n); 
    System.out.println(res);
  }

  public static int sumOfNaturalNum(int n){
    if(n == 1) return 1;
    return n +  sumOfNaturalNum(n-1);  
  }
} 
    
