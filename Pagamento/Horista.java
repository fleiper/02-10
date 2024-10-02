package Pagamento;

public class Horista extends Pagamento {

	Horista(int id, String nome, String telefone, int matricula, String endereço) {
		super(id, nome, telefone, matricula, endereço);
	}
	@Override
		public double calcularSalario (double hora, double valorH) {
			return hora*valorH;
	}
		
		
}