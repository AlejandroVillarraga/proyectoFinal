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
    
    public Student BitMonitor;
    public String description;
    public Task BitTask;
    public Date fecha;
    public Monitoria BitMonitoria;
    public Turn BitTurn;
    public int IdBit;
    public int taskid;
    public int monitoria_id;
    public int monitor_id;
    public int turno_id;

    /**
     * Constructor de la clase Bitacora
     * @param m parametro que contiene la informacion de un monitor
     * @param d contiene la descripcion de la Bitacora
     * @param id contiene el id del la bitacora
     * @param ta contiene toda la informacion de la tarea sealizada en la bitacora
     * @param fecha fecha de registro de la bitacora
     * @param mo contiene toda la informacion de la monitoria correspondiente realizada en el turno 
     */
    public Bitacora(Student m,  String d, Task ta, Date fecha, Monitoria mo, Turn t, int idb){
        BitMonitor = m;
        //BitTurn = t;
        description = d;
        BitTask = ta;
        this.fecha = fecha;
        BitMonitoria = mo;
        BitTurn=t;
        IdBit = idb;
    }

    public Bitacora(String description,  int IdBit, int taskid, Date fecha,int monitoria_id, int monitor_id, int turno_id) {
        this.description = description;
        this.fecha = fecha;
        this.IdBit = IdBit;
        this.taskid = taskid;
        this.monitoria_id = monitoria_id;
        this.monitor_id = monitor_id;
        this.turno_id = turno_id;
    }

 



    
    
    

    public int getIdBit() {
        return IdBit;
    }

    public void setIdBit(int IdBit) {
        this.IdBit = IdBit;
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
                           + ", Monitor_Turnos_id=" + BitTurn.getIdTurn() 
                           + ", descripcion=" + description 
                           + ", tarea_id=" + BitTask.getIdTask()  
                           + ", fecha=" + this.fecha
                           + ", Monitoria_id=" + BitMonitoria.getIdMonitoria()+ '}';
    }
    
    
    
    public Student getBitMonitor() {
        return BitMonitor;
    }

    public void setBitMonitor(Student BitMonitor) {
        this.BitMonitor = BitMonitor;
    }

    public Turn getBitTurn() {
        return BitTurn;
    }

    public void setBitTurn(Turn BitTurn) {
        this.BitTurn = BitTurn;
    }

    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
