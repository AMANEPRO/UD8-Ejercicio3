package ejercicio3;

public class objetosejercicio3 {
	
	protected double precioBase;
	
	protected String color;
	
	protected char consumoElectrico;
	
	protected int peso;
		
	final private double cPrecioBase = 100;
	
	final private String cColor = "Blanco";
	
	final private char cConsumoElectrico = 'F';
	
	final private int cPeso = 5;
	
	public objetosejercicio3() {
	
		this.precioBase = cPrecioBase;
		
		this.color = cColor;
		
		this.consumoElectrico = cConsumoElectrico;
		
		this.peso = cPeso;
	}
	
		
	public objetosejercicio3(double precioBase, int peso) {
		
		this.precioBase = precioBase;
		
		this.peso = peso;
		
		this.color = cColor;
		
		this.consumoElectrico = cConsumoElectrico;
	
	}
	
	
	public objetosejercicio3(double precioBase, String color, char consumoElectrico, int peso) {
	
		this.precioBase = precioBase;
		
		this.color = comprobarColor(color);
		
		this.consumoElectrico = comprobarLetra(consumoElectrico);
		
		this.peso = peso;
	
	}
		
	public static String comprobarColor(String color) {
		
		color = color.toLowerCase();
		
		String colorFinal;
		
		switch (color) {
			
		case "blanco":
				
			colorFinal = "Blanco";
			
			break;
		
		case "negro":
			
			colorFinal = "Negro";
			
			break;
			
		case "rojo":
		
			colorFinal = "Rojo";
			
			break;
			
		case "azul":
		
			colorFinal = "Azul";
			
			break;
			
		case "gris":
		
			colorFinal = "Gris";
			
			break;
	
			
			default:
			
				colorFinal = "Blanco";
				
				break;
		
		}
		
		return colorFinal;
		
	}
	
		public static char comprobarLetra(char consumoElectrico) {
		
		char letra;
		
		switch (consumoElectrico) {
		
		case 'A':
		
			letra = 'A';
			
			break;
			
		case 'B':
		
			letra = 'B';
			
			break;
			
		
		case 'C':
		
			letra = 'C';
			
			break;
			
		case 'D':
				letra = 'D';
		
				break;
			case
			'E':
			
				letra ='E';
				
				break;
			
			case
			
			'F':
				
				letra = 'F';
				
				break;
	
			default:
				
				letra = 'F';
				
				break;
		}
		
		return letra;
		
	}
	
	public double getPrecioBase() {
	
		return precioBase;
	
	}

	public void setPrecioBase(double precioBase) {
	
		this.precioBase = precioBase;

	}
	

	public String getColor() {
	
		return color;
	
	}

	public void setColor(String color) {
	
		this.color = color;

	}

	public char getConsumoElectrico() {
	
		return consumoElectrico;
	
	}

	public void setConsumoElectrico(char consumoElectrico) {
	
		this.consumoElectrico = consumoElectrico;

	}
	

	public int getPeso() {
	
		return peso;
	
	}

	public void setPeso(int peso) {
	
		this.peso = peso;
	
	}

}
