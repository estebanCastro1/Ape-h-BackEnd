package co.edu.unbosque.apeh.repositories.models;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "electives")
public class ElectiveModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nombreMateria;

    @ManyToMany(mappedBy = "electives")
    private List<PensumModel> pensum;

    @ManyToOne()
    @JoinColumn(name = "id_professor")
    private ProfessorModel professor;

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

    public List<PensumModel> getPensum() {
        return pensum;
    }

    public void setPensum(List<PensumModel> pensum) {
        this.pensum = pensum;
    }

    public ProfessorModel getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorModel professor) {
        this.professor = professor;
    }
}
