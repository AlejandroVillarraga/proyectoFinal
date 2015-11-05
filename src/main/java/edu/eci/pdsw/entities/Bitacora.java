/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template tin the editor.
 */
package edu.eci.pdsw.entities;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author felipe
 */
public class Bitacora {
    
    public Monitor BitMonitor;
    //public Turn BitTurn;
    public String description;
    public int IdBit;
    public Task BitTask;
    public Date fecha;
    public Monitoria BitMonitoria;

    /**
     * Constructor de la clase Bitacora
     * @param m parametro que contiene la informacion de un monitor
     * @param d contiene la descripcion de la Bitacora
     * @param id contiene el id del la bitacora
     * @param ta contiene toda la informacion de la tarea sealizada en la bitacora
     * @param fecha fecha de registro de la bitacora
     * @param mo contiene toda la informacion de la monitoria correspondiente realizada en el turno 
     */
    public Bitacora(Monitor m,  String d, int id, Task ta, Date fecha, Monitoria mo){
        BitMonitor = m;
        //BitTurn = t;
        description = d;
        IdBit = id;
        BitTask = ta;
        this.fecha = fecha;
        BitMonitoria = mo;
    }
    
    /**
     * 
     */
    public Bitacora(){
    
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Bitacora{" + "Monitor_Estudiantes_id=" + BitMonitor.getIdStudent()
                           + ", Monitor_Turnos_id=" + BitMonitor.getIdTurn() 
                           + ", descripcion=" + description 
                           + ", id=" + IdBit 
                           + ", tarea_id=" + BitTask.getIdTask()  
                           + ", fecha=" + this.fecha
                           + ", Monitoria_id=" + BitMonitoria.getIdMonitoria()+ '}';
    }
    
    
    
    public Monitor getBitMonitor() {
        return BitMonitor;
    }

    public void setBitMonitor(Monitor BitMonitor) {
        this.BitMonitor = BitMonitor;
    }

    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdBit() {
        return IdBit;
    }

    public void setIdBit(int IdBit) {
        this.IdBit = IdBit;
    }

    public Task getBitTask() {
        return BitTask;
    }

    public void setBitTask(Task BitTask) {
        this.BitTask = BitTask;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Monitoria getBitMonitoria() {
        return BitMonitoria;
    }

    public void setBitMonitoria(Monitoria BitMonitoria) {
        this.BitMonitoria = BitMonitoria;
    }
    
    
}