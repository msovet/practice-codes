public class BadVersion {
    public static void main(String[] args) {
        int n = 5;

        int low = 1;
        int high = n;
        while(low < high) {
            int mid = (low+high) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }
        System.out.println(low);
    }

    static boolean isBadVersion(int n) {
        if (n>=2) {
            return true;
        }
        return false;
    }
}
