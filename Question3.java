import java.util.HashMap;

public class NumberSpelling {
  private static final HashMap<Integer, String> singleDigits = new HashMap<>();
  private static final HashMap<Integer, String> tens = new HashMap<>();

  static {
    singleDigits.put(0, "zero");
    singleDigits.put(1, "one");
    singleDigits.put(2, "two");
    singleDigits.put(3, "three");
    singleDigits.put(4, "four");
    singleDigits.put(5, "five");
    singleDigits.put(6, "six");
    singleDigits.put(7, "seven");
    singleDigits.put(8, "eight");
    singleDigits.put(9, "nine");

    tens.put(10, "ten");
    tens.put(11, "eleven");
    tens.put(12, "twelve");
    tens.put(13, "thirteen");
    tens.put(14, "fourteen");
    tens.put(15, "fifteen");
    tens.put(16, "sixteen");
    tens.put(17, "seventeen");
    tens.put(18, "eighteen");
    tens.put(19, "nineteen");
    tens.put(20, "twenty");
    tens.put(30, "thirty");
    tens.put(40, "forty");
    tens.put(50, "fifty");
    tens.put(60, "sixty");
    tens.put(70, "seventy");
    tens.put(80, "eighty");
    tens.put(90, "ninety");
  }

  public static String spellNumber(int num) {
    if (num < 10) {
      return singleDigits.get(num);
    } else if (num < 100) {
      if (tens.containsKey(num)) {
        return tens.get(num);
      } else {
        int tensDigit = num / 10 * 10;
        int onesDigit = num % 10;
        return tens.get(tensDigit) + "-" + singleDigits.get(onesDigit);
      }
    } else if (num < 1000) {
      int hundredsDigit = num / 100;
      int tensAndOnes = num % 100;
      String tensAndOnesStr = spellNumber(tensAndOnes);
      return singleDigits.get(hundredsDigit) + " hundred " + tensAndOnesStr;
    } else if (num < 10000) {
      int thousandsDigit = num / 1000;
      int hundreds = num % 1000;
      String hundredsStr = spellNumber(hundreds);
      return singleDigits.get(thousandsDigit) + " thousand " + hundredsStr;
    } else {
      return "";
    }
  }
}
