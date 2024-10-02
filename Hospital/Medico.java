package Hospital;

public class Medico extends ProfissonalSaude {
	private String crm;
	
	public Medico (String nome, String Especialidade, int valorConsulta,String crm) {
		super(nome,Especialidade, valorConsulta);
		this.crm = crm;
	}
		public String getcrm() {
			return crm;
		}
		public void setcrm() {
			this.crm = crm;
	}
	
	@Override
	public void agendarConsulta() {
		System.out.println("25/09/2025");
	}
}


