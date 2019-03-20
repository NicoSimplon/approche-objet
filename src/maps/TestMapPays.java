package maps;

import java.util.*;

import sets.Pays;

public class TestMapPays {

	public static void main(String[] args) {

		Map<String, Pays> map = new HashMap<>();

		Pays usa = new Pays("USA", 327167434, 55805.204);
		Pays france = new Pays("France", 67795000, 38476.7);
		Pays allemagne = new Pays("Allemagne", 82979100, 47589.972);
		Pays uk = new Pays("UK", 65105246, 43770.688);
		Pays italie = new Pays("Italie", 60483973, 29866);
		Pays japon = new Pays("Japon", 126168156, 39058.5);
		Pays chine = new Pays("Chine", 1417913092, 7989.72);
		Pays russie = new Pays("Russie", 146880400, 11099.20);
		Pays inde = new Pays("Inde", 1296834042, 1626.982);

		map.put(usa.getNom(), usa);
		map.put(france.getNom(), france);
		map.put(allemagne.getNom(), allemagne);
		map.put(uk.getNom(), uk);
		map.put(italie.getNom(), italie);
		map.put(japon.getNom(), japon);
		map.put(chine.getNom(), chine);
		map.put(russie.getNom(), russie);
		map.put(inde.getNom(), inde);

		Iterator ite = map.keySet().iterator();

		System.out.println("Liste des clés : :");
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		Iterator ite2 = map.values().iterator();

		System.out.println("Liste des valeurs :");
		while (ite2.hasNext()) {
			System.out.println(ite2.next());
		}
		
		int max = 0;
		Pays pays = new Pays(null, max, max);
		
		Iterator ite3 = map.values().iterator();

		while (ite3.hasNext()) {
			Pays p = (Pays) ite3.next();
			
			if(p.getNbHabitant() > max){
				max = p.getNbHabitant();
				pays = p;
			}
		}
		
		System.out.println("Pays avec le plus d'habitants :");
		System.out.println(pays);
		
		
		
	}

}
