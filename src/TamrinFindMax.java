import java.util.Scanner;
import java.lang.String;

public class TamrinFindMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the length of your array");
        int size;
        if (s.hasNextInt()) {
            size = s.nextInt();
            if (size > 0) {//size validation
                System.out.println("enter your numbers");
                int[] arr = new int[size];
                for (int i = 0; i < size; i++) {
                    if (s.hasNextInt()) { //array validation
                        arr[i] = s.nextInt();
                    } else {
                        System.out.println("input is not valid"); //array validation
                        break;
                    }
                }
                int max = recursiveMax(arr, size);
                System.out.println("Max element is:\n" + max);
            } else {
                System.out.println("only positive num is valid");
            }//size validation

        } else {
            System.out.println("only number is valid");//size validation
        }
    }

    public static int recursiveMax(int[] arr, int length) {
        if (length == 1)
            return arr[0];
        return max(recursiveMax(arr, length - 1), arr[length - 1]);
    }

    public static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
}

