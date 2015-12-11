package Programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDoubles {
	public static LinkedList<Double> FileToLinkListDouble(String x) throws IOException {
		String Line;
		LinkedList<Double> list = new LinkedList<Double>();
		BufferedReader br = new BufferedReader(new FileReader(x));
		while (true) {
			Line = br.readLine();
			if (Line == null) {
				break;
			}
			String[] j = Line.split(",");
			for (int i = 0; i < j.length; i++) {
				double e = Double.parseDouble(j[i].trim());
				list.add(e);
			}

		}
		br.close();
		return list;
	}

	public static double addLinkedList(LinkedList<Double> list) {
		double sum = 0;

		for (Double i : list) {
			sum = sum + i;
		}
		return sum;
	}

	public static int Count(LinkedList<Double> list) {
		HashSet<Double> set = new HashSet<Double>();
		for (Iterator<Double> i = (Iterator<Double>) list.iterator(); ((Iterator<Double>) i).hasNext();) {
			set.add(i.next());
		}
		return set.size();
	}

	public static HashMap<Double, Integer> Stats(LinkedList<Double> list) {
		HashMap<Double, Integer> map = new HashMap<Double, Integer>();
		for (Double i : list) {
			double j;
			int k;
			j = i;
			if (map.containsKey(j)) {
				k = map.get(j) + 1;
				map.put(j, k);
			} else {
				map.put(j, 1);
			}
		}
		return map;
	}
}