import java.util.*;
public class primeNumber{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>=2){
            System.out.println("Not prime");
        }
        else{
            System.out.println("prime");
        }
        sc.close();
    }
}