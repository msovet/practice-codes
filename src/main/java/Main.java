import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("111", "One");

        System.out.println(map.get("222"));
//        Scanner scan = new Scanner(System.in);
//        int n = Integer.parseInt(scan.nextLine());
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scan.nextLine();
//        }
//        List<String> res = new ArrayList<>();
//        for (String str : arr) {
//            String firstHalf = str.substring(0, 3);
//            String secondHalf = str.substring(3, 6);
//
//            int sum1 = 0;
//            for (int i = 0;i<firstHalf.length();i++) {
//                sum1  += Character.getNumericValue(firstHalf.charAt(i));
//            }
//
//            int sum2 = 0;
//            for (int i = 0;i<secondHalf.length();i++) {
//                sum2  += Character.getNumericValue(secondHalf.charAt(i));
//            }
//
//            if (sum1==sum2) {
//                res.add("YES");
//            } else res.add("NO");
//        }
//
//        for (String s:res) {
//            System.out.println(s);
//        }
    }
}
