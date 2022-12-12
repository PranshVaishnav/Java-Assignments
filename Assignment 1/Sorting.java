import java.util.Scanner;

public class Sorting {
       public static void main(String args[])
       {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
       
        
        int arr[]=new int[26];

        for(int i=0;i<str.length();i++)
        {
              arr[((int)str.charAt(i))-97]+=1;
        }
   
        String sorted_ans="";
        for(int i=0;i<26;i++)
        {
                  while(arr[i]>0)
                  {
                     String p=Character.toString((char)i+97);
                     sorted_ans=sorted_ans.concat(p);
                     arr[i]-=1;
                  }
        }
        System.out.println(sorted_ans);
       }
}
