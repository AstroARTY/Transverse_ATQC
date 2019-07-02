package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */

public class RegExp {

  /**
   * Get IP address from text.
   * @param text text to parse
   * @return String with IP address
   */
  public static String getIpAddress(String text) {
    String ipPattern = "((([1-2]?[0-9]?[0-9])\\.){3}([1-2]?[0-9]?[0-9]))";
    Pattern pattern = Pattern.compile(ipPattern);
    Matcher matcher = pattern.matcher(text);
    if (matcher.find()) {
      return matcher.group();
    } else {
      return "";
    }
  }
}