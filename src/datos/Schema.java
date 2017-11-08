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
public class Schema {
    private ArrayList<Tabla> tables; 

    public Schema(ArrayList<Tabla> tables) {
        this.tables = new ArrayList<>();
    }
    
    public void addTable (String name){
        Tabla table= new Tabla(name);
        this.tables.add(table); 
    }
    
    public Tabla getTable(String name){
        for(Tabla table: tables){
            if(table.getName().equals(name))
                return table; 
        }
        return null; 
    }
    
    public ArrayList<Column> ListColumns(){
        ArrayList<Column> columns= new ArrayList<>(); 
        for(Tabla table:tables){
            columns. addAll(table.getColumnas());
        }
             return columns; 
    }
    
}
