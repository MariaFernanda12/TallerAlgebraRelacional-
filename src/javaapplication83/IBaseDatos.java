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
public interface IBaseDatos <T> {
    	List<T> findAll();
    boolean insert(T t);
    boolean update(T t);
    boolean delete(T t);
}
