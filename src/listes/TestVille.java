package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {

		List<Ville> list = new ArrayList<>();

		list.add(new Ville("Nice", 343000));
		list.add(new Ville("Carcassonne", 47800));
		list.add(new Ville("Narbonne", 53400));
		list.add(new Ville("Lyon", 484000));
		list.add(new Ville("Foix", 9700));
		list.add(new Ville("Pau", 77200));
		list.add(new Ville("Marseille", 850700));
		list.add(new Ville("Tarbes", 40600));

		Iterator iterator = list.iterator();

		System.out.println("Eléments de la liste :");

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Ville avec le plus d'habitants :");

		int max = list.get(0).getNbHabitant();
		Ville vi = list.get(0);

		for (Ville v : list) {
			if (v.getNbHabitant() > max) {
				max = v.getNbHabitant();
				vi = v;
			}
		}

		for (Ville v : list) {
			if (v.getNbHabitant() == max) {
				System.out.println(v);
			}
		}

		System.out.println("Après suppression de la ville la plus petite :");

		int min = list.get(0).getNbHabitant();
		Ville vim = list.get(0);

		for (Ville v : list) {
			if (v.getNbHabitant() < min) {
				min = v.getNbHabitant();
				vim = v;
			}
		}

		list.remove(vim);

		for (Ville v : list) {
			System.out.println(v);
		}

		System.out.println("Après modification des villes de plus de 100 000 habitants :");

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNbHabitant() > 100000) {
				list.get(i).setNom(list.get(i).getNom().toUpperCase());
			}
		}

		for (Ville v : list) {
			System.out.println(v);
		}

	}

}
