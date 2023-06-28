package unlam.parcial2.torneo;

public class Tiro {
	
	private Integer x;
	private Integer y;
	private Integer puntaje;
	
	public Tiro (Integer x, Integer y){
		this.x = x;
		this.y = y;
		this.puntaje = calcularPuntaje();
	}
	
	public Boolean estaFueraDelBlanco(){
		if (this.x<(-50) || this.x>50 || this.y < (-50) || this.y > 50){
			return true;
		}
		return false;
	}
	
	private Integer calcularPuntaje(){

		Double distancia =  Math.sqrt((this.x * this.x) + (this.y * this.y));
		if (distancia<=10){
			puntaje=1000;
		}
		if (distancia>10 && distancia<=20){
			puntaje=500;
		}
		if (distancia>20 && distancia<=30){
			puntaje=200;
		}
		if (distancia>30 && distancia<=40){
			puntaje=100;
		}
		if (distancia>40 && distancia<=50){
			puntaje=50;
		} 
		if (distancia>50) {
			puntaje=0;
		}
		return puntaje;
	}
	
	

	public Integer getPuntaje() {
		return puntaje;
	}
	

}
