import java.util.Scanner;

public class facto {
    public static int fact(int num){
        if(num==1){
            return num;
        }
        else{
            return num*fact(num-1);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        int ans=fact(num);
        System.out.println(ans);
        sc.close();
    }
}
