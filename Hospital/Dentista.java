package Hospital;

public class Dentista extends ProfissonalSaude {
	private String cro;
	public Dentista (String nome, String Especialidade, int valorConsulta,String cro) {
		super(nome,Especialidade, valorConsulta);
		this.cro = cro;
	}
		public String getcro() {
			return cro;
		}
		public void setcro() {
			this.cro = cro;
	}
	
	@Override
	public void agendarConsulta() {
		System.out.println("08/01/2025");
	}



}
