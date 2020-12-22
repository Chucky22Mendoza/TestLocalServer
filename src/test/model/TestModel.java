/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

/**
 *
 * @author login
 */
public class TestModel {
    private int id;
    private String descripcion;
    private int valor;

    public TestModel() {
    }

    public TestModel(int id, String descripcion, int valor) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
