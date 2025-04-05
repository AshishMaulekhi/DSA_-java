package src.Linkedlist;

import java.util.*;

class LeetCode93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, s, 0, "", 0);
        return result;
    }

    private void backtrack(List<String> result, String s, int index, String current, int count) {
        if (count > 4) return;
        if (count == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1));
            return;
        }
        for (int i = 1; i < 4; i++) {
            if (index + i > s.length()) break;
            String part = s.substring(index, index + i);
            if ((part.startsWith("0") && part.length() > 1) || (i == 3 && Integer.parseInt(part) >= 256)) continue;
            backtrack(result, s, index + i, current + part + ".", count + 1);
        }
    }

    public static void main(String[] args) {
        LeetCode93 obj = new LeetCode93();
        List<String> result = obj.restoreIpAddresses("25525511135");
        for (String ip : result) {
            System.out.println(ip);
        }
    }
}
