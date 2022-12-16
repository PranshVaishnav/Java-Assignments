public class Question9 {
    public static void main(String[] args) {
        int arr[]={2, 3, 4, 5, 2};
        //Print all the leaders of the array
        //Leaders are elements with the greatest value among their right side elements.
        
        int maxi=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
           if(maxi<=arr[i])
           {
            System.out.println(arr[i]);
            maxi=arr[i];
           }
        }
    }
}
