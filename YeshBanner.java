import java.util.*;

public class YeshBanner {

    // Map to store character patterns
    private static Map<Character, String[]> patternMap = new HashMap<>();

    // Function to initialize patterns
    public static void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Function to render banner
    public static void printBanner(String input) {

        StringBuilder[] output = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            output[i] = new StringBuilder();
        }

        for (char ch : input.toCharArray()) {

            String[] pattern = patternMap.get(ch); // ✅ direct lookup

            if (pattern != null) {
                for (int i = 0; i < pattern.length; i++) {
                    output[i].append(pattern[i]).append("  ");
                }
            }
        }

        for (StringBuilder line : output) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();   // load map
        printBanner("OOPS");    // print banner
    }
}