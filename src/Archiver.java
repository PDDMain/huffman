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
			throw new UnsupportedOperationException();
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

	public static HashMap<Character, Integer> convertStringToFrequencies(String s) { // частота встречаемости каждого из символов
		throw new UnsupportedOperationException();
	}

	public static Tree convertFrequenciesToTree(HashMap<Character, Boolean[]> frequencies) {
		throw new UnsupportedOperationException();
	}

	public static HashMap<Character, Boolean[]> convertTree(Tree v) {
		throw new UnsupportedOperationException();
	}

	public static ArrayList<Boolean[]> compressString(String s, HashMap<Character, Boolean[]> table) {
		throw new UnsupportedOperationException();
	}

	public static ArrayList<Boolean[]> serializeTable(HashMap<Character, Boolean[]>) {
		throw new UnsupportedOperationException();
	}

	public static ArrayList<Boolean[]> concatArrayList(ArrayList<Boolean[]> a, ArrayList<Boolean[]> b) {
		throw new UnsupportedOperationException();
	}

	public static String convertCodeToString(ArrayList<Boolean[]> code) {
		throw new UnsupportedOperationException();
	}

	public static void main(String[] args) {
		String input = readLine();
		HashMap<Character, Boolean[]> frequencies = convertStringToFrequencies();
		Tree tree = convertFrequenciesToTree(frequencies);
		HashMap<Character, Boolean[]> table = convertTree(tree);
		ArrayList<Boolean[]> codeString = convertStrToCode(input, table);
		ArrayList<Boolean[]> codeTable = tableToCode(table);
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		pw.print(convertCodeToString(concatArrayList(codeString, codeTable)));
		pw.close();
	}
}
