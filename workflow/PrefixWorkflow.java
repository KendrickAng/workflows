package workflow;

public class PrefixWorkflow implements Workflow {

  @Override
  public String apply(String input) {
    return "PrefixWorkflow: " + input;
  }
}
