package ex01;

public class AppTestEntrada {
	
	public static void main(String[] args){
		
		byte input1=Entrada.llegirByte("Entra un byte");
		System.out.println(input1);
		
		int input2=Entrada.llegirInt("Entra un Integer");
		System.out.println(input2);

		float input3=Entrada.llegirFloat("Entra un float");
		System.out.println(input3);

		double input4=Entrada.llegirDouble("Entra un double");
		System.out.println(input4);
		
		char  input5 =Entrada.llegirChar("Entra un char");
		System.out.println(input5);
		
		String  input6 =Entrada.llegirString("Entra un String");
		System.out.println(input6);
		
		boolean  input7 =Entrada.llegirSiNo("S/N-s/n");
		System.out.println(input7);
	}
}
