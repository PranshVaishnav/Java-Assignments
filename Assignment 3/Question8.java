public class Question8 {
    public static void main(String[] args) {
        int arr[]={1,4,2,6,5,8,7};
        int n=8;
    //find the missing values from 1 to N.
       
    int sum=(n*(n+1))/2;
    int got_sum=0;
    for(int i:arr)
    got_sum+=i;

    System.out.println(sum-got_sum);
        
    }
}
