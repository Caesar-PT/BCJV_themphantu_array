import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7, 0, 0, 0, 0, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chèn");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = scanner.nextInt();

        if (index <= 1 | index >= arr.length - 1)
            System.out.println("Không chèn được phần tử vảo mảng");


        for (int i = arr.length - 1; i > index; i--){
            arr[i] = arr[i-1];

        }

        arr[index] = number;
        System.out.println(Arrays.toString(arr));
    }
}
