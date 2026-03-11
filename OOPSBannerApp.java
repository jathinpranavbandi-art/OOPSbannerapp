import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        });
        patternMap.put('P', new String[]{
            " ***** ",
            " * * ",
            " ***** ",
            " * ",
            " * "
        });
        patternMap.put('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        });
    }

    public static void main(String[] args) {
        String word = "OOPS";
        renderBanner(word);
    }

    public static void renderBanner(String word) {
        int height = 5;
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(Character.toUpperCase(c));
                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }
}
