package Pagamento;

public class ConsultarPJ extends Pagamento {

	ConsultarPJ(int id, String nome, String telefone, int matricula, String endereço) {
		super(id, nome, telefone, matricula, endereço);
	}
	
	@Override
	public double calcularSalario(double valortotal, double impostos) {
		return valortotal-impostos; 
	}
	

}
