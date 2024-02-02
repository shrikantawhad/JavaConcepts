public class Test {
    public static void main(String[] args) {
        int arr[] = {6, 2, 9, 4, 1, 7, 5};
        int size = arr.length;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }


                System.out.println("max :" + max + "Min : " + min);


    }
}
