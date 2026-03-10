  import java.util.HashMap;

/**
 * OOPSBannerAppUC8 - Map Collection Implementation
 *
 * <p>This class demonstrates the use of a HashMap to store ASCII art patterns
 * for characters and display them as a banner message.</p>
 *
 * @author Developer
 * @version 8.0
 */
public class OOPSBannerAppUC8 {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     *
     * @return a HashMap where keys are characters and values are String arrays
     *         representing ASCII art lines for each character
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for 'O'
        charMap.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        // Pattern for 'P'
        charMap.put('P', new String[]{
            "***** ",
            "*    *",
            "***** ",
            "*     ",
            "*     "
        });

        // Pattern for 'S'
        charMap.put('S', new String[]{
            " *****",
            "*     ",
            " *****",
            "     *",
            " *****"
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     *
     * @param message the String message to display as a banner
     * @param charMap a HashMap containing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Getting pattern height. Assuming all patterns have the same height
        int patternHeight = charMap.get(message.charAt(0)).length;

        // Loop through each line of the pattern height
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder bannerLine = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                bannerLine.append(pattern[line]).append("  "); // spacing between letters
            }
            System.out.println(bannerLine.toString());
        }
    }

    /**
     * Main entry point of the application.
     */
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}
