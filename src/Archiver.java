import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Archiver {

	public static class Tree()
	{
		Node[] nodes;

		public static int getLeavesCount() {
			throw new NotImplementedException();
		}
	}

	public static class Node {
	}

	public static String readLine() {
		Scanner sc = new Scanner(new File("input.txt"));
		String s = sc.nextLine();
		sc.close();
		return s;
	}

	public static HashMap<Character, Integer> convertStrToFrequencies(String s) { // в частоты встречаемости
		throw new NotImplementedException();
	}

	public static Vertex[] convertArrayToTree(HashMap hs) {
		throw new NotImplementedException();
	}

	public static HashMap<Character, boolean[]> convertTreeToTable(Vertex[] v) {
		throw new NotImplementedException();
	}

	public static ArrayList<Boolean[]> compressString(String s, HashMap<Character, boolean[]> table) {
		throw new NotImplementedException();
	}

	public static ArrayList<Boolean[]> convertTableToString(bytes[] table) {
		throw new NotImplementedException();
	}

	public static String convertCodeToString(ArrayList code1, ArrayList code2) {
		String result /* = code1 + code2 */;
		return result;
	}

	public static void main(String[] args) {
		String input = readLine();
		HashMap<Character, boolean[]> frequencies = convertStrToFrequencies();
		Tree tree = convertArrayToTree(frequencies);
		HashMap<Character, boolean[]> table = convertTreeToTable(tree);
		ArrayList codeString = convertStrToCode(input, table);
		ArrayList codeTable = tableToCode(table);
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		pw.print(convertCodeToStr(codeString, codeTable));
		pw.close();
	}
}
