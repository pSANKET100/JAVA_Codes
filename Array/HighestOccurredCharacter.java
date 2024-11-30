public class HighestOccurredCharacter {

    public static char highestOccurredChar(String input) {
        int[] charCount = new int[256]; 
        int maxCount = 0;
        char highestChar = '\0';

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount[c]++;
            if (charCount[c] > maxCount) {
                maxCount = charCount[c];
                highestChar = c;
            }
        }

        return highestChar;
    }

    public static void main(String[] args) {
        String input = "aaaaaaaaaaaaaaaaabbbbcddddeeeeee";
        char result = highestOccurredChar(input);
        System.out.println("Highest occurred character: " + result); 
    }
}
