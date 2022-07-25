import java.util.*;

public class Main {
    public static void main(String args[]) {
        //initial array
        int[] arr = {1, 2, 3, 4, 5};
        //calling methods (delete value)
        System.out.println(Arrays.toString(arr));
        arr = deleteValue(arr, 4);
        System.out.println("deleteValue pos: 4 " + Arrays.toString(arr));
        arr = insertValue(arr, 4, 3);
        //calling inserting adding value to array
        System.out.println("addValue value: 4 " + Arrays.toString(arr));
        arr = insertValue(arr, 4, 1);
        //calling inserting value
        System.out.println("insertValue value: 4 pos: 1 " + Arrays.toString(arr)); }

    public static int[] addValue(int[] arr, int value) {
        //add value to the end of an array - making new array
        int[] newarr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
        {
            newarr[i] = arr[i];
        }
        newarr[arr.length] = value;
        return newarr;
    }

    public static int[] deleteValue(int[] arr, int pos) {
        //new array to delete value  - take away length
        int[] newarr = new int[arr.length - 1];
        for (int i = 0; i < pos; i++) {
            newarr[i] = arr[i];
        }
        for (int i = pos + 1; i < arr.length; i++) {
            newarr[i - 1] = arr[i];
        }
        return newarr;
    }

    public static int[] insertValue(int[] arr, int value, int pos) {
        //inserting value at array value
        int[] newarr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newarr[i] = arr[i];
        }
        newarr[pos] = value;
        for (int i = pos; i < arr.length; i++) {
            newarr[i + 1] = arr[i];
        }
        return newarr;
    }
}
