/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication83;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maria Fernanda
 */
public class AlbumDAO implements IBaseDatos<Album> {

    public List<Album> findAll() {
		List<Album> departamentos= null;
	    String query = "SELECT * FROM Depto";
	    Connection connection = Conexion.getConnection();
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int id =0;
	    String nombre = null;
	
	    while (rs.next()){
	    	if(departamentos == null){
	    		departamentos= new ArrayList<Album>();
	    	}
	      
	        Album registro= new Album();
	        id = rs.getInt("id_Album");
	        registro.setAlbum_id(id);
	        
	        nombre = rs.getString("nom_Album");
	        registro.setAlbum_name(nombre) ;
	        
	        departamentos.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Departamentos");
			e.printStackTrace();
		}
	    
	    return departamentos;
	}

	
	



	

    @Override
    public boolean insert(Album t) {
        boolean result=false;
		Connection connection = Conexion.getConnection();
	    String query = " insert into Depto (nom_depto)"  + " values (?)";
        PreparedStatement preparedStmt=null;
	    try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString (1, t.getAlbum_name());
			result= preparedStmt.execute();
	    } catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
    }

    @Override
    public boolean update(Album t) {
        boolean result=false;
		Connection connection = Conexion.getConnection();
		String query = "update Depto set nom_depto = ? where id_depto = ?";
		PreparedStatement preparedStmt=null;
		try {
		    preparedStmt = connection.prepareStatement(query);
		    preparedStmt.setInt   (1, t.getArtist_id());
		    preparedStmt.setString(2, t.getAlbum_name());
		    if (preparedStmt.executeUpdate() > 0){
		    	result=true;
		    }
			    
		} catch (SQLException e) {
				e.printStackTrace();
		}
			
		return result;
    }

    @Override
    public boolean delete(Album t) {
         boolean result=false;
	   Connection connection = Conexion.getConnection();
	   String query = "delete from user where id = ?";
	   PreparedStatement preparedStmt=null;
	   try {
		     preparedStmt = connection.prepareStatement(query);
		     preparedStmt.setInt(1, 1);
		    result= preparedStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	   return result;
    }
  
    
}
