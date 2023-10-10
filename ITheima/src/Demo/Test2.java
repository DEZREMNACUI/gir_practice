package Demo;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print (arr[i1] + " ");
        }
    }
}
