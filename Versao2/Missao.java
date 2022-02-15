
public class Missao {

	private String nome;
	private String descricao;
	private Gestor gestor;
	private Funcionario funcionario;
	private String status;
	private String categoria;
	private double pontuacao;

	public Missao(String nome, String descricao, Gestor gestor, Funcionario funcionario, String status, String categoria, double pontuacao) {
		this.nome = nome;
		this.descricao = descricao;
		this.gestor = gestor;
		this.funcionario = funcionario;
		this.status = status;
		this.categoria = categoria;
		this.pontuacao = pontuacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}
}
