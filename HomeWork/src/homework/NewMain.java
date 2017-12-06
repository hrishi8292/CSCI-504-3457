package homework;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewMain {

  public static void main(String argv[]) {
    String message = "\"The Comedy of Errors\"\n"
        + "is considered by many scholars to be\n"
        + "the first play Shakespeare wrote";
    JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
  }
}