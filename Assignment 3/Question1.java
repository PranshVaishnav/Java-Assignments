public class Question1 {
    public static void main(String[] args) {

        int arr[] = { 0, 0, 1, 1, 0, 1, 0, 0, 1, 1 };
        // Sort an array of 0s and 1s

        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            while (arr[i] != 1) {
                i++;
            }
            while (arr[j] != 0) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
          
    }
}