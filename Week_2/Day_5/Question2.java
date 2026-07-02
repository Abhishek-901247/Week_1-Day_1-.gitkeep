  class Solution {
    public int compress(char[] chars) {
        int write = 0; // Position to write compressed characters
        int read = 0;  // Position to read characters

        while (read < chars.length) {
            char current = chars[read];
            int count = 0;

            // Count consecutive occurrences
            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = current;

            // Write the count if greater than 1
            if (count > 1) {
                String num = Integer.toString(count);
                for (char c : num.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
