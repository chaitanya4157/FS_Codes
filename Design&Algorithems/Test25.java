/* 
You are given a string s. Your task is to rearrange its characters in descending 
order of frequency, where frequency is the number of times a character appears
in the string.
If multiple characters have the same frequency, they can appear in any order
relative to each other.
Return the modified string.

Input Format
---------------------------------
- A string s containing characters to be rearranged.

Output Format
---------------------------------
- Return a string in which characters are arranged in descending order of their
frequencies.

Sample Testcase:1
---------------------------------
input=green
output=eerng

*/


import java.util.*;

public class Test25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(freq.keySet());

        chars.sort((a, b) -> freq.get(b) - freq.get(a));

        StringBuilder result = new StringBuilder();

        for (char ch : chars) {
            for (int i = 0; i < freq.get(ch); i++) {
                result.append(ch);
            }
        }

        System.out.println(result);
        sc.close();
    }
}

