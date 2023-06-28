package unlam.parcial2.torneo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Participante implements Comparator<Participante> {
	
	private Integer numeroDeParticipante;
	private String nombre;
	private Integer puntajeTotal;
	private ArrayList<Tiro> tiros;
	
	public Participante(Integer numeroDeParticipante, String nombre){
		this.nombre = nombre;
		this.numeroDeParticipante = numeroDeParticipante;
		tiros = new ArrayList<>();
	}

	
	public void tirar (Integer x, Integer y){
	Tiro t = new Tiro(x,y);
	tiros.add(t);
	}
	
	public void ordenarTiros(){
		this.tiros.sort(new TiroComprator());
	}
	
	public Integer obtenerPuntajeTotal() {
		this.ordenarTiros();
		Integer puntajeTotal=0;
		
		for (int i = 0; i < 5; i++) {
			puntajeTotal += tiros.get(i).getPuntaje();
		}
		
		return puntajeTotal;
		
//		this.puntajeTotal = tiros.get(0).calcularPuntaje() 
//							+ tiros.get(1).calcularPuntaje() 
//							+ tiros.get(2).calcularPuntaje() 
//							+ tiros.get(3).calcularPuntaje() 
//							+ tiros.get(4).calcularPuntaje();
//		return puntajeTotal;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeParticipante == null) ? 0 : numeroDeParticipante.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		if (numeroDeParticipante == null) {
			if (other.numeroDeParticipante != null)
				return false;
		} else if (!numeroDeParticipante.equals(other.numeroDeParticipante))
			return false;
		return true;
	}


	public String getNombre() {
		return this.nombre;
	}


	@Override
	public int compare(Participante o1, Participante o2) {
		// TODO Auto-generated method stub
		return 0;
	}


//	@Override
//	public int compareTo(Participante p) {
//		int valor=0;
//		try {
//			valor= this.obtenerPuntajeTotal() - p.obtenerPuntajeTotal();
//		} catch (ParticipanteDescalificadoException e) {
//			e.printStackTrace();
//		}
//		return valor;
//	}
//	
	

}
