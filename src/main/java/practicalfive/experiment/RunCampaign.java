package practicalfive.experiment;

import practicalfive.data.ResultsTable;
import practicalfive.repeat.Repeater;

/**
 * A RunCampaign class that can run an experiment with a Repeater.
 *
 * @author Gregory M. Kapfhammer
 */

public class RunCampaign implements Campaign {

  /** The starting size for running an experiment campaign. */
  private static final int INPUT_SIZE_START = 250;

  /** The growth factor for input when running an experiment campaign. */
  private static final int INPUT_GROWTH_FACTOR = 2;

  /** The total number of input size doubles to perform for an experiment campaign. */
  private static final int CAMPAIGN_LENGTH = 10;

  /** The indentation level for the output. */
  private static final String IDENTATION = "  ";

  /** The indentation level for the output. */
  private static final char CHARACTER = 'C';

  /** Run a Sorter in an experiment campaign. */
  public ResultsTable run(Repeater repeater) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(CAMPAIGN_LENGTH);
    // display a debugging statement about the start of a campaign
    System.out.println("Starting a campaign of experiments with " + repeater.getName() + " ...");
    // run a campaign for all of the specified rounds of a campaign
    while (campaignRound < CAMPAIGN_LENGTH) {
      long timeBefore = System.currentTimeMillis();
      repeater.repeat(CHARACTER, currentInputSize);
      long timeAfter = System.currentTimeMillis();
      long timeElapsed = timeAfter - timeBefore;
      results.addResult((long)currentInputSize, timeElapsed);
      // display a diagnostic message about the current round
      System.out.println(IDENTATION + "Running round " + campaignRound
          + " with input size " + currentInputSize);
      currentInputSize = currentInputSize * INPUT_GROWTH_FACTOR;
      campaignRound++;
    }
    // print the final details about the campaign of experiments
    System.out.println("... Finishing a campaign of experiments with " + repeater.getName());
    return results;
  }

}
