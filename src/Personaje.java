import java.util.ArrayList;

public class Personaje {
	/**
	 * Datos Biográficos del personaje
	 */
	private String nombre;
	private String pais;
	private String historia;
	/**
	 * Aspecto Físico
	 */
	private double altura;
	private double peso;
	private String colorPelo;
	private String vestimenta;
	private String escenario;
	/**
	 * Datos de Lucha
	 */
	private double vida;
	private int velocidad;
	private int fuerza;
	private int patadaLenta;
	private int patadaRapida;
	private int punoLento;
	private int punoRapido;
	private int agarreLento;
	private int agarreRapido;
	private int especial1;
	private int especial2;
	private int especial3;
	/**
	 * Constructor vacio
	 */
	public Personaje() {
		super();
	}
	/**
	 * Constructor del personaje
	 * @param nombre
	 * @param pais
	 * @param historia
	 * @param altura
	 * @param peso
	 * @param colorPelo
	 * @param vestimenta
	 * @param escenario
	 * @param vida
	 * @param velocidad
	 * @param fuerza
	 */
	public Personaje(String nombre, String pais, String historia, double altura, double peso, String colorPelo,
			String vestimenta, String escenario, int velocidad, int fuerza) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.historia = historia;
		this.altura = altura;
		this.peso = peso;
		this.colorPelo = colorPelo;
		this.vestimenta = vestimenta;
		this.escenario = escenario;
		this.vida = 100;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.patadaLenta = 1;
		this.patadaRapida = 2;
		this.punoLento = 3;
		this.punoRapido = 4;
		this.agarreLento = 5;
		this.agarreRapido = 6;
		this.especial1 = 7;
		this.especial2 = 8;
		this.especial3 = 9;
	}
	//Getters
	public String getNombre() {
		return nombre;
	}
	public String getPais() {
		return pais;
	}
	public String getHistoria() {
		return historia;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	public String getColorPelo() {
		return colorPelo;
	}
	public String getVestimenta() {
		return vestimenta;
	}
	public String getEscenario() {
		return escenario;
	}
	public double getVida() {
		return vida;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public int getFuerza() {
		return fuerza;
	}
	public int getPatadaLenta() {
		return patadaLenta;
	}
	public int getPatadaRapida() {
		return patadaRapida;
	}
	public int getPunoLento() {
		return punoLento;
	}
	public int getPunoRapido() {
		return punoRapido;
	}
	public int getAgarreLento() {
		return agarreLento;
	}
	public int getAgarreRapido() {
		return agarreRapido;
	}
	public int getEspecial1() {
		return especial1;
	}
	public int getEspecial2() {
		return especial2;
	}
	public int getEspecial3() {
		return especial3;
	}
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	public void setVestimenta(String vestimenta) {
		this.vestimenta = vestimenta;
	}
	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	public void setVida(double vida) {
		this.vida = vida;
	}
	/**
	 * Recibe un numero correspondiente al tipo de ataque, 1 puño rapido, 2 puño lento...
	 * @param ataque sera el tipo de ataque
	 * @return el daño total inflingido.
	 */
	public double ataque (int ataque) {
		double damage = fuerza;
		double damageAttack =0;
		switch (ataque) {
		case 1:
			// Patada Lenta
			 
			damageAttack = damage * 1;
			System.out.println("Patada lenta: " + "-"+ damageAttack + " de vida");
		break;
		case 2:
			//patada rápida
			 
			damageAttack = damage * 0.5;
			System.out.println("Patada rapida: " + "-"+ damageAttack + " de vida");
		break;
		case 3:
			// Puño Lento
			
			damageAttack = damage * 0.7;
			System.out.println("puño lento: " + "-"+ damageAttack + " de vida");
		break;
		case 4:
			// Puño rápido
			 
			damageAttack = damage * 0.3;
			System.out.println("Puño rapido: " + "-"+ damageAttack + " de vida");
		break;
		case 5:
			
			//Agarre Lento
			 
			damageAttack = damage * 5;
			System.out.println("Agarre lento: " + "-"+ damageAttack + " de vida");
		break;
		case 6:
			
			 //Agarre Rápido
			
			damageAttack = damage * 3;
			System.out.println("Agarre rapido: " + "-"+ damageAttack + " de vida");
		break;
		case 7:
			
			// Especial 1
			
			damageAttack = damage * 1.5;
			System.out.println("Especial 1: " + "-"+ damageAttack + " de vida");
		break;
		case 8:
			
			//Especial 2
			
			damageAttack = damage * 2;
			System.out.println("Especial 2: " + "-"+ damageAttack + " de vida");
		break;
		case 9:
			
			//Especial 3
			 
			damageAttack = damage * 3;
			System.out.println("Especial 3: " + "-"+ damageAttack + " de vida");
		break;
		default: damageAttack = 0;
		}
		return damageAttack;
	}


}
