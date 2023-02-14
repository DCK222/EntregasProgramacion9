package Evaluable9;

public class PrincipalCuentaCorriente {

	public static void main(String[] args) {

		CuentaCorriente cc = new CuentaCorriente(); //PROCEDIMIENTO ACTIVIDAD 
		cc.impo(200);
		cc.reint(300);
		System.out.println(cc.getSaldo());

	}

}