package com.example.ClinicaOdontologica.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Turnos")
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "odontologo_id", referencedColumnName = "id")
    private Odontologo odontologo;
    @Column
    private LocalDate fechaTurno;
    @Column
    private LocalTime horaTurno;

    //-------------------------------   CONSTRUCTORES   -------------------------------

    public Turno() {
    }

    public Turno(Paciente paciente, Odontologo odontologo, LocalDate fechaTurno, LocalTime horaTurno) {
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
    }

    public Turno(Long id, Paciente paciente, Odontologo odontologo, LocalDate fechaTurno, LocalTime horaTurno) {
        this.id = id;
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
    }

    //---------------------------------------------------------------------------------
    //-----------------------------   GETTERS Y SETTERS   -----------------------------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public LocalDate getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(LocalDate fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public LocalTime getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(LocalTime horaTurno) {
        this.horaTurno = horaTurno;
    }

    //---------------------------------------------------------------------------------

}
