package Pagamento;

public class Jornada extends Pagamento {

	Jornada(int id, String nome, String telefone, int matricula, String endereço) {
			super(id, nome, telefone, matricula, endereço);
		}
	@Override
			public double calcularSalario (double salario, double hora) {
				return salario*hora;
		}
	
	}

