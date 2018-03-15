import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Archiver {

	public static String readLine(){
		Scanner sc = new Scanner(new File("input.txt"));
		String s = sc.nextLine();
		sc.close();
		return s;
	}
	
	public static HashMap changeStrToArray(String s) {
		HashMap arr = new HashMap();

		return arr;
	}
	
	public static Vertex[] changeArrayToTree(HashMap hs) {
		Vertex[] v = new Vertex[hs.size()];

			return v;
	}
	
	public static byte[] changeTreeToTable(Vertex[] v) {
		byte[] table = new byte[(v.length + 1) / 2];

		return table;
	}
	
	public static ArrayList<Boolean[]> changeStrToCode(String s, bytes[] table) {
		ArrayList<Boolean[]> code = new ArrayList<Boolean[]>();

		return code;
	}
	
	public static ArrayList<Boolean[]> tableToCode(bytes[] table) {
		ArrayList<Boolean[]> code = new ArrayList<Boolean[]>();

		return code;
	}
	
	public static String changeCodeToStr(ArrayList code1, ArrayList code2) {
		String s /*= code1 + code2*/;

		return str;
	}

	public static void main(String[] args) {
		String s = readLine();
		HashMap hs = changeStrToArray();
		Vertex[] v = changeArrayToTree(hs);
		bytes[] table = changeTreeToTable(v);
		ArrayList codeS = changeStrToCode(s, table);
		ArrayList codeT = tableToCode(table);
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		pw.print(codeToStr());
		pw.close();
	}

}
