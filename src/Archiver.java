import jdk.jshell.spi.ExecutionControl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Archiver {

    public static class Tree {
        Node[] nodes;

        public static int getLeavesCount() {
            throw new UnsupportedOperationException();
        }
    }

    public static class Node {
    }

    public static String readLine() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        String s = sc.nextLine();
        sc.close();
        return s;
    }

    public static HashMap<Character, Integer> convertStringToFrequencies(String s) { // в частоты встречаемости
        throw new UnsupportedOperationException();
    }

    public static Tree convertFrequenciesToTree(HashMap<Character, Integer> frequencies) {
        throw new UnsupportedOperationException();
    }

    public static HashMap<Character, boolean[]> convertTree(Tree v) {
        throw new UnsupportedOperationException();
    }

    public static ArrayList<Boolean[]> compressString(String s, HashMap<Character, boolean[]> table) {
        throw new UnsupportedOperationException();
    }

    public static ArrayList<Boolean[]> serializeTable(HashMap<Character, boolean[]> table) {
        throw new UnsupportedOperationException();
    }

    public static ArrayList<Boolean[]> concatArrayList(ArrayList<Boolean[]> a, ArrayList<Boolean[]> b) {
        throw new UnsupportedOperationException();
    }

    public static String convertCodeToString(ArrayList<Boolean[]> code) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) throws FileNotFoundException {
        String input = readLine();
        HashMap<Character, Integer> frequencies = convertStringToFrequencies(input);
        Tree tree = convertFrequenciesToTree(frequencies);
        HashMap<Character, boolean[]> table = convertTree(tree);
        ArrayList<Boolean[]> codeString = compressString(input, table);
        ArrayList<Boolean[]> codeTable = serializeTable(table);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        pw.print(convertCodeToString(concatArrayList(codeString, codeTable)));
        pw.close();
    }
}
