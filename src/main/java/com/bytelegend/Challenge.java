package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("A is valid hex character: " + isValidHexCharacter('A'));
        System.out.println("0 is valid hex character: " + isValidHexCharacter('0'));
        System.out.println("G is valid hex character: " + isValidHexCharacter('G'));
    }

    /**
     * A valid character is: character 0-9 and character A/a/B/b/C/c/D/d/E/e/F/f (case-insensitive).
     *
     * <p>If the given character is a valid hex character, return `true`, otherwise return `false`.
     */
    public static boolean isValidHexCharacter(char ch) {
        if (ch == 'A' || ch == 'a') return true;
        if (ch == 'B' || ch == 'b') return true;
        if (ch == 'C' || ch == 'c') return true;
        if (ch == 'D' || ch == 'd') return true;
        if (ch == 'E' || ch == 'e') return true;
        if (ch == 'F' || ch == 'f') return true;
        if (ch >= '0' && ch <= '9') return true;
        return false;
    }
}
