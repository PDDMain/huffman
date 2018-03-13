//Polzik Daniel
//20.02.2018
//String to Double code



import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class StrToDoubleCode {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
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
			System.out.print(l[c[i]]);
		}
	}
}