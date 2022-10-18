import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> res = new ArrayList<>();
        for (int i = 0;i<n;i++) {
            int rating = scanner.nextInt();
            if (rating<=1399) {
                res.add("Division 4");
            } else if(rating>=1400 && rating<=1599) {
                res.add("Division 3");
            } else if(rating>=1600 && rating<=1899) {
                res.add("Division 2");
            } else {
                res.add("Division 1");
            }
        }

        for (String s : res) {
            System.out.println(s);
        }
    }
}
