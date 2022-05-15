package comunicacion;

public class Tesis extends Escrito{
	String idea;
	static String [] argumentos = new String[2];
	String conclusion;
	String referencias;
	String interpretacion;

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = argumentos;
		this.conclusion = conclusion;
		this.interpretacion = interpretacion;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
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
		return(5*palabrasPagina*getPaginas());
	}
	
	public String toString() {
		String i = this.getOrigen() + "\n";
		i += this.getTitulo() + "\n";
		i += this.getAutor() + "\n";
		i += this.getPaginas() + "\n";
		i += this.idea + "\n";
		
		int j=0;
		for(String k:argumentos) {
			j+=1;
		}
		i += j + "\n";
		i += this.conclusion + "\n";
		i += this.referencias;
	 ;
		return i;
	}

}
