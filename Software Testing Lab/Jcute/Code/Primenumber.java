package tests;
import cute.Cute;
public class Primenumber {
		  
		  public static boolean isPrime(int num) {
		    if (num <= 1) {
		      return false;
		    }
		    for (int i = 2; i <= Math.sqrt(num); i++) {
		      if (num % i == 0) {
		        return false;
		      }
		    }
		    return true;
		  }
		  
		  public static void main(String[] args) {
		    int num = Cute.input.Integer();
		    if (isPrime(num)) {
		      System.out.println(num + " is a prime number.");
		    } else {
		      System.out.println(num + " is not a prime number.");
		    }
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
//@jcute.optionNumberOfPaths=100
//@jcute.optionLogLevel=2
//@jcute.optionDepthForDFS=20
//@jcute.optionSearchStrategy=0
//@jcute.optionSequential=true
//@jcute.optionQuickSearchThreshold=100
//@jcute.optionLogRace=true
//@jcute.optionLogDeadlock=true
//@jcute.optionLogException=true
//@jcute.optionLogAssertion=true
//@jcute.optionUseRandomInputs=false
