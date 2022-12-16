public class Question3 {
    public static void main(String[] args) {
        
        int arr[]={1,5,7,8,4,2,6,3};
    //Find smallest and largest
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            largest=Integer.max(largest,arr[i]);
            smallest=Integer.min(smallest,arr[i]);
        }
        System.out.println("Smallest Element is: "+smallest);
        System.out.println("Largest Element is: "+largest);
    }
}
