import java.util.Arrays;

public class LongestStringCommon {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String strs[]){
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        while (i<first.length() && i<last.length()) {
            if(first.charAt(i)==last.charAt(i)){
                i++;
            } else {
                break;
            }
        }
        return i ==0?"":first.substring(0, i);
    }
}
