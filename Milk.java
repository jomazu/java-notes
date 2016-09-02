/**
* Javadoc example ...
*/

import java.io.Console;

public class DoWhile {

  public static void main(String[] args) {
  Console console = System.console();

  String response;
  boolean isNo;

    do {
      response = console.readLine("Do you understand do while loops?  ");
      isNo = (response.equalsIgnoreCase("No"));
      if (isNo) {
        console.printf("Because you said %s, you passed the test!\n", response);
        System.exit(0);
      }
    } while(isNo);
  }
}