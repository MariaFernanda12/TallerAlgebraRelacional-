/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication83;

import java.util.List;

/**
 *
 * @author Maria Fernanda
 */
public class ArtistaControlador {
     private IBaseDatos model;
	 private ArtistaVista view;
	 
	public ArtistaControlador(IBaseDatos model, ArtistaVista view) {
		super();
		this.model = model;
		this.view = view;
		this.view.setDepartamentoControlador(this);
	}
	
	public void insert(){
		this.view.insert();
	}
	public void save(Artista departamento){
		this.model.insert(departamento);
		this.view.showMessage("Insercion realizada satisfactoriamente");
	}
	
	public void update(){
	 this.view.update();	
	}
	
	public void delete(){
		this.view.delete();
	}
	
	
	public void list(){
		List<Artista> departamentos = this.model.findAll();
		this.view.list(departamentos);
		
	}
	 
}
