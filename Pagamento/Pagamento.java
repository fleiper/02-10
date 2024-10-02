package Pagamento;

public class Pagamento {
	private int id;
	private String nome;
	private String telefone;
	private int matricula;
	private String endereço;

	Pagamento (int id, String nome,String telefone,int matricula,String endereço){
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.endereço = endereço;
	}
	public void Pagamento1(int id2, String nome2, String telefone2, int matricula2, String endereço2) {
		
	}
	public int getid() {
		return id;
	}
	public void setid (int id) {
		this.id = id;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String gettelefone() {
		return telefone;
	}
	public void settelefone (String telefone) {
		this.telefone = telefone;
	}
	public int getmatricula() {
		return matricula;
	}
	public void setano (int matricula) {
		this.matricula = matricula;
	}
	public String getendereço() {
		return endereço;
	}
	public void setendereço (String endereço) {
		this.endereço = endereço;
	}
	public double calcularSalario(double salarioB, double desconto){
		return salarioB - desconto;

	}
}