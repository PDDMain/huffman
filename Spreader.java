//Polzik Daniel
//20.02.2018
//Diarchiever (Haffman)


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;

public class Spreader {

	public static String StrToBites(String l) {
		String s = "";
		for (int i = 0; i < l.length(); i++) {
			char c = l.charAt(i);
			String ch = "";
			int st = 128;
			int sim = (int) c;
			for (int j = 0; j < 8; j++) {
				if (sim >= st) {
					sim -= st;
					ch += "1";
				} else {
					ch += "0";
				}
				st /= 2;
			}
			s = s + ch;
		}
		return s;
	}

	public static char ByteToChar(String s) {
		int n = 0;
		int st = 128;
		for (int i = 0; i < 8; i++) {
			if (s.charAt(i) == '1') {
				n += st;
			}
			st /= 2;
		}
		return ((char) n);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("output.txt"));
		PrintWriter pw = new PrintWriter(new File("input2.txt"));
		String l = sc.nextLine();
		String x = StrToBites(l);
		int sum = 0;
		while (x.charAt(sum) == '0') {
			sum++;
		}
		String s = x.substring(sum + 1, x.length() - sum);
		int ind = 0;
		int n = 0;
		int st = 128;
		for (; ind < 8; ind++) {
			if (s.charAt(ind) == '1') {
				n += st;
			}
			st /= 2;
		}
		HashSet<String> hs = new HashSet<String>();
		char[] sim = new char[n];
		String[] codes = new String[n];
		for (int i = 0; i < n; i++) {
			sim[i] = 0;
			st = 128;
			for (int j = 0; ind + j < s.length() && j < 8; j++) {
				if (s.charAt(ind + j) == '1') {
					sim[i] += st;
				}
				st /= 2;
			}
			ind += 8;
			sum = 0;
			while (ind < s.length() && s.charAt(ind) == '0') {
				sum++;
				ind++;
			}
			ind++;
			if (ind + sum < s.length()) {
				codes[i] = s.substring(ind, ind + sum);
			}
			ind += sum + 1;
			hs.add(codes[i]);
		}
		while (ind < s.length()) {
			String code = "";
			while (!hs.contains(code) && ind < s.length()) {
				code += s.charAt(ind);
				ind++;
			}
			for (int i = 0; i < n; i++) {
				if (codes[i] == code) {
					pw.print(sim[i]);
					break;
				}
			}
		}
		pw.close();
	}
}
