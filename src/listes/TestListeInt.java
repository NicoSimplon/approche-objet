package listes;

import java.util.*;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);

		Iterator iterator = list.iterator();

		System.out.println("Eléments de la liste");

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println("");
		System.out.println("Elément le plus grand");
		int max = list.get(0);

		for (Integer elem : list) {

			if (elem > max) {
				max = elem;
			}

		}

		System.out.println(max);

		int min = list.get(0);

		for (Integer elem : list) {

			if (elem < min) {
				min = elem;
			}

		}

		Iterator<Integer> iterator2 = list.iterator();

		while (iterator2.hasNext()) {
			if (iterator2.next() == min) {
				iterator2.remove();
			}
		}

		System.out.println("");
		System.out.println("Supprime l'élément le plus petit");

		Iterator iterator3 = list.iterator();

		while (iterator3.hasNext()) {
			System.out.print(iterator3.next() + " ");
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 0) {
				int elem = -1 * list.get(i);
				list.set(i, elem);
			}
		}

		System.out.println("");
		System.out.println("Liste Finale");

		Iterator iterator4 = list.iterator();
		while (iterator4.hasNext()) {
			System.out.print(iterator4.next() + " ");
		}

	}

}
