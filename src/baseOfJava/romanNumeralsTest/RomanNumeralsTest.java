package baseOfJava.romanNumeralsTest;

public class RomanNumeralsTest {
    public static String solution(int n) {
        StringBuilder builder = new StringBuilder();
        String[][] romanNumerals = {
                {"M", "1000"},
                {"CM", "900"},
                {"D", "500"},
                {"CD", "400"},
                {"C", "100"},
                {"XC", "90"},
                {"L", "50"},
                {"XL", "40"},
                {"X", "10"},
                {"IX", "9"},
                {"V", "5"},
                {"IV", "4"},
                {"I", "1"} 
        };
        for (String[] pair : romanNumerals) {
            String symbol = pair[0];
            int value = Integer.parseInt(pair[1]);

            while (n >= value) {
                builder.append(symbol);
                n -= value;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(RomanNumeralsTest.solution(1032));
    }
}
