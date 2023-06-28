package unlam.parcial2.torneo;

import java.util.Comparator;

public class TiroComprator implements Comparator<Tiro> {

	@Override
	public int compare(Tiro o1, Tiro o2) {
		// TODO Auto-generated method stub
		return o1.getPuntaje().compareTo(o2.getPuntaje());
	}

}
