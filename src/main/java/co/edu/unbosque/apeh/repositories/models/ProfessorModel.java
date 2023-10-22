package co.edu.unbosque.apeh.repositories.models;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "professor")

public class ProfessorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nombreDocente;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubjectsModel> subjects;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ElectiveModel> electives;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public List<SubjectsModel> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsModel> subjects) {
        this.subjects = subjects;
    }

    public List<ElectiveModel> getElectives() {
        return electives;
    }

    public void setElectives(List<ElectiveModel> electives) {
        this.electives = electives;
    }
}
