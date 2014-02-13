/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.daw.bean;

import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class RecetaBean {
    private int id;
    private ConsultaBean consulta;
    private Date inicioTratamiento;
    private int duracion;
    private String descripcion;
    private MedicamentoBean medicamento;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the consulta
     */
    public ConsultaBean getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(ConsultaBean consulta) {
        this.consulta = consulta;
    }

    /**
     * @return the inicioTratamiento
     */
    public Date getInicioTratamiento() {
        return inicioTratamiento;
    }

    /**
     * @param inicioTratamiento the inicioTratamiento to set
     */
    public void setInicioTratamiento(Date inicioTratamiento) {
        this.inicioTratamiento = inicioTratamiento;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the medicamento
     */
    public MedicamentoBean getMedicamento() {
        return medicamento;
    }

    /**
     * @param medicamento the medicamento to set
     */
    public void setMedicamento(MedicamentoBean medicamento) {
        this.medicamento = medicamento;
    }
}
