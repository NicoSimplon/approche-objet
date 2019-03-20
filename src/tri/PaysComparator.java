package tri;

import java.util.Comparator;

import sets.Pays;

public class PaysComparator implements Comparator<Pays> {

	@Override
	public int compare(Pays p1, Pays p2) {

		if (p1.getPibHabitant() > p2.getPibHabitant()) {
			
			return 1;
			
		} else if (p1.getPibHabitant() < p2.getPibHabitant()) {
			
			return -1;
			
		} else {
			
			return 0;
			
		}
	}

}
