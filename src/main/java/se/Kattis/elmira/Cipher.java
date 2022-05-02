package se.Kattis.elmira;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] table = new char[5][5];
        while(scanner.hasNextLine()) {
            int lines = scanner.nextInt();
        }
    }

    /**
     * Convert key word and messages to upper case
     * @param text word to convert to upper case
     */
    public void convertToUpperCase(String text) {
        text.toUpperCase();
    }

    /**
     * Convert letter 'J' in the message to 'I'
     * @param text message to be conversted
     * @return converted message
     */
    public String replaceJWithI(String text) {
        String newText = "";
        for (int i = 0; i < newText.length(); i++) {
            if (text.charAt(i) == 'J') {
                newText += 'I';
            } else {
                newText += text.charAt(i);
            }
        }
        return newText;
    }

    /**
     * Replace letter 'X' if both letter are the same
     * Add 'X' at the end if letter is left without a partner
     * @param text message to be converted
     * @return converted message
     */
    public String replaceDuplicateWithX(String text) {
        for(int i = 0; i < text.length(); i +=2) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                text = text.substring(0, i + 1) + 'X' + text.substring((i + 1));
            }
        }
        if (text.length() % 2 == 1) {
            text += 'X';
        }
        return text;
    }

    /**
     * Remove subsequent occurrences of the same letter in the key
     * @param key key word
     * @return key word without duplicate letters
     */
    public String removeDuplicates(String key) {
        // Use LinkedHashSet to keep the order
        HashSet<Character> cleanKey = new LinkedHashSet<>();
        char[] keyCahracters = key.toCharArray();
        String keyWithoutDuplicates = "";
        for (char keyChar : keyCahracters) {
            cleanKey.add(keyChar);
        }
        Iterator<Character> iterator = cleanKey.iterator();
        while (iterator.hasNext()) {
            keyWithoutDuplicates += iterator.next();
        }
        return keyWithoutDuplicates;
    }

    /**
     * Break the message into digraphs
     * @param message message to break into digraphs
     * @return array of digraphs
     */
    public String[] messageToDigraph(String message) {
        String[] digraphs = new String[message.length()/2];
        for (int i = 0, count = 0; i < message.length()/2; i++) {
            digraphs[i] = message.substring(count, count += 2);
        }
        return digraphs;
    }
}
