package comunicacion;

public class Periodico extends Escrito {
	
	String fecha;
	String primicia;
	String interpretacion;

	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;		
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
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
		return(10*palabrasPagina*getPaginas());
	}
	
	public String toString() {
		String i = this.getOrigen() + "\n";
					i += this.getTitulo() + "\n";
					i += this.getAutor() + "\n";
					i += this.getPaginas() + "\n";
		i += this.fecha + "\n";
		i += this.primicia ;
		return i;
	}
	

}
