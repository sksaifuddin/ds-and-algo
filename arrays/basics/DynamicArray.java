public class DynamicArray {
   int data[] = null;
   public DynamicArray(int size) {
        data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.MIN_VALUE;
        }
    }

    public int get(int index) {
        return data[index];
    }

    public void insert(int index, int value) {
        if(data[index] == Integer.MIN_VALUE) {
            data[index] = value;
        }

        // code for inserting between arrays
        
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}

class DynamicArrayMain {
    public static void main(String args[]) {
        DynamicArray arr = new DynamicArray(3);
        arr.insert(0, 1);
        arr.insert(1, 2);
        arr.insert(2, 3);
        arr.print();
    }
}
