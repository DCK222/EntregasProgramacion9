package Evaluable9;

public class CuentaCorriente {

	private String Saldo; //DECLARAMOS EL ATRIBUTO

	public CuentaCorriente() { //CREAMOS LA CLASE CUENTA CORRIENTE

		this.Saldo = "0"; //IGUALAMOS EL SALDO A 0

	}

	public void impo(int valor) { //CREAMOS UNA CLASE DE TIPO VOID 
		this.Saldo = Integer.toString(Integer.parseInt(this.Saldo) + valor);
	}

	public void reint(int valor) { //CREAMOS UN CLASE DE TIPO VOID 
		this.Saldo = Integer.toString(Integer.parseInt(this.Saldo) - valor);
	}

	public String getSaldo() { //CREAMOS UN GET PARA QUE DEVUELVA VALORES
		return this.Saldo;
	}

}