package Hospital;

public class Principal {
	public static void main(String[] args) {


		Medico med = new Medico ("Adauto", "Médico", 150, "1234" );
		System.out.println(med.getnome());
		System.out.println(med.getEspecialidade());
		System.out.println(med.getvalorConsulta());
		med.agendarConsulta();
		System.out.println(med.getcrm());
		
		System.out.println("=========================================");

		Dentista den = new Dentista ("Adriano", "Dentista", 150, "4321" );
		System.out.println(den.getnome());
		System.out.println(den.getEspecialidade());
		System.out.println(den.getvalorConsulta());
		den.agendarConsulta();
		System.out.println(den.getcro());
		System.out.println("=========================================");
		
		Fisioterapeuta fisio= new Fisioterapeuta ("Alberto", "Fisioterapeuta", 250, "0000" );
		System.out.println(fisio.getnome());
		System.out.println(fisio.getEspecialidade());
		System.out.println(fisio.getvalorConsulta());
		System.out.println("=========================================");
		fisio.agendarConsulta();
		System.out.println(fisio.getcrefito());

	}
}