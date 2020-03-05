
public class ExemplosComRetorno {
	// qualquer coisa diferente de void utilizar return
	public static String concatenar(String nome, String sobrenome) {
		return nome + " " + sobrenome;
	}

	public static int tamanhoNomeCompleto(String nome, String sobrenome) {
		String nomeCompleto = concatenar(nome, sobrenome);
		return nomeCompleto.length();
	}
	public static void main(String[] args) {
		String nome = concatenar("Tabata","Grigaitis");
		int tamanho = tamanhoNomeCompleto("Tabata","Grigaitis");
		System.out.println("nome: "+ nome);
		System.out.println("Qtde: "+tamanho+" caracteres");
	}

}
