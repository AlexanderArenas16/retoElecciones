/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author arenas
 */
public class ClsEleccion {
    LinkedList<ClsVotante> listaVotantes;
    LinkedList<ClsCandidato> listaCandidatos;
    String descripcion;
    String categoria;
    Date fecha_inicio;
    Date fecha_fin;
    Date fecha_ins;

    public ClsEleccion(String descripcion, String categoria, Date fecha_inicio, Date fecha_fin, Date fecha_ins) {
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.fecha_ins = fecha_ins;
        this.listaCandidatos = new LinkedList<>();
        this.listaVotantes = new LinkedList<>();
    }
    

}
