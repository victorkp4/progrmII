package Semana1;

import java.util.Scanner;

public class class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user;
		String pass;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Por favor ingrese el usuario");
		user = input.next();
		System.out.println("Por favor ingrese la contraseņa");
		pass = input.next();
		
		String usuario = "enzo";
		String contraseņa = "4321";
		
		if(user.equals(usuario)) {
			if(pass.equals(contraseņa)) {
				System.out.println("***Bienvenido al sistema***");
			}else {
				System.out.println("La contraseņa ingresada no es Valida");
			}
		}else {
			System.out.println("El usuario ingresado no es Valido");
		}
	}

}
