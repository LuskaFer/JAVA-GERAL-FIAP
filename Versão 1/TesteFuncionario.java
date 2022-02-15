
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Paulo");
		f1.setMatricula(1);
		f1.setDataNascimento("01/01/1990");
		f1.setGenero('f');	
		f1.setTelefone("1122003344");
		f1.setEmail("teste.teste@teste.com.br");
		f1.setDepto("Operações");
		f1.setStatus("Disponível");
		f1.setPontuacaoAcumulada(0);
		f1.setPontuacaoPendente(0);
		
		f1.getNome();
		f1.getMatricula();
		f1.getDataNascimento();
		f1.getGenero();
		f1.getTelefone();
		f1.getEmail();
		f1.getDepto();
		f1.getStatus();
		f1.getPontuacaoAcumulada();
		f1.getPontuacaoPendente();
		
	}

}
