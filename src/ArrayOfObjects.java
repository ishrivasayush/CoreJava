import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Students students[]=new Students[2];
        /*students[0]=new Students(89,"Ayush Shrivastava",87.9f);
        students[1]=new Students(89,"Abhay Shrivastava",87.9f);
        students[2]=new Students(89,"Avedika Shrivastava",87.9f);
        students[3]=new Students(89,"Abhimanu Shrivastava",87.9f);
        students[4]=new Students(89,"Amrandra Shrivastava",87.9f);

         */
        Students.takeInput(students);
        Students.print(students);


    }
}
class Students{
    int rNo;
    String name;
    float marks;

    public Students() {

    }

    public Students(int rNo, String name, float marks) {
        this.rNo = rNo;
        this.name = name;
        this.marks = marks;
    }
    static void print(Students students1[])
    {
        for (int i = 0; i <students1.length ; i++) {
            System.out.println(students1[i].rNo+" "+students1[i].marks+" "+students1[i].name);
        }
    }

    static void takeInput(Students students1[])
    {
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <students1.length ; i++) {
            students1[i]=new Students();
            System.out.println("Enter First Name");
            students1[i].name=scanner.nextLine();
            scanner.nextLine();
            System.out.println("roll No:");
            students1[i].rNo=scanner.nextInt();
            System.out.println("marks:");
            students1[i].marks=scanner.nextFloat();
        }
    }
}