package executor;

import java.util.List;
import workflow.Workflow;

public class Executor {

  private final List<Workflow> workflows;

  public static Executor create(List<Workflow> workflows) {
    return new Executor(workflows);
  }

  private Executor(List<Workflow> workflows) {
    this.workflows = List.copyOf(workflows);
  }

  public String start(String input) {
    String result = input;
    for (Workflow workflow : workflows) {
      result = workflow.apply(result);
    }
    return result;
  }
}
