
public class Missoes {
	
	private String missao;
	private Gestor gestor;
	private Funcionario funcionario;
	private String status;
	private String categoria;
	private double pontuacao;
	
	public String getMissao() {
			return missao;
	}
	public void setMissao(String missao) {
		this.missao = missao;
	}
	public String getGestor() {
			return gestor;
	}
	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}
	public String getFuncionario() {
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
