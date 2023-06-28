package unlam.parcial2.torneo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Torneo {
	
	private String nombre;
	private HashSet<Participante> participantes;
	private ArrayList<Participante> participantesOrdenados;
	
	public Torneo(String nombre){
		this.nombre =nombre;
		participantes = new HashSet<>();
		participantesOrdenados = new ArrayList<>();
	}
	
	public void agregarParticipante(Participante nuevo){
		participantes.add(nuevo);
	}
	
	public void ordenarParticipantes(){
		participantesOrdenados.addAll(participantes);
		participantesOrdenados.sort(new PaticipanteComparator());
	}
	
	
	public Participante conocerAlGanador(){
		ordenarParticipantes();
		return participantesOrdenados.get(0);
	}

}
