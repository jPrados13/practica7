import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/**
 * Jugar Street Fighter II
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pj1=0;
		int pj2=0;
		Scanner sn = new Scanner(System.in);
		System.out.println("FORKEADO PAPITO");
		ArrayList<Personaje> personajes = new ArrayList<Personaje>();
		Main.inicializarPersonajes(personajes);
		
		//Elegir el primer Personaje
		 
		System.out.println("Elija el primer personaje:");
		for (int i = 0; i < personajes.size(); i++) {
			System.out.println(i+1+".- " + personajes.get(i).getNombre());
		}
		do {
			System.out.println("Pulse un numero correspondiente al personaje:");
			pj1=sn.nextInt();
		}while(pj1>8 || pj1<1);
		
		Personaje personaje1=personajes.get(pj1-1);
		personajes.remove(pj1-1);
		
		//Elegir el segundo Personaje
		 
		System.out.println("Elija el segundo personaje");
		for (int i = 0; i < personajes.size(); i++) {
			System.out.println(i+1+".- " + personajes.get(i).getNombre());
		}
		do {
			System.out.println("Pulse un numero correspondiente al personaje:");
			pj2=sn.nextInt();
		}while(pj2>7 || pj2<1);
		
		Personaje personaje2=personajes.get(pj2-1);
		
		//Batalla
		
		Main.simularCombate(personaje1, personaje2);
	}
	/**
	 * Inicializa los personajes metiendolos en el array pasado por parametro
	 * @param personajes, el array introducido el cual se rellenará
	 */
	public static void inicializarPersonajes(ArrayList<Personaje> personajes){
		
		personajes.add(new Personaje("Ryu", "Japon", "El karateka japonés que trata de perfeccionar toda sus habilidades y que, al mismo tiempo, no le importa nada. Cuando tiene que celebrar su victoria, simplemente se aleja caminando alejándose rumbo al horizonte, sin mirar atrás.", 
				1.8, 92, "negro", "blanco", "Tokyo", 7, 9));
		personajes.add(new Personaje("Chun-Li", "China", " artista marcial china con técnicas veloces y llamativas, pero por otro lado también trabajaba para la Interpol para intentar vengar la muerte de su padre.",
				1.65, 64, "negro", "azul", "Pekin", 10, 5));
		personajes.add(new Personaje("Ken", "USA", "Luchador norteamericano Rival de Ryu.", 1.9,100,"Rubio","Rojo","Playa",7,8));
		personajes.add(new Personaje("Blanka", "Brasil", "Mutante procedente de la amazonia brasileña", 2,120,"Naranja","Naranja","Amazonas",5,10));
		personajes.add(new Personaje("Guile", "USA", "Militar de las fuerzas aereas", 1.8,75,"Rubio","Verde","Portaaviones",7,8));
		personajes.add(new Personaje("E.Honda", "Japon", "Luchadorde sumo japones.", 2,156,"negro","Azul","Ring de sumo",3,10));
		personajes.add(new Personaje("Zangief", "URSS", "Luchador sovietico", 2.10,120,"Marron","Rojo","Nieve",4,9));
		personajes.add(new Personaje("Dhalsim", "India", "Luchador de yoga.", 1.7,70,"calvo","Amarillo","Rio Ganghes",5,7));
		
	}
	/**
	 * simula la batalla entre dos personajes
	 * @param personaje1, que será el luchador local.
	 * @param personaje2, que será el luchador visitante.
	 * @return un personaje ganador.
	 */
	public static void simularCombate (Personaje personaje1, Personaje personaje2) {
		/*
		 * Muestra quienes y donde combaten
		 */
		System.out.println(personaje1.getNombre() + " vs " + personaje2.getNombre());
		System.out.println(personaje1.getPais() + ", "+ personaje1.getEscenario());;
		Personaje rapido = new Personaje();
		Personaje lento = new Personaje();
		
		 // Se declara quien es el personaje que ataca primero segun su velocidad
		
		if(personaje1.getVelocidad()>=personaje2.getVelocidad()) {
			rapido = personaje1;
			lento = personaje2;
		}else {
			rapido = personaje2;
			lento = personaje1;
		}
		
		 // Combate
		 
		do {
			System.out.println(lento.getNombre()+ " pierde por: ");
			lento.setVida(lento.getVida()-rapido.ataque((int)((Math.random()*9+1))));
			System.out.println(lento.getVida());
			System.out.println();
			if(lento.getVida()>0) {
				System.out.println(rapido.getNombre()+ " pierde por:");
				rapido.setVida(rapido.getVida()-lento.ataque((int)((Math.random()*9+1))));
				System.out.println(rapido.getVida());
				System.out.println();
			}
		}while(rapido.getVida()>0 && lento.getVida()>0);
		Personaje ganador = new Personaje();
		if(rapido.getVida()>0) {
			ganador=rapido;
		}else {
			ganador=lento;
		}
		if(lento.getVida()==100||rapido.getVida()==100) {
			System.out.println("PERFECT!!");
		}
		System.out.println("Ganador: " + ganador.getNombre());
	}
	
}
