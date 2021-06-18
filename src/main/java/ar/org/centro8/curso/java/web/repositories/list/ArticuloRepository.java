/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.centro8.curso.java.web.repositories.list;

import ar.org.centro8.curso.java.web.entities.Articulo;
import ar.org.centro8.curso.java.web.repositories.interfaces.I_ArticuloRepository;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lilia
 */
public class ArticuloRepository implements I_ArticuloRepository{

    private List<Articulo>list=new ArrayList();

   
    
    @Override
    public void save(Articulo articulo) {
        list.add(articulo);
    }

    @Override
    public void remove(Articulo articulo) {
        list.remove(articulo);
    }

    @Override
    public void update(Articulo articulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Articulo> getAll() {
        return list;
    }

}
