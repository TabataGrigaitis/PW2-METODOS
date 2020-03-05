
public class Exercicio {
	//metodo somar() que retorna dois numeros inteiros(nao é void, é int)
	//metodo proximo() que retorna o proximo numero
	//metodo dobro() que retorna o dobro de um numero
	public static int somar(int numUm ,int numDois) {
		return numUm+numDois;
	}
	
	public static int proximo(int numUm) {
		return numUm+1;
	}
	
	public static int dobro(int numUm) {
		return numUm*2;
	}
	
	public static void main(String[] args) {
		int respSoma = somar (6,7);
		System.out.println("soma: "+ respSoma);
		
		int respProximo = proximo(respSoma);
		System.out.println("proximo: "+ respProximo);
		
		int respDobro = dobro(respProximo);
		System.out.println("Dobro: "+ respDobro);
	}

	

}
