import java.util.Scanner;

public class floidtri {
public static void Floidtri(int n) {
    int count=1;
for (int i=1;i<=n;i++){
    for ( int j=1;j<=i;j++)
    {
    System.out.print(count+" ");
    count++;   
}
System.out.println();} 
}
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. : ");
        int a=sc.nextInt();
        Floidtri(a);
     }
}

