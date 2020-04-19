package ma.projet.classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

/**
 *
 * @author admin
 */
public  interface  IDao<T> {
     boolean create(T o);

    boolean delete(T o);

    boolean update(T o);

    List<T> findAll();

    T findById(int id);

    
}
