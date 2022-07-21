/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author arenas
 */
public class ClsVotante extends ClsPersona {
    private String correoElectronico;

    public ClsVotante(String correoElectronico, String tipoDocumento, int numeroDocumento, String nombre) {
        super(tipoDocumento, numeroDocumento, nombre);
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
}
