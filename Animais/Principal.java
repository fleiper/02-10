package Animais;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo ("Tony", "Masc", "das neves");
		lobo.emitirsom();
		
		Tigre tigre = new Tigre ("Tony", "Masc", "Dente-de-Sabre");
		tigre.emitirsom();
		
		Leão leão = new Leão ("Mufasa", "Masc", "Rei-da-Floresta");
		leão.emitirsom();
		
		Gato gato = new Gato ("deus", "Masc", "egipcio");
		gato.emitirsom();
		
		Cachorro Cachorro = new Cachorro ("Fred", "Luke", "Poodle");
		Cachorro.emitirsom();
	}

}
