package practicalfive.repeat;

/**
 * A class that constructs a string of a repeated character with appends.
 *
 * @author Gregory M. Kapfhammer
 */

public class AppendRepeater extends Repeater {

  /** Set the name of the AppendRepeater. */
  public AppendRepeater() {
    name = "AppendRepeater";
  }

  /** Use repeated concatenation to compose a String with "repeats" copies of a
   *  specified "character". */
  public String repeat(char character, int repeats) {
    java.lang.StringBuilder stringBuilder = new StringBuilder();
    for (int j = 0; j < repeats; j++) {
      stringBuilder.append(character);
    }
    return stringBuilder.toString();
  }

}
