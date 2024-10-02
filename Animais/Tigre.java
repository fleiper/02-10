package Animais;

public class Tigre extends Animal{
	public Tigre (String nome, String sexo, String raça) {
		super(nome,sexo, raça);
	}
	public void emitirsom() {
		System.out.println("O tigre está roncando");
	}
}


