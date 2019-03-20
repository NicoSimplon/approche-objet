package tri;

import java.util.Comparator;

import sets.Pays;

public class PaysComparator implements Comparator<Pays> {

	@Override
	public int compare(Pays p1, Pays p2) {
		
		Pays pays1 = (Pays) p1;
		Pays pays2 = (Pays) p1;

		if (pays1.getPibHabitant() > pays2.getPibHabitant()) {
			
			return 1;
			
		} else if (pays1.getPibHabitant() < pays2.getPibHabitant()) {
			
			return -1;
			
		} else {
			
			return 0;
			
		}
	}

}
