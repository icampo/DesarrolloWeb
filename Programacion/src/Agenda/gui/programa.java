package Agenda.gui;

import Agenda.datos.amigos;

import java.util.Scanner;

public class programa {
	
		public static void main(String[] args) {
			
			// Declarar Variables
			
			amigos amigo;
			String nombre;
			
			// Declarar Consola
			
			Scanner sc=new Scanner(System.in);
			
			// Asignar Constructora
			
			System.out.print("Introduce el Nombre: ");
			nombre = sc.nextLine();
			
			// Crear objeto
			
			amigo = new amigos(nombre);
			
			// Asignar Metodos

			System.out.print("Introduce el Email: ");
			amigo.setEmail(sc.nextLine());
			
			System.out.print("Introduce el numero de Telefono: ");
			amigo.setTlfno(sc.nextLine());
			
			System.out.print("El contacto de "+amigo.getNombre()+" tiene un Email llamado "+amigo.getEmail()+" y su Telefono es "+amigo.getTlfno()+".");
		}
	
	}
