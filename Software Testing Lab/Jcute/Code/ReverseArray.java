package tests;
import cute.Cute;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int n = Cute.input.Integer();
    	int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]= Cute.input.Integer();
        }
        System.out.println("Original array: " + Arrays.toString(arr));

        int[] reversedArr = reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(reversedArr));
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            reversedArr[j] = arr[i];
            j--;
        }

        return reversedArr;
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
