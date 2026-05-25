
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.romanToInt("LVIII");
        System.out.println(result);
    }

    public int romanToInt(String s) {
        Map<Character, Integer> dir = new HashMap<>();
        dir.put('I', 1);
        dir.put('V', 5);
        dir.put('X', 10);
        dir.put('L', 50);
        dir.put('C', 100);
        dir.put('D', 500);
        dir.put('M', 1000);

        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'V' && i !=0 && s.charAt(i - 1) == 'I' || s.charAt(i) == 'X' && i != 0 && s.charAt(i - 1) == 'I' || s
                    .charAt(i) == 'L' && i != 0 && s.charAt(i - 1) == 'X' || s.charAt(i) == 'C' && i != 0 && s.charAt(i - 1) == 'X' || s
                            .charAt(i) == 'D' && i != 0 && s.charAt(i - 1) == 'C'
                    || s.charAt(i) == 'M' && i != 0 && s.charAt(i - 1) == 'C') {
                result += (dir.get(s.charAt(i)) - dir.get(s.charAt(i - 1)));
                i--;
            }else{
                result += dir.get(s.charAt(i));
            }
        }
        return result;
    }
}
