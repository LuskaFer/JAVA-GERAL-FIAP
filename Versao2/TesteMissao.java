public class TesteMissao {

	public static void main(String[] args) {
		Gestor gestor = new Gestor("Maria", 01234, 'F', "3991-0000", "maria@empresa.com.br", "Tecnologia");
		Funcionario funcionario = new Funcionario("Jo�o", 02345, 'M', "3901-0001", "joao@empresa.com.br", "Tecnologia");
		Missao missao = new Missao("Primeira miss�o", "Atualiza��o da base de dados", gestor, funcionario, "Iniciada", "Tecnologia", 200);
		Documento documento = new Documento();
		
		System.out.println("----- Dados do gestor -----");
		System.out.println("Nome: " + missao.getGestor().getNome());
		System.out.println("Matr�cula: " + missao.getGestor().getMatricula());
		System.out.println("G�nero: " + missao.getGestor().getGenero());
		System.out.println("Telefone: " + missao.getGestor().getTelefone());
		System.out.println("E-mail: " + missao.getGestor().getEmail());
		System.out.println("Departamento: " + missao.getGestor().getDepto());
		System.out.println();
		System.out.println("----- Dados do funcion�rio -----");
		System.out.println("Nome: " + missao.getFuncionario().getNome());
		System.out.println("Matr�cula: " + missao.getFuncionario().getMatricula());
		System.out.println("G�nero: " + missao.getFuncionario().getGenero());
		System.out.println("Telefone: " + missao.getFuncionario().getTelefone());
		System.out.println("E-mail: " + missao.getFuncionario().getEmail());
		System.out.println("Departamento: " + missao.getFuncionario().getDepto());
		System.out.println();
		System.out.println("----- Dados da miss�o -----");
		System.out.println("Nome: " + missao.getNome());
		System.out.println("Descri��o: " + missao.getDescricao());
		System.out.println("Gestor: " + missao.getGestor().getNome());
		System.out.println("Funcion�rio: " + missao.getFuncionario().getNome());
		System.out.println("Status: " + missao.getStatus());
		System.out.println("Categoria: " + missao.getCategoria());
		System.out.println("Pontua��o: " + missao.getPontuacao());
		System.out.println();
		System.out.println("----- Adi��o de documentos -----");		
		documento.adicionarDocumento(gestor, funcionario, "RG");
		documento.editarDocumento(gestor, funcionario, "RG");
		documento.excluirDocumento(gestor, funcionario, "RG");
	}
}
