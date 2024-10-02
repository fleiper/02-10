package Animais;

public class Gato extends Animal{
	public Gato (String nome, String sexo, String raça) {
		super(nome,sexo, raça);
	}
	public void emitirsom() {
		System.out.println("O gato está miando");
	}
}

