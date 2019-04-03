/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionesswing;

/**
 *
 * @author estuardo
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String grado;
    private String carnet;
    
    public Estudiante(){
        
    }
    
    public Estudiante(String nombre,String apellido,String grado, String carnet){
        this.nombre = nombre;
        this.apellido= apellido;
        this.grado = grado;
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    
    
    
    
}
