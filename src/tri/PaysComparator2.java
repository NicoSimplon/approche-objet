package tri;

import java.util.Comparator;

import sets.Pays;

public class PaysComparator2 implements Comparator<Pays> {

	@Override
	public int compare(Pays p1, Pays p2) {

		if (p1.getNbHabitant() > p2.getNbHabitant()) {
			
			return 1;
			
		} else if (p1.getNbHabitant() < p2.getNbHabitant()) {
			
			return -1;
			
		} else {
			
			return 0;
			
		}
	}
	
}
