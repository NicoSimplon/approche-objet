package tri;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import sets.Pays;

public class TestTri {

	public static void main(String[] args) {

		List<Pays> list = new ArrayList<>();
		
		list.add(new Pays("USA", 327167434, 55805.204));
		list.add(new Pays("France", 67795000, 38476.7));
		list.add(new Pays("Allemagne", 82979100, 47589.972));
		list.add(new Pays("UK", 65105246, 43770.688));
		list.add(new Pays("Italie", 60483973, 29866));
		list.add(new Pays("Japon", 126168156, 39058.5));
		list.add(new Pays("Chine", 1417913092, 7989.72));
		list.add(new Pays("Russie", 146880400, 11099.20));
		list.add(new Pays("Inde", 1296834042, 1626.982));

		Collections.sort(list);
		
		System.out.println("tri par nom :");
		
		for (Pays p : list) {
			System.out.println(p);
		}

		System.out.println("tri par pib/hab :");
		
		list.sort(new PaysComparator());
		
		for (Pays p : list) {
			System.out.println(p);
		}
		
		System.out.println("tri par nb d'habitants :");

		list.sort(new PaysComparator2());
		
		for (Pays p : list) {
			System.out.println(p);
		}

	}

}
