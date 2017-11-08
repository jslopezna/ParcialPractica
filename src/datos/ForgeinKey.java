/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author ESTUDIANTE
 */
public class ForgeinKey extends Column {

    private Tabla tabla;

    

    ForgeinKey(String name, String dataType) {
 super(name, dataType);    }

    

        public Tabla getTabla() {
        return tabla;
    }

    void setTabla(Tabla tabla) {
        this.tabla = tabla;
    }

}
