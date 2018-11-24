package pl.jaceksysiak.main;

 import java.util.Arrays;
 import org.apache.commons.lang3.StringUtils;

public class App {

	public static void main(String[] args) {
		 
		System.out.println(StringUtils.swapCase(Arrays.toString(args)));
	}

}
