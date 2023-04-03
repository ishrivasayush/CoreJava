import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //1D Array
        int arr[]=new int[5];
        int[] arr1={100,200,300,400};
        int []arr3=new int[5];
        arr3[0]=100;
        arr3[1]=200;
        arr3[2]=300;
        arr3[3]=400;
        arr3[4]=500;

        //2D Array
        int arr4[][]=new int[5][];
        int arr5[][]=new int[3][3];
        int arr6[][]={
                {100,200,300},
                {400,500,600},
                {700,800,900}
        };
//        print2(arr6);


        //Zagged Array
        int arrk[][]=new int[5][];
        int arrw[][]={
                {1000,2000,300,4000},
                {1000,200},
                {4000,500,6000}
        };

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= scanner.nextInt();
        }
















print7(arrw);





    }
    static void print(int arr[])
    {
        for (int x:arr) {
            System.out.println(x);
        }
    }
    static void print2(int arr[][])
    {
        for(int x[]:arr)
        {
            for (int y:x)
            {
                System.out.print(y+" ");
            }
        }
    }
    static void print7(int arr[][])
    {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length  ; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
