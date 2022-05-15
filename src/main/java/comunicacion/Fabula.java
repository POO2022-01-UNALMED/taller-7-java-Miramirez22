package comunicacion;

public class Fabula extends Escrito {
	String ensenanza;
	String interpretacion;
	
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
		
	}


	public String getEnsenanza() {
		return ensenanza;
	}


	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}


	public String getInterpretacion() {
		return interpretacion;
	}


	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return(palabrasPagina*getPaginas());
	}
	
	public String toString() {
		String i = this.getOrigen() + "\n";
					i += this.getTitulo() + "\n";
					i += this.getAutor() + "\n";
					i += this.getPaginas() + "\n";
		i += this.ensenanza;
		return i;
	}
	

}
