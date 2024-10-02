package Pagamento;



public class Principal {

	public static void main(String[] args) {
		
		Pagamento fun = new Pagamento (1, "Joaquim", "15-15551-1551", 0, "Embaixo da ponte");
		System.out.println(fun.getnome());
		System.out.println(fun.calcularSalario(10000.00, 1000));
		System.out.println("-----------------------------------------------");
		Horista hora = new Horista (0, "Tony", "Não Tem", 0, "esgoto");
		System.out.println(hora.calcularSalario(120, 8));
		System.out.println("-----------------------------------------------");
		Jornada jorna = new Jornada (0, "Paulo", "55628-9972", 0, "casa");
		System.out.println(jorna.getnome());
		System.out.println(jorna.calcularSalario(150, 6));
		System.out.println("-----------------------------------------------");
		ConsultarPJ cons = new ConsultarPJ (5, "Max", "98765-4321", 0, "SESI ITAPETININGA");
		System.out.println(cons.getnome());
		System.out.println(cons.calcularSalario(400, 100));
		
	}

}
