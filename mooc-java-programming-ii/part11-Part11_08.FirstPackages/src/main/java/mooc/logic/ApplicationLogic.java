package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
  private UserInterface ui;

  // constructor
  public ApplicationLogic(UserInterface ui) {
    this.ui = ui;
  }

  public void execute(int times) {
    for (int i = 0; i < times; i += 1) {
      System.out.println("Application logic is working"); // Prints the string "Application logic is working" the number
                                                          // of times that is indicated by the variable times
      ui.update(); // call the update() method of the object that was received as a constructor
      // parameter
    }
  }
}
