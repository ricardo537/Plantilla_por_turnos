package Plantilla_por_turnos_fase_0;

public enum Turno {

	M(7),T(7),N(10);
	
	int horas;
		
	Turno(int horas){
		this.horas=horas;
	}

	//GETTERS
	public int getHoras() {
		return horas;
	}
	
	
	//SETTERS
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
}
