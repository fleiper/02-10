package Hospital;

public class ProfissonalSaude {
	private String nome;
	private String Especialidade;
	private int valorConsulta;

	public ProfissonalSaude (String nome,String Especialidade,int valorConsulta) {
		this.nome = nome;
		this.Especialidade = Especialidade;
		this.valorConsulta = valorConsulta;
	}
	public String getnome() {
		return nome;
	}
	public void setnome() {
		this.nome = nome;
	}
	public String getEspecialidade () {
		return Especialidade;
	}
	public void setEspecialidade () {
		this.Especialidade = Especialidade;
	}
	public int getvalorConsulta () {
		return valorConsulta;
	}
	public void setvalorConsulta() {
		this.valorConsulta = valorConsulta;
	}
	public void agendarConsulta () {
	}
}
