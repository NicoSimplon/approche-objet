package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");

		System.out.println("Liste des éléments :");

		for (String s : set) {
			System.out.println(s);
		}

		System.out.println("Elément le plus grand :");
		int max = 0;

		for (String elem : set) {

			if (elem.length() > max) {
				max = elem.length();
			}

		}

		for (String elem : set) {

			if (elem.length() == max) {
				System.out.println(elem);
			}

		}

		System.out.println("Eléments après suppression du plus petit :");
		int min = 200;

		for (String elem : set) {

			if (elem.length() < min) {
				min = elem.length();
			}

		}
		
		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().length() == min) {
				iterator.remove();
			}
		}

		for (String s : set) {
			System.out.println(s);
		}

		System.out.println("Eléments après conversion en positifs :");

		Set<String> set2 = new HashSet<>();

		Iterator<String> iterator2 = set.iterator();

		while (iterator2.hasNext()) {
			String val = iterator2.next().toUpperCase();
			set2.add(val);

		}

		set = set2;

		for (String s : set) {
			System.out.println(s);
		}

	}

}
