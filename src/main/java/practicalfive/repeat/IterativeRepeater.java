package practicalfive.repeat;

/**
 * A class that iteratively constructs a string of a repeated character.
 *
 * @author Gregory M. Kapfhammer
 */

public class IterativeRepeater extends Repeater {

  /** Set the name of the IterativeRepeater. */
  public IterativeRepeater() {
    name = "IterativeRepeater";
  }

  /** Use repeated concatenation to compose a String with "repeats" copies of a
   *  specified "character". */
  public String repeat(char character, int repeats) {
    String answer = "";
    for (int j = 0; j < repeats; j++) {
      answer += character;
    }
    return answer;
  }

}
