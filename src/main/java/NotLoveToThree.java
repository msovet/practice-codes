import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotLoveToThree {
    static List<Integer> elements = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        for (int i = 0;i < n;i++) {
            int iter = scan.nextInt();
            arr[i] = iter;
        }

        for (int i : arr) {
            System.out.println(getElementByIndex(i-1));
        }
    }

    static int getElementByIndex(int i) {
        createArray();
        return elements.get(i);
    }

    static List<Integer> createArray() {
        for (int i = 1;i<=1666;i++) {
            String last = String.valueOf(i);
            if (i%3 != 0) {
                if (!last.substring(last.length()-1).equals("3"))
                    elements.add(i);
            }
        }
        return elements;
    }
}
