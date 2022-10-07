class ReverseArray {
  public static void main(String args[]){
    int size = 5;
    int arr[] = {1,2,3,4,5};
    reverse(size-1, arr);
  }

  public static void reverse(int index, int[] arr){
    if(index == -1) return;
    System.out.println(arr[index]);
    reverse(index-1, arr);
  }
}
