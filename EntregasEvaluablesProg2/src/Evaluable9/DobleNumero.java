package Evaluable9;

public class DobleNumero {

	private int numero; // CREAMOS EL ATRIBUTO NUMERO
	
	public DobleNumero(int numero) { //CREAMOS LA CLASE DOBLE NUMERO 
		
		this.numero=numero; //IGUALAMOS CON THIS
		
	}

	public int getNumero() { //CREAMOS UN GETTER PARA QUE DEVUELVA
		return numero * 2; //MULTIPLICAMOS EL NUMERO POR 2
	}

	public int setNumero(int num) { //CREAMOS UN SETTER PARA MODIFICAR 
		return this.numero = num; //IGUALAMOS NUMERO INICIA A INT NUM
	}
	
}