
public class Funcionario {
	
	String nome;
	int matricula;

	/*dados pessoais*/

	private String dataNascimento;
	private char genero;
	private String telefone;
	private String email;
	private String depto;
	private int pontuacaoAcumulada;
	private String status;
	private int pontuacaoPendente;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public int getPontuacaoAcumulada() {
		return pontuacaoAcumulada;
	}
	public void setPontuacaoAcumulada(int pontuacaoAcumulada) {
		this.pontuacaoAcumulada = pontuacaoAcumulada;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPontuacaoPendente() {
		return pontuacaoPendente;
	}
	public void setPontuacaoPendente(int pontuacaoPendente) {
		this.pontuacaoPendente = pontuacaoPendente;
	}
	
	
}
