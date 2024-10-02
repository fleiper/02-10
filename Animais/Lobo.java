package Animais;

public class Lobo extends Animal{
	public Lobo(String nome, String sexo, String raça) {
		super(nome,sexo, raça);
	}
	public void emitirsom() {
		System.out.println("O lobo está uivando");
	}
}
