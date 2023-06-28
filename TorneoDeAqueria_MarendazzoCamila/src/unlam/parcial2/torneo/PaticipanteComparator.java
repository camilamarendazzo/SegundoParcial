package unlam.parcial2.torneo;

import java.util.Comparator;

public class PaticipanteComparator implements Comparator<Participante> {

	@Override
	public int compare(Participante o1, Participante o2) {
		// TODO Auto-generated method stub
		return o2.obtenerPuntajeTotal().compareTo(o1.obtenerPuntajeTotal());
	}

}
