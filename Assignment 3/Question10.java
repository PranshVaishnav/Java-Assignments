import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
         
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }

        for(int i:arr)
        System.out.print(i+" ");

        System.out.println();
        System.out.println("Enter the element to search: ");
        int s=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(arr[i]==s)
            {
                System.out.println("Element is found at index: "+i);
                break;
            }
        }
    }
}
