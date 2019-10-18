package practicalfive.experiment;

import practicalfive.data.ResultsTable;
import practicalfive.repeat.Repeater;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Gregory M. Kapfhammer
 */

public interface Campaign {

  /** Require that any Campaign implementer can run a Repeater in an experiment. */
  public ResultsTable run(Repeater repeat);

}
