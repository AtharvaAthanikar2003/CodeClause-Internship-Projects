/*
Password Generator Using Java Language
*/

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordGenerator {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";

    public String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        String allCharacters = UPPER + LOWER + DIGITS + SPECIAL;

        SecureRandom random = new SecureRandom();
        List<Character> charList = new ArrayList<>();

        // Add at least one character from each character set
        password.append(getRandomCharacter(UPPER, random));
        password.append(getRandomCharacter(LOWER, random));
        password.append(getRandomCharacter(DIGITS, random));
        password.append(getRandomCharacter(SPECIAL, random));

        // Add remaining characters from all character sets
        for (int i = 4; i < length; i++) {
            charList.add(getRandomCharacter(allCharacters, random));
        }

        // Shuffle the characters
        Collections.shuffle(charList, random);

        // Add shuffled characters to the password
        for (Character c : charList) {
            password.append(c);
        }

        return password.toString();
    }

    private char getRandomCharacter(String characterSet, SecureRandom random) {
        int index = random.nextInt(characterSet.length());
        return characterSet.charAt(index);
    }

    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        int passwordLength = 16; // Change the length as needed
        String password = passwordGenerator.generatePassword(passwordLength);
        System.out.println("Generated Password: " + password);
    }
}
