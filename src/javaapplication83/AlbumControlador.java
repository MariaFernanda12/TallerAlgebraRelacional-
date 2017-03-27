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
class AlbumControlador {
       private IBaseDatos model;
	 private AlbumVista view;
	 
	public AlbumControlador(IBaseDatos model, AlbumVista view) {
		super();
		this.model = model;
		this.view = view;
		this.view.setDepartamentoControlador(this);
	}
	
	public void insert(){
		this.view.insert();
	}
	public void save(Album departamento){
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
		List<Album> departamentos = this.model.findAll();
		this.view.list(departamentos);
		
	}
	 
}
