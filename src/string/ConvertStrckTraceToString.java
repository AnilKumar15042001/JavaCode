package string;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ConvertStrckTraceToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int n=0/0;
		}
		catch(ArithmeticException e)
		{
			StringWriter str=new StringWriter();
			e.printStackTrace(new PrintWriter(str));
			String exception=str.toString();
			System.out.println(exception);
		}
	}

}
