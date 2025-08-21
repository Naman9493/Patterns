import java.util.Scanner;

public class triangle {
    
    public static void Tri(int n) {
    for (int i=1;i<=n;i++){
        for ( int j=1;j<=i;j++)
        {
        System.out.print("*");   
    }
    System.out.println();}  
}
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. : ");
        int a=sc.nextInt();
        Tri(a);
     }

}
