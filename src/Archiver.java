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

	public static HashMap<Character, Integer> convertStringToFrequencies(String s) { // � ������� �������������
		throw new NotImplementedException();
	}

	public static Tree convertFrequenciesToTree(HashMap<Character, boolean[]> frequencies) {
		throw new NotImplementedException();
	}

	public static HashMap<Character, boolean[]> convertTree(Tree v) {
		throw new NotImplementedException();
	}

	public static ArrayList<Boolean[]> compressString(String s, HashMap<Character, boolean[]> table) {
		throw new NotImplementedException();
	}

	public static ArrayList<Boolean[]> serializeTable(HashMap<Character, boolean[]>) {
		throw new NotImplementedException();
	}

	public static ArrayList<Boolean[]> concatArrayList(ArrayList<Boolean[]> a, ArrayList<Boolean[]> b) {
		throw new NotImplementedException();
	}

	public static String convertCodeToString(ArrayList<Boolean[]> code) {
		throw new NotImplementedException();
	}

	public static void main(String[] args) {
		String input = readLine();
		HashMap<Character, boolean[]> frequencies = convertStringToFrequencies();
		Tree tree = convertFrequenciesToTree(frequencies);
		HashMap<Character, boolean[]> table = convertTree(tree);
		ArrayList<Boolean[]> codeString = convertStrToCode(input, table);
		ArrayList<Boolean[]> codeTable = tableToCode(table);
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		pw.print(convertCodeToString(concatArrayList(codeString, codeTable)));
		pw.close();
	}
}
