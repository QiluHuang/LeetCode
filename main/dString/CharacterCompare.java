package dString;

public class CharacterCompare {
    public static int compareWord(String str, String guess) {
        int count = 0;
        int[] table = new int[256];

        for (int i = 0; i < str.length(); i++) {
            int c = str.toLowerCase().charAt(i) - 'a';
            table[c] += 1;
        }

        for (int i = 0; i < guess.length(); i++) {
            int c = guess.toLowerCase().charAt(i) - 'a';
            if (table[c] > 0) {
                table[c] -= 1;
                count++;
            }
        }

        return count;
    }
}
