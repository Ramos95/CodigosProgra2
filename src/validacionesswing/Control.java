/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionesswing;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;

/**
 *
 * @author estuardo
 */
public class Control {

    //Arraylist donde se manejaran los estudiantes
    ArrayList<Estudiante> listaEstudiante = new ArrayList<Estudiante>();

    //El metodo agregar espera los parametros propios de la clase Estudiante y lo guarda como un nuevo objeto en el
    public ArrayList<Estudiante> agregar(String nombre, String apellido, String grado, String carnet) {
        listaEstudiante.add(new Estudiante(nombre, apellido, grado, carnet));
        return listaEstudiante;
    }

    /*El netodo buscar itera sobre el arraylist para encontrar el alumno con el carnet buscado
    si encuentra coincidencia devuelve el objeto estudiante encontrado, sino devuelve null*/
    public Estudiante buscar(String carnet) {
        for (Estudiante e : listaEstudiante) {
            if (e.getCarnet().equals(carnet)) {
                return e;
            }
        }
        return null;
    }

    /* Tanto editar como eliminar esperan el objeto estudiante en cual trabajar
    ya que buscar devuelve un objeto estudiabte y comprueba que exista, usar buscar
    antes de ambos metodos para que estos solo realicen su accion predeterminada
     */
    
    public ArrayList<Estudiante> editar(Estudiante e, String nombre, String apellido, String grado) {

        int indice = listaEstudiante.indexOf(e);
        e.setNombre(nombre);
        e.setApellido(apellido);
        e.setGrado(grado);

        listaEstudiante.set(indice, e);

        return listaEstudiante;
    }

    public ArrayList<Estudiante> eliminar(Estudiante e) {

        listaEstudiante.remove(listaEstudiante.indexOf(e));

        return listaEstudiante;
    }

}
