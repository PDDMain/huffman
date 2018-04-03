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

	public static HashMap<Character, Integer> convertStringToFrequencies(String s) { // в частоты встречаемости
		throw new NotImplementedException();
	}

	public static Tree convertArrayToTree(HashMap<Character, boolean[]> frequencies) {
		throw new NotImplementedException();
	}

	public static HashMap<Character, boolean[]> convertTreeToTable(Tree v) {
		throw new NotImplementedException();
	}

	public static ArrayList<Boolean[]> compressString(String s, HashMap<Character, boolean[]> table) {
		throw new NotImplementedException();
	}

	public static ArrayList<Boolean[]> serializeTable(bytes[] table) {
		throw new NotImplementedException();
	}

	public static ArrayList<Boolean[]> contactArrayList(ArrayList<Boolean[]> codeString, ArrayList<Boolean[]> codeTable) {
		throw new NotImplementedException();
	}
	
	public static String convertCodeToString(ArrayList<Boolean[]> code) {
		throw new NotImplementedException();
	}

	public static void main(String[] args) {
		String input = readLine();
		HashMap<Character, boolean[]> frequencies = convertStringToFrequencies();
		Tree tree = convertArrayToTree(frequencies);
		HashMap<Character, boolean[]> table = convertTreeToTable(tree);
		ArrayList<Boolean[]> codeString = convertStrToCode(input, table);
		ArrayList<Boolean[]> codeTable = tableToCode(table);
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		ArrayList<Boolean[]> code = contactArrayList(codeString, codeTable);
		pw.print(convertCodeToString(code));
		pw.close();
	}
}
