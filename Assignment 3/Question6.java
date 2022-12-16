public class Question6 {

public static int [] insert(int arr[],int x)
{
  int n=arr.length;
  int new_arr[]=new int[n+1];
  for(int i=0;i<n;i++)
  {
    new_arr[i]=arr[i];
  }
  new_arr[n]=x;
  return new_arr;
}

public static int[] delete(int arr[],int index)
{
    int n=arr.length;
    int new_arr[]=new int[n-1];
    int flag=0;
    for(int i=0;i<n-1;i++)
    {
        if(i!=index && flag==0)
         new_arr[i]=arr[i];
         else if(i!=index && flag==1)
         new_arr[i]=arr[i+1];
         else{
            new_arr[i]=arr[i+1];
            flag=1;
         }
    }
    return new_arr;
}
  public static void main(String[] args) {
    //Java Program to delete and insert element in the array
     int arr[]=new int[]{1,2,3,4,5};

     arr=insert(arr,10);
     for (int i : arr) {
        System.out.print(i+" ");
     }
     System.out.println();
     
     arr=delete(arr,0);

     for (int i : arr) {
        System.out.print(i+" ");
     }
    
  }   
}
