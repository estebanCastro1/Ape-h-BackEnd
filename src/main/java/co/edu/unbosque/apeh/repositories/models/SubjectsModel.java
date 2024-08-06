package co.edu.unbosque.apeh.repositories.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "materias")
public class SubjectsModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nombreMateria;

    @Column(nullable = false)
    private String semestre;
    @Column(nullable = false)
    private String idprerequisite;

    @ManyToOne()
    @JoinColumn(name = "id_professor")
    private ProfessorModel profesor;

    @OneToMany(mappedBy = "subjects", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ScheduleIngSistemModel> ScheduleIngSistem;

    @JoinTable(
            name = "materias_prerrequisitos",
            joinColumns = @JoinColumn(name = "idMaterias", nullable = false),
            inverseJoinColumns = @JoinColumn(name="idprerequisites", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<PrerequisitesModel> prerequisites;

    public void addPrerequisites(PrerequisitesModel prerequisite){
        if(this.prerequisites == null){
            this.prerequisites = new ArrayList<>();
        }
        this.prerequisites.add(prerequisite);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }


    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public ProfessorModel getProfesor() {
        return profesor;
    }

    public void setProfesor(ProfessorModel profesor) {
        this.profesor = profesor;
    }

    public List<ScheduleIngSistemModel> getScheduleIngSistem() {
        return ScheduleIngSistem;
    }

    public String getIdprerequisite() {
        return idprerequisite;
    }

    public void setIdprerequisite(String idprerequisite) {
        this.idprerequisite = idprerequisite;
    }

    public void setScheduleIngSistem(List<ScheduleIngSistemModel> scheduleIngSistem) {
        ScheduleIngSistem = scheduleIngSistem;
    }

    public List<PrerequisitesModel> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<PrerequisitesModel> prerequisites) {
        this.prerequisites = prerequisites;
    }
}
