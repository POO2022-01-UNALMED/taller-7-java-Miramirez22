package comunicacion;

public class Alfabeto extends Pictograma{
	static String[] letras = new String[2];
	String interpretacion;

	
	public Alfabeto(String origen, String [] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras=letras;
		this.interpretacion=interpretacion;
	}


	public static String[] getLetras() {
		return letras;
	}


	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
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

	
	public String toString() {
		String a = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
		return a;
	}
	
	public int cantidadLetras() {
		int i = 0;
		for(String j:letras) {
			i+=1;
		}
		
		return i;
	}

}
