package unlam.parcial2.torneo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TorneoTest {

	@Test
	public void queSeCalculeCorrectamenteElPuntajeDeUnTiro(){
			Tiro t = new Tiro(1, 1);
		
			Integer puntajeEsperado = 1000;	
			Integer puntajeObtenido = t.getPuntaje();
			assertEquals(puntajeEsperado, puntajeObtenido);
	}
	
	@Test
	public void queSePuedaCorroborarQueElTiroEstaDentroDelBlanco(){
		Tiro t1 = new Tiro(1, 1);
		assertFalse(t1.estaFueraDelBlanco());
		
		Tiro t2 = new Tiro(12000, 12000);
		assertTrue(t2.estaFueraDelBlanco());
	}		
	
	
	
	@Test(expected = Exception.class)
	public void queArrojeExcepcionAParticipanteDescalificado() throws ParticipanteDescalificadoException {
		 Torneo nacional = new Torneo("Nacional");
		 Participante p = new Participante (1, "Juan");
		 
		 nacional.agregarParticipante(p);
		 p.tirar(1, 1);
		 p.tirar(3, 0);
		 p.tirar(1, 5);
		 p.tirar(8, 10);
		 
		 p.obtenerPuntajeTotal();
	}
 	
	 @Test
	 public void queSeCalculeCorrectamenteElPuntajeDeUnParticipante() throws ParticipanteDescalificadoException{
		 Torneo nacional = new Torneo("Nacional");
		 Participante p = new Participante (1, "Juan");
		 
		 nacional.agregarParticipante(p);
		 p.tirar(1, 1);
		 p.tirar(3, 0);
		 p.tirar(1, 5);
		 p.tirar(8, 10);
		 p.tirar(10, 20);
		 
		 Integer puntajeEsperado=3700;
		 Integer puntajeObtenido = p.obtenerPuntajeTotal();
		 assertEquals(puntajeEsperado, puntajeObtenido);
	 }
	 
	 @Test
	 public void queSePuedaConocerAlGanador(){
		 Torneo nacional = new Torneo("Nacional");
		 Participante p1 = new Participante (1, "Juan");
		 Participante p2 = new Participante (2, "Maria");
		 Participante p3 = new Participante (3, "Silvina");
		 nacional.agregarParticipante(p1);
		 nacional.agregarParticipante(p2);
		 nacional.agregarParticipante(p3);
		 
		 p1.tirar(20, 20);		
		 p1.tirar(20, 20);		
		 p1.tirar(20, 20);		
		 p1.tirar(20, 20);		
		 p1.tirar(20, 20);		
		 
		 p2.tirar(20, 20);
		 p2.tirar(20, 20);
		 p2.tirar(20, 20);
		 p2.tirar(20, 20);
		 p2.tirar(20, 20);
		 
		 p3.tirar(1, 1);
		 p3.tirar(1, 1);
		 p3.tirar(1, 1);
		 p3.tirar(1, 1);
		 p3.tirar(1, 1);

		 String obtenido = nacional.conocerAlGanador().getNombre();
		 String esperado = "Silvina";
		 
		 assertEquals(esperado, obtenido);
	 }

}
