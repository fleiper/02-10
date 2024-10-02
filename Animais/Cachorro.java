package Animais;

public class Cachorro extends Animal{
	public Cachorro (String nome, String sexo, String raça) {
		super(nome,sexo, raça);
	}
	public void emitirsom() {
		System.out.println("O cachorro está latindo");
	}
}


