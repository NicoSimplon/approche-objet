package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {

		Set<Double> set = new HashSet<>();

		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);

		System.out.println("Liste des éléments :");

		for (double d : set) {
			System.out.println(d);
		}

		System.out.println("Elément le plus grand :");
		double max = 0.0;

		for (Double elem : set) {

			if (elem > max) {
				max = elem;
			}

		}

		System.out.println(max);

		System.out.println("Eléments après suppression du plus petit :");
		double min = 0.0;

		for (Double elem : set) {

			if (elem < min) {
				min = elem;
			}

		}

		Iterator<Double> iterator = set.iterator();

		while (iterator.hasNext()) {
			if (iterator.next() == min) {
				iterator.remove();
			}
		}

		for (double d : set) {
			System.out.println(d);
		}

		System.out.println("Eléments après conversion en positifs :");

		Set<Double> set2 = new HashSet<>();

		Iterator<Double> iterator2 = set.iterator();

		while (iterator2.hasNext()) {
			double val = iterator2.next();
			if (val < 0.0) {
				val = -1 * val;
			}

			set2.add(val);

		}

		set = set2;

		for (double d : set) {
			System.out.println(d);
		}
	}

}
