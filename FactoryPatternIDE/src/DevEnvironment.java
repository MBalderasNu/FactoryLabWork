import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DevEnvironment {

	public void executeCommand(String command, boolean wait) throws Exception {
		//Source: http://stackoverflow.com/questions/4842684/how-to-compile-run-java-program-in-another-java-program
		System.out.println(command);
		Process pro = Runtime.getRuntime().exec(command);
		if (wait)
		{
			printLines(command + " stdout:", pro.getInputStream());
			printLines(command + " stderr:", pro.getErrorStream());
			pro.waitFor();
			System.out.println(command + " exitValue() " + pro.exitValue());
		}
	}

	private static void printLines(String name, InputStream ins) throws Exception {
		String line = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(ins));
		while ((line = in.readLine()) != null) {
			System.out.println(name + " " + line);
		}
	}
}
