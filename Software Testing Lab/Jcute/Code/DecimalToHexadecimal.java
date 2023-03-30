package tests;
import cute.Cute;
import java.util.Scanner;
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = Cute.input.Integer();
        String hexadecimal = "";

        if (decimal == 0) {
            hexadecimal = "0";
        } else {
            while (decimal > 0) {
                int remainder = decimal % 16;
                if (remainder < 10) {
                    hexadecimal = remainder + hexadecimal;
                } else {
                    hexadecimal = (char) ('A' + remainder - 10) + hexadecimal;
                }
                decimal /= 16;
            }
        }

        System.out.println("Hexadecimal equivalent: " + hexadecimal);
    }
}
//@The following comments are auto-generated to save options for testing the current file
//@jcute.optionPrintOutput=true
//@jcute.optionLogPath=true
//@jcute.optionLogTraceAndInput=true
//@jcute.optionGenerateJUnit=true
//@jcute.optionExtraOptions=
//@jcute.optionJUnitOutputFolderName=C:\jcute
//@jcute.optionJUnitPkgName=
//@jcute.optionNumberOfPaths=10000
//@jcute.optionLogLevel=3
//@jcute.optionDepthForDFS=0
//@jcute.optionSearchStrategy=0
//@jcute.optionSequential=true
//@jcute.optionQuickSearchThreshold=100
//@jcute.optionLogRace=true
//@jcute.optionLogDeadlock=true
//@jcute.optionLogException=true
//@jcute.optionLogAssertion=true
//@jcute.optionUseRandomInputs=false
