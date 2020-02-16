package translating_names;

public class NameChanger {

  public String input;


  public void setInput(String input) {
    this.input = input;

  }
  private String getInput() {
    return input;
  }

  public String translateToSnakeCase() {
    insertUnderscore(input);
    String output = getInput();
    return output;
  }



  private String insertUnderscore(String input) {
    this.input = input.replaceAll("(.)([A-Z|\\s])","$1_$2");
    return input;
  }
}





















//  public String translateToSnakeCase(String name) {
////    return "hello_world";
////  }