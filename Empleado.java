package Plantilla_por_turnos_fase_0;

public class Empleado {
	//Atributos
		private String nombre;
		private String apellido;
		private String dni;
		private int horas_trabajadas=0;
		private static int horas_mensuales=140;
		private boolean noche;
		private int N_noches=0;
		private int N_dias=0;
		private Turno turno; //TURNO CONTRATO
		
		
		Empleado(String nombre,String apellido,String dni,boolean noche,Turno turno){
			this.nombre=nombre;
			this.apellido=apellido;
			this.dni=dni;
			this.noche=noche;
			this.turno=turno;
		}

	/**************************************************************************************************************/
		
		//Getters
		public String getNombre() {
			return nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public String getDni() {
			return dni;
		}

		public int getHoras_trabajadas() {
			return horas_trabajadas;
		}

		public static int getHoras_mensuales() {
			return horas_mensuales;
		}

		public boolean getNoche() {
			return noche;
		}

		public int getN_noches() {
			return N_noches;
		}
		
		public int getN_dias() {
			return N_dias;
		}

		public Turno getTurno() {
			return turno;
		}

	/**************************************************************************************************************/	
		//SETTERS
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
		public void setDni(String dni) {
			this.dni = dni;
		}
		
		public void setHoras_trabajadas(int horas_trabajadas) {
			this.horas_trabajadas = horas_trabajadas;
		}

		public static void setHoras_mensuales(int horas_mensuales) {
			Empleado.horas_mensuales = horas_mensuales;
		}
		
		public void setNoche(boolean noche) {
			this.noche = noche;
		}
		
		
		public void setN_noches(int n_noches) {
			N_noches = n_noches;
		}
		
		public void setTurno(Turno turno) {
			this.turno = turno;
		}
		
		public void setN_dias(int n_dias) {
			N_dias = n_dias;
		}
		
	/**************************************************************************************************************/
	//Metodos
		
		public void sumarHoras(Turno turno) {
			if(turno==Turno.M || turno==Turno.T) {
				this.N_dias--;
			}
			else {
				this.N_noches--;
			}
			
			horas_trabajadas+=turno.getHoras();
		}
}
