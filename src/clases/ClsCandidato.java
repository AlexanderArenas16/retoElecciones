/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.LinkedList;

/**
 *
 * @author arenas
 */
public class ClsCandidato extends ClsPersona {
    private String partidoPolitico;
    private String ciudadOrigen;
    private String descripcion;
    private String mensajeCampania;
    private LinkedList<String> propuestas = new LinkedList<String>();

    public ClsCandidato(String tipoDocumento, int numeroDocumento, String nombre) {
        super(tipoDocumento, numeroDocumento, nombre);
    }

    public ClsCandidato(String partidoPolitico, String ciudadOrigen, String descripcion, String mensajeCampania, String tipoDocumento, int numeroDocumento, String nombre) {
        super(tipoDocumento, numeroDocumento, nombre);
        this.partidoPolitico = partidoPolitico;
        this.ciudadOrigen = ciudadOrigen;
        this.descripcion = descripcion;
        this.mensajeCampania = mensajeCampania;
    }
    
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensajeCampania() {
        return mensajeCampania;
    }

    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }

    public LinkedList<String> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(LinkedList<String> propuestas) {
        this.propuestas = propuestas;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    
    public void inscribirCandidatura(String nombre) {
        //Poner codigo para inscribir candidato
    }
}
