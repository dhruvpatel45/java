import java.util.Scanner;

public class febona {
    public static int febo(int num,int f,int s){
        int temp=0;
        if(s>=num){
            return 0;
        }
        else{
            temp=f+s;
            System.out.println(temp);
            f=s;
            s=temp;
            return febo(num,f,s);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        int f=0,s=1;
        System.out.println(f);
        System.out.println(s);
        febo(num,f,s);
        //System.out.println(ans);
        sc.close();
    }
}
