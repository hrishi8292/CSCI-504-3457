package homework;
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
/**
 *
 * @author hrishimane
 */
public class calcBMI {

    public static void main(String[] args) {
        // TODO code application logic here
        final int sz=100;
        String [] name=new String[sz];
        double [] weight= new double[sz];
        double [] height= new double[sz];
        double [] BMI= new double[sz];
        
        final double BMIUnder= 18.5;
	final double BMINormal= 25.0;
	final double BMIOver= 30.0;
	final double BMIObese= 30.0;
        
        int 	normalWeight=0;	 				
        int	overWeight=0;
	int	obese=0;
        
        Scanner k=new Scanner(System.in);
        System.out.println("This program calculats BMI for many people”\n" +
"			+ “Step 1 - Enter name, weight & height for every body first”\n" +
"			+ “Step 2 - The program  calculates all BMI first, it then”\n" +
"			+ “Step 3 – calcuate number of people are under weight“\n" +
"			+ “Step 4 – calcuate number of people are normal weight“\n" +
"			+ “Step 5 – calcuate number of people are over weight“\n" +
"			+ “Step 6 – calcuate number of people are in obesity range");
        
        int i=0;
         while(i<=sz){
            System.out.println("Enter the name");
            name[i]=k.next();
            System.out.println("Enter the Weight");
            weight[i]=k.nextDouble();
            System.out.println("Enter the Height");
            height[i]=k.nextDouble();
            
            BMI[i]=(weight[i]*703)/(height[i]*height[i]);
            
            System.out.println("Enter 'Y' for more else 'N'");
            String more = k.next();
            if(more.equalsIgnoreCase("Y")){
                i++;
                //System.out.println("test");
                continue;
            }else{
                System.out.println("test");
                break;
            }
        }
        //System.out.println("test1");
         
         int j = 0;
        
        while(j<=i){
            System.out.println("test2");
            if(BMI[i]<=BMINormal)
                normalWeight++;
                
            else if (BMI[i]<=BMIOver){
                overWeight++;
                    }
            else{
                obese++;
            }
            j++;
        }
        
        System.out.println("BMI Calculation and Analysis Report");
        int h=0;
        while(h<=i){
            System.out.println(name[h]+" "+weight[h]+" "+BMI[h]);
            h++;
        }
        System.out.println("No. of Normal weight person ="+ normalWeight
        +"No.of over weight person ="+ overWeight
        +"No. of obese range person ="+ obese
        +"\nEnd of BMI Stastical Job");
    }
    
}