public class Question5 {
 public static void main(String[] args) {

    int arr[]={2, 5, 3, 5, 4, 4, 2, 3 };
    int a=3;
    int b=2;
    int INT_MIN=Integer.MIN_VALUE;
    int prev=INT_MIN;
    int x=-1;
    int mini=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        if((arr[i]==a || arr[i]==b) && arr[i]!=x)
        {
            x=arr[i];
            
            if(prev!=INT_MIN)
            {
                mini=Integer.min(mini, Math.abs(prev-i));
            }
            prev=i;
        }
        else if((arr[i]==a || arr[i]==b) && arr[i]==x)
        {
            prev=i;
        }

    }
    System.out.println(mini);
 }   
}
