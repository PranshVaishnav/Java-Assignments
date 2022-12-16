import java.util.Scanner;

public class Assignment_1_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=sc.nextInt();
        int j=sc.nextInt();
       
        for(int x=i;x<=j;x++ )
        {
            System.out.print(s.charAt(x));
        }
        
    }
}
