package co.edu.unbosque.apeh.repositories.models;


import jakarta.persistence.*;

@Entity
@Table(name = "ScheduleIngSistem")
public class ScheduleIngSistemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(nullable = false)
    private String periodo;

    @Column(nullable = false)
    private String diaSemana;

    @Column(nullable = false)
    private String horaDia;

    @Column(nullable = false)
    private String aula;

    @ManyToOne()
    @JoinColumn(name = "id_Subjects")
    private SubjectsModel subjects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHoraDia() {
        return horaDia;
    }

    public void setHoraDia(String horaDia) {
        this.horaDia = horaDia;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public SubjectsModel getSubjects() {
        return subjects;
    }

    public void setSubjects(SubjectsModel subjects) {
        this.subjects = subjects;
    }
}
