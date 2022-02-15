
public class Gestor {
	private String nome;
	private String dataDeEntrada;
	private double salario;
	private String documento;
	private Missoes missao;

	public Gestor(String nome, String dataDeEntrada, double salario) {
		this.nome = nome;
		this.dataDeEntrada = dataDeEntrada;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}

	public double getSalario() {
		return salario;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Missoes getMissao() {
		return missao;
	}

	public void setMissao(Missoes missao) {
		this.missao = missao;
	}

}
