import java.util.Arrays;

public class ShuffleString {
    public static void main(String args[]) {
        String s1 = "123";
        String s2 = "pqr";
        String res = "p1q2r3";
        
        if (isShuffled(s1, s2, res)) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }

    static Boolean isShuffled(String s1, String s2, String res) {
        int n = s1.length();
        int m = s2.length();
    
        if (n + m != res.length()) {
            return false;
        }
        
        s1 = sort(s1);
        s2 = sort(s2);
        res = sort(res);
        
        int i = 0, j = 0, k = 0;
        while (k < res.length()) {
            if (i < n && s1.charAt(i) == res.charAt(k)) {
                i++;
            } else if (j < m && s2.charAt(j) == res.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        
        return i >= n && j >= m;
    }

    static String sort(String ss) {
        char[] ca = ss.toCharArray(); // String to array
        Arrays.sort(ca);              // Sort the array
        return String.valueOf(ca);    // Array back to string
    }
}
