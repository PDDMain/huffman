//Polzik Daniel
//20.02.2018
//Archiever (Haffman)


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Archiver {

	public static class Vertex implements Comparable<Vertex> {
		int index, value, par, left, right;
		char ch;
		String s;
		String c;

		@Override
		public int compareTo(Vertex o) {
			// TODO Auto-generated method stub
			return value - o.value;
		}
	}

	public static String BitesToStr(String ll) {
		String str = "";
		int sum = 8 - ll.length() % 8;
		ll = "1" + ll;
		for (int i = 0; sum != 8 && i < sum; i++) {
			ll = "0" + ll;
		}
		for (int i = 0; i < ll.length();) {
			int st = 128;
			int d = 0;
			for (int j = 0; j < 8; j++) {
				if (i < ll.length() && ll.charAt(i) == '1') {
					d += st;
				}
				st /= 2;
				i++;
			}
			str += (char) d;
		}
		return str;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("input.txt"));
		PrintWriter pw = new PrintWriter(new File("output.txt"));
		String arr = sc.nextLine();
		char[] c = arr.toString().toCharArray();
		int n = java.lang.Character.MAX_VALUE + 1;
		int[] p = new int[n];
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			p[c[i]]++;
			if (p[c[i]] == 1) {
				sum++;
			}
		}
		PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>();

		Vertex[] ver = new Vertex[sum * 2];
		int ind = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] > 0) {
				ver[ind] = new Vertex();
				ver[ind].ch = (char) i;
				ver[ind].value = p[i];
				ver[ind].index = ind;
				ver[ind].s = "";
				pq.add(ver[ind]);
				ind++;
			}
		}
		while (pq.size() > 1) {
			Vertex v1 = pq.poll();
			Vertex v2 = pq.poll();

			ver[ind] = new Vertex();
			ver[ind].index = ind;
			ver[ind].s = "";
			ver[ind].left = v1.index;
			ver[ind].right = v2.index;
			ver[ind].value = v1.value + v2.value;

			ver[v1.index].par = ind;
			ver[v1.index].c = "0";
			ver[v2.index].par = ind;
			ver[v2.index].c = "1";

			pq.add(ver[ind]);

			ind++;
		}
		for (int i = ind - 2; i >= 0; i--) {
			ver[i].s = ver[ver[i].par].s + ver[i].c;
		}
		String[] l = new String[n];
		for (int i = 0; i < sum; i++) {
			l[ver[i].ch] = ver[i].s;
		}
		String ll = "";
		for (int i = 0; i < c.length; i++) {
			ll += l[c[i]];
		}
		String list = "";
		for (int i = 0; i < sum; i++) {
			String x = "1" + ver[i].s;
			for (int j = 0; j < (ver[i].s).length(); j++) {
				x = "0" + x;
			}
			String ch = "";
			int st = 128;
			int sim = ver[i].ch;
			for (int j = 0; j < 8; j++) {
				if (sim >= st) {
					sim -= st;
					ch += "1";
				} else {
					ch += "0";
				}
				st /= 2;
			}
			list = list + ch + x;
		}
		String y = "";
		int st = 128;
		int tmp = sum;
		for (int i = 0; i < 8; i++) {
			if (tmp >= st) {
				tmp -= st;
				y += "1";
			} else {
				y += "0";
			}
			st /= 2;
		}
		ll = y + list + ll;
		BitSet bs = new BitSet();
		for(int i = 0; i < ll.length(); i++) {
			if(ll.charAt(i) == '1') {
				bs.set(i);
			}
		}
		pw.print(BitesToStr(ll));
		pw.close();
	}
}
