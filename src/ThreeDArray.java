public class ThreeDArray {
    public static void main(String[] args) {
        int arr[][][]=new int[3][3][3];
        for (int arr1[][]:arr) {
            for (int arr2[]:arr1)
            {
                for (int arr3:arr2)
                {
                    arr3=100;
                    System.out.println(arr3);
                }
            }
        }
    }
}
