import java.util.*;   

public class YeshBanner {

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Store patterns
        List<CharacterPatternMap> patternList = new ArrayList<>();

        patternList.add(new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternList.add(new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patternList.add(new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        String input = "OOPS";

        StringBuilder[] output = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            output[i] = new StringBuilder();
        }

        for (char ch : input.toCharArray()) {
            for (CharacterPatternMap cp : patternList) {
                if (cp.getCharacter() == ch) {
                    String[] pat = cp.getPattern();
                    for (int i = 0; i < pat.length; i++) {
                        output[i].append(pat[i]).append("  ");
                    }
                }
            }
        }

        for (StringBuilder line : output) {
            System.out.println(line);
        }
    }
}