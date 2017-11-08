/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Tabla {
    private String name; 
    private ArrayList <Column> columnas; 
    private ArrayList<key> keys; 
    private ArrayList<ForgeinKey> foreignKeys;

    public Tabla(String name) {
        this.name = name;
        this.columnas = new ArrayList<>();
        this.keys = new ArrayList<>();
        this.foreignKeys = new ArrayList<>();
    }
    
    public void addColumn(String name, String dataType){
        Column column= new Column(name, dataType);
        this.columnas.add(column); 
        
    }
    
    public void addKey(String name, String dataType){
        key column= new key(name, dataType);
        this.keys.add(column); 
    }
    
    public void addForeignkey(String name, String dataType, Tabla tabla){
        ForgeinKey foreignKey= new ForgeinKey(name,dataType);
        foreignKey.setTabla(tabla);
        this.foreignKeys.add(foreignKey); 
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Column> getColumnas() {
        return columnas;
    }

    
    
    
    
}
