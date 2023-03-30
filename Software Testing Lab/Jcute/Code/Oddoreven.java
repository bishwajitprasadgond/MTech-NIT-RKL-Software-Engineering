package tests;
import cute.Cute;
public class Oddoreven {
	public static String evenorodd(int n) {
		if(n%2==0)
		{
			return "Number is Even";
		}
		else
		{
			return "Number is Odd";
		}
	}
	public static void main(String[] args) {
    	int n = Cute.input.Integer();
	String out = evenorodd(n);
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
//@jcute.optionLogLevel=3
//@jcute.optionDepthForDFS=10
//@jcute.optionSearchStrategy=0
//@jcute.optionSequential=true
//@jcute.optionQuickSearchThreshold=100
//@jcute.optionLogRace=true
//@jcute.optionLogDeadlock=true
//@jcute.optionLogException=true
//@jcute.optionLogAssertion=true
//@jcute.optionUseRandomInputs=false
