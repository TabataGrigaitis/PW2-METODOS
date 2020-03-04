
public class Exemplos {
	// [ctrl]+[espaço]       completa
	// [crtl]+[shift]+[F]    identa
	// [crtl]+[f11]          executa
	public static void main(String[] args) {

		//int idade = 30;
		//ehMaiorIdade(19);
		//ehMaiorIdade(12);
		//ehMaiorIdade(idade);
		classificar(-90);

	}
	//public = todos acessam  
	//static = ?
	//void = não retorna
	public static void ehMaiorIdade(int idade) {
		if (idade >= 18) {
			// syso = system.out.printIn
			System.out.println("maior de idade");
		} else {
			System.out.println("menor de idade");
		}
	}
	public static void classificar(int num) {
		//negativo,positivo,zero
		if(num>0) {
			System.out.println("positivo");
		}
		else {
			if (num<0) {
				System.out.println("negativo");
			} else {
				System.out.println("zero");
			}
		}
		
	}
	
	
	
	
}
