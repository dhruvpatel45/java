import java.util.*;

public class studentinfo{
    public int endroll;
    public String Name;
    public int age;
    public String address;
    public studentinfo(int endroll, String Name, int age, String address){
        this.endroll=endroll;
        this.Name=Name;
        this.age=age;
        this.address=address;
    }
    public void details(){
        System.out.println("Student endrollnment number "+endroll);
        System.out.println("Student name "+Name);
        System.out.println("Student age "+age);
        System.out.println("Student address "+address);

    }
}
public class studentDetails{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter endrollnment number: ");
        int endroll=sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        System.out.print("Enter Name: ");
        String name=sc.nextLine();
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        System.out.print("Enter Address: ");
        String address=sc.nextLine();
        studentinfo stu=new studentinfo(endroll,name,age,address);
        stu.details();
        sc.close();
    }
}

