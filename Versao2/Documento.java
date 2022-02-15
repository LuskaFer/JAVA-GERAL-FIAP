public class Documento {
	private String documento;
	private Gestor gestor;
	private Funcionario funcionario;

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
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
	
	public void adicionarDocumento(Gestor gestor, Funcionario funcionario, String documento) {
		System.out.println("Documento adicionado com sucesso!");
	}
	
	public void editarDocumento(Gestor gestor, Funcionario funcionario, String documento) {
		System.out.println("Documento editado com sucesso!");
	}
	
	public void excluirDocumento(Gestor gestor, Funcionario funcionario, String documento) {
		System.out.println("Documento excluído com sucesso!");
	}
}
