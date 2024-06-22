import executor.Executor;
import java.util.List;
import workflow.PrefixWorkflow;
import workflow.UppercaseWorkflow;
import workflow.Workflow;

public class Main {
  public static void main(String[] args) {
    Workflow uppercaseWorkflow = new UppercaseWorkflow();
    Workflow prefixWorkflow = new PrefixWorkflow();
    Executor executor = Executor.create(List.of(
        uppercaseWorkflow,
        prefixWorkflow));
    String result = executor.start("hello world");
    System.out.println(result);
  }
}
