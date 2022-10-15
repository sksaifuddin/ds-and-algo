public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int size) {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int value) {
        try {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = value;
                System.out.println("Value is successfully inserted");
            } else {
                System.out.println("Index is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }

    }

}

class SingleDimensionArrayMain{
    public static void main(String[] args) {
        SingleDimensionArray sdArr = new SingleDimensionArray(10);
        sdArr.insert(0, 1);
        sdArr.insert(1, 2);
        sdArr.insert(1, 4);
        sdArr.insert(12, 4);
    }
}