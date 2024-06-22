package workflow;

public class UppercaseWorkflow implements Workflow {

  @Override
  public String apply(String input) {
   return input.toUpperCase();
  }
}
