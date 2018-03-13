import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archiver {
	
	static String S;
	static Type1 arr;
	static Vertex[] v;
	static byte[][] table;
	
	public static Type1 stringToArraysQuantity() {
		return arr;
	}
	
	public static Vertex[] arraysQuantityToTree() {
		return v;
	}
	
	public static byte[][] treeToTable() {
		return table;
	}
	
	public static Boolean[] strToCode() {
		return code;
	}
	
	public static Boolean[] tableToCode() {
		return codeS;
	}
	
	public static String codeToStr() {
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		S = sc.nextLine();
		sc.close();
		stringToArraysQuantity();
		arraysQuantityToTree();
		treeToTable();
		Boolean[] codeS = strToCode();
		Boolean[] codeT = tableToCode();
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		pw.print(codeToStr());
		pw.close();
	}

}
