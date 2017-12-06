package homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class J22_Qz4_save_BMI_to_textFile_HrishikeshM {

    static final double BMIUnder = 18.5;
    static final double BMINormal = 25.0;
    static final double BMIOver = 30.0;
    static final double BMIObese = 30.0;
    static int count=0;
    static PrintWriter writer;

    public static void outputStream(String fileName) throws FileNotFoundException {
        writer = new PrintWriter(new FileOutputStream(fileName, true));

    }

    public void calculateBMI() {
        boolean again = true;
        
        String name = null;
        double w = 0, h = 0;
        double BMI;
        String sBMI = null, cmt = null;

        do {

            JTextField f1 = new JTextField();
            JTextField f2 = new JTextField();
            JTextField f3 = new JTextField();

            Object[] flds = {"Enter User name= ", f1,
                "Enter Weight in Pounds= ", f2,
                "Enter Height in Inches= ", f3};
            //Getting inputs from user and storing in local variables
            JOptionPane.showConfirmDialog(null, flds, "Enter the following values", JOptionPane.OK_CANCEL_OPTION);
            name = f1.getText();
            w = Double.parseDouble(f2.getText());
            h = Double.parseDouble(f3.getText());
            BMI = (w * 703) / (h * h);

            DecimalFormat dFmt = new DecimalFormat("#.##");
            sBMI = dFmt.format(BMI);
            //Code for comment on calculated BMI
            if (BMI <= BMINormal) {
                cmt = "Your BMI is normal";
            } else if (BMI <= BMIOver) {
                cmt = "Your BMI is over normal!";
            } else {
                cmt = "Your BMI is obese!";
            }

            Object[] flds2 = {name + ", " + w + ", " + h + ", " + "BMI: " + sBMI + ", " + cmt};
            String flds21 = name + ", " + w + ", " + h + ", " + "BMI: " + sBMI + ", " + cmt;

            JOptionPane.showMessageDialog(null, flds2, "BMI Calculator Results", JOptionPane.OK_CANCEL_OPTION);
            writer.println(flds21);
            count += 1;

            int j = JOptionPane.showConfirmDialog(null, "Calculate a New BMI?", "Repeat?", JOptionPane.YES_NO_OPTION);

            if (j == JOptionPane.NO_OPTION) {
                again = false;
            } else if (j == JOptionPane.YES_OPTION) {
                again = true;
            }
            writer.flush();

        } while (again == true);

        JOptionPane.showMessageDialog(null, "\n Number of BMI Values calculated= " + count + "\n End of Job");
        System.exit(0);
    }

    public static void main(String[] args) {

        String fileName = null;
        J22_Qz4_save_BMI_to_textFile_HrishikeshM obj= new J22_Qz4_save_BMI_to_textFile_HrishikeshM();

        JOptionPane.showMessageDialog(null, "BMI values calculator");
        fileName = JOptionPane.showInputDialog("Enter the file name :");

        try {
            outputStream(fileName);
            obj.calculateBMI();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR!\n" + e);
        }
        JOptionPane.showMessageDialog(null, "\n Number of BMI Values calculated= " + count + "\n End of Job");
        System.exit(0);
    }
}
