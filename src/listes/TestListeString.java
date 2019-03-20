package listes;

import java.util.*;

public class TestListeString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");
		list.add("Toulouse"); // La meilleure ville du monde

		int max = list.get(0).length();

		for (String elem : list) {
			if (elem.length() > max) {
				max = elem.length();
			}
		}

		for (String elem : list) {
			if (elem.length() == max) {
				System.out.println(elem);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}

		for (String elem : list) {
			System.out.println(elem);
		}

		System.out.println("Liste après supression :");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String temp = iterator.next().substring(0, 1);
			if (temp.equals("N")) {
				iterator.remove();
			}
		}

		for (String elem : list) {
			System.out.println(elem);
		}

	}

}
