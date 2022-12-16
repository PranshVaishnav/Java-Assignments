public class Question7 {

    public static void cyclicPermute(int arr[]) {

        //Left Rotate
        int k=1;
        int n=arr.length;
        k=k%n;
       

            int temp=arr[0];
            int j=0;
            while(true)
            {
                int d=j+k;
                if(d>=n)
                d=d%n;

                if(d==0)
                break;

                arr[j]=arr[d];
                j=d;
            }
            arr[j]=temp;
        return;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};
        cyclicPermute(arr);
        for (int i : arr) {
          System.out.print(i+" ");  
        }
    }
}
