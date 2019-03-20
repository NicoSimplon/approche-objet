package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPays {

	public static void main(String[] args) {

		Set<Pays> set = new HashSet<>();

		set.add(new Pays("USA", 327167434, 55805.204));
		set.add(new Pays("France", 67795000, 38476.7));
		set.add(new Pays("Allemagne", 82979100, 47589.972));
		set.add(new Pays("UK", 65105246, 43770.688));
		set.add(new Pays("Italie", 60483973, 29866));
		set.add(new Pays("Japon", 126168156, 39058.5));
		set.add(new Pays("Chine", 1417913092, 7989.72));
		set.add(new Pays("Russie", 146880400, 11099.20));
		set.add(new Pays("Inde", 1296834042, 1626.982));

		System.out.println("Liste des éléments :");

		for (Pays s : set) {
			System.out.println(s);
		}

		System.out.println("Pays avec le PIB/Hab le plus élevé :");

		double max = 0.0;

		for (Pays p : set) {
			if (p.getPibHabitant() > max) {
				max = p.getPibHabitant();
			}
		}

		for (Pays p : set) {
			if (p.getPibHabitant() == max) {
				System.out.println(p);
			}
		}

		System.out.println("Pays avec le PIB le plus élevé :");

		double max2 = 0.0;

		for (Pays p : set) {
			if ((p.getPibHabitant() * p.getNbHabitant()) > max2) {
				max2 = (p.getPibHabitant()) * (p.getNbHabitant());
			}
		}

		for (Pays p : set) {
			if ((p.getPibHabitant() * p.getNbHabitant()) == max2) {
				System.out.println(p + " PIB:" + max2);
			}
		}

		System.out.println("Pays :");

		double min = 1.9257645396526535E13;

		for (Pays p : set) {
			if ((p.getPibHabitant() * p.getNbHabitant()) < min) {
				min = (p.getPibHabitant()) * (p.getNbHabitant());
			}
		}

		for (Pays p : set) {
			if ((p.getPibHabitant() * p.getNbHabitant()) == min) {
				p.setNom(p.getNom().toUpperCase());
			}
		}

		for (Pays s : set) {
			System.out.println(s);
		}

		System.out.println("Liste après suppression du pays avec le PIB le plus bas :");

		Iterator<Pays> iterator = set.iterator();

		while (iterator.hasNext()) {
			Pays p = iterator.next();

			if ((p.getPibHabitant() * p.getNbHabitant()) == min) {
				iterator.remove();
			}

		}

		for (Pays s : set) {
			System.out.println(s + " " + (s.getNbHabitant() * s.getPibHabitant()));
		}
	}

}
