/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication83;

import java.util.Scanner;

/**
 *
 * @author Maria Fernanda
 */
public class JavaApplication83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner (System.in);
        System.out.println("1)Adicionar artistas");
         System.out.println("2)Adicionar álbumes a los artistas");
         int opcion=lectura.nextInt();
        
         
         
         switch(opcion){
             case 1:
                   IBaseDatos modelo= new ArtistaDAO();
		ArtistaVista vista = new ArtistaVista();
		ArtistaControlador controlador = new ArtistaControlador(modelo,vista);
		vista.menu();
                 break;
             case 2:
                  IBaseDatos modelo2= new AlbumDAO();
		AlbumVista vista2 = new AlbumVista();
		AlbumControlador controlador2 = new AlbumControlador(modelo2,vista2);
		vista2.menu();
                 break;
           
             
         }
         
      
    }
    
}
