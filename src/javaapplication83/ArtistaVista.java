/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication83;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Maria Fernanda
 */
class ArtistaVista {
    private ArtistaControlador controlador=null;

	public void menu(){
		Scanner lectura = new Scanner (System.in);
		int opcionMenu=0;
		boolean opcionFin=false;
		do
		{
			System.out.println("1. Artista");
			System.out.println("1. Crear. 2. Actualizar . 3. Borrado. 4. Listar");
			opcionMenu= lectura.nextInt();
			if(opcionMenu==1)
				this.controlador.insert();
			else if(opcionMenu == 2)
				this.controlador.update();
			else if(opcionMenu == 3)
				this.controlador.delete();
			else if(opcionMenu == 4)
				this.controlador.list();
			
			System.out.println("Desea continuar. 1. Si. 2.No");
			opcionMenu= lectura.nextInt();
			if(opcionMenu!=1)
				opcionFin=true;
		}while(opcionFin!=true);
		
	}
	
	public void insert(){
		String nombre= null;
		Scanner lectura = new Scanner (System.in);
		System.out.println("Creacion de Artista");
		System.out.println("Ingrese el Nombre del Artista:");
		nombre= lectura.next();
		Artista departamento = new Artista();
		departamento.setArtist_name(nombre);
		this.controlador.save(departamento);
	}
	
	
	public void delete(){
		 System.out.println("Borrar Artista");
		 System.out.println("Ingrese el identificador del Artista:");
      
	}
	
	public void update(){
		 System.out.println("Actualizar Artista");

	}
	
	public void list(List<Artista> departamentos){
		 for(Artista departamento : departamentos){
			 System.out.println(departamento.getArtist_id()+ "\t" + departamento.getArtist_name());
		 }
	}
	
	public void showMessage(String message){
		System.out.println(message);
	}
	
	public void setDepartamentoControlador(ArtistaControlador controlador) {
		this.controlador = controlador;
	}
}
