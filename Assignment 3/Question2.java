
public class Question2 {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        else
            return gcd(b, a % b);
    }

    public static void leftRotate(int arr[], int k) {

        //Left Rotate
        int n=arr.length;
        k=k%n;
        int _gcd=gcd(k,n);
        int z=_gcd;
        z--;
        for(int i=0;i<_gcd;i++)
        {

            int temp=arr[i];
            int j=i;
            while(true)
            {
                int d=j+k;
                if(d>=n)
                d=d%n;

                if(d==i)
                break;

                arr[j]=arr[d];
                j=d;
            }
            arr[j]=temp;
           
        }
        return;
    }

    public static void main(String[] args) {
     

        //Rotate an array by k units
        // if k==0 no rotation 
        // if k<0 rotate to left 
        // if k>0 rotate to right
 
        int arr[]={1,2,3,4,5,6,7};
        int k=2;
        if(k==0)
        {
            for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

            return ;
        }
        int n=arr.length;

        if(k<0)
        {
            leftRotate(arr, k*-1);
        }
        if(k>0)
        {
            k=k%n;
            k=n-k;
            leftRotate(arr, k);

        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");

    }
}
