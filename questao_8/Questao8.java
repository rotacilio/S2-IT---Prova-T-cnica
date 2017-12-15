import java.io.Console;

public class Questao8 {
	
	public static int makeC(int numA, int numB) {
		String strNumA = String.valueOf(numA);
		String strNumB = String.valueOf(numB);
		StringBuilder strNumC = new StringBuilder();
		
		int finalIndice = strNumA.length();
		String strFinal = null;
		if (strNumA.length() < strNumB.length()) {
			finalIndice = strNumA.length();
			strFinal = strNumB.substring(strNumA.length());
		} else if (strNumA.length() > strNumB.length()) {
			finalIndice = strNumB.length();
			strFinal = strNumA.substring(strNumB.length());
		}
		
		for (int i = 0; i < finalIndice; i++) {
			strNumC.append(String.valueOf(strNumA.charAt(i)));
			strNumC.append(String.valueOf(strNumB.charAt(i)));
		}
		
		if (strFinal != null) {
			strNumC.append(strFinal);
		}
		
		Integer result = Integer.valueOf(strNumC.toString());
		
		return result.intValue() > 1000000 ? -1 : result;
		//return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        /*
		Console console = System.console();
		
		if (console == null) {
            System.out.println("Console is not enabled.");
            return;
        }
		
		String strA = console.readLine("Entre com o numero A: ");
		String strB = console.readLine("\nEntre com o numero B: ");
		
		if (strA == null || strB == null) {
			System.out.println("Valores invalidos.");
			return;
		}
		
		int numA = Integer.valueOf(strA).intValue();
		int numB = Integer.valueOf(strB).intValue();
		
		int c = makeC(numA, numB);
        */

        int c = makeC(10256, 512);
		System.out.println(c);
	}

}
