/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.org.centro8.curso.java.web.repositories.list;

/**
 *
 * @author lilia
 */
public class ArticuloRepositoryFactory {
    private static ArticuloRepository ar=new ArticuloRepository();
    private ArticuloRepositoryFactory() { }
    public static ArticuloRepository getArticuloRepository(){
        return ar;
    }
}
