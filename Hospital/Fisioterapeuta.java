package Hospital;

public class Fisioterapeuta extends ProfissonalSaude {
	private String crefito;
	public Fisioterapeuta (String nome, String Especialidade, int valorConsulta,String crefito) {
		super(nome,Especialidade, valorConsulta);
		this.crefito = crefito;
	}
		public String getcrefito() {
			return crefito;
		}
		public void setcrefito(){
			this.crefito = crefito;
	}
		
	@Override
	public void agendarConsulta() {
		System.out.println("05/10/2024");
	}
}
