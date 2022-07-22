/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import clases.ClsCandidato;
import clases.ClsJdbc;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.util.LinkedList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author EQUIPO
 */
public class MdlCandidato {
    
    ClsJdbc jdbc;

    public MdlCandidato() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConnexion();
    }
    
    public boolean adicionarCandidato(ClsCandidato candidato){ 
        
        return true;
    
    }
    
    public LinkedList<ClsCandidato> ObtenerCandidatos(){
        
        try{
            LinkedList<ClsCandidato> lista = new LinkedList<>();
            
            String consulta = "SELECT * FROM tbl_candidatos";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resutados = sentencia.executeQuery(); //tabla
            
//            while(resultados.next()){
//                String tipoDocumento = resultados.getString("")
//                int numeroDocumento=
//                String nombre = 
//                ClsCandidato candidato = new ClsCandidato(tipoDocumento,numeroDocumento, nombre);  //hacer otro constructor?
//                lista.add(candidato);
//            }
            return null;
        }catch (Exception e){
            return null;
//            
        }
    }
    
}

