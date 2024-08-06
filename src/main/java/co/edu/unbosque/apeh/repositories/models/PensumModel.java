package co.edu.unbosque.apeh.repositories.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "planEstudios")
public class PensumModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String materia;
    @Column(nullable = false)
    private String estadoMateria;
    @Column(nullable = false)
    private String notaMateria;

    @OneToOne(mappedBy = "pensum")
    private UserModel user;

    @JoinTable(
            name = "planEstudios_Electiva",
            joinColumns = @JoinColumn(name = "idPensum", nullable = false),
            inverseJoinColumns = @JoinColumn(name="idElectiva", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<ElectiveModel> electivas;

    public void addElective(ElectiveModel elective){
        if(this.electivas == null){
            this.electivas = new ArrayList<>();
        }
        this.electivas.add(elective);
    }

    @JoinTable(
            name = "planEstudios_Materia",
            joinColumns = @JoinColumn(name = "idPlanEstudios", nullable = false),
            inverseJoinColumns = @JoinColumn(name="idMateria", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<SubjectsModel> subjects;

    public void addSubjects(SubjectsModel subject){
        if(this.subjects == null){
            this.subjects = new ArrayList<>();
        }
        this.subjects.add(subject);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getEstadoMateria() {
        return estadoMateria;
    }

    public void setEstadoMateria(String estadoMateria) {
        this.estadoMateria = estadoMateria;
    }

    public String getNotaMateria() {
        return notaMateria;
    }

    public void setNotaMateria(String notaMateria) {
        this.notaMateria = notaMateria;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public List<ElectiveModel> getElectivas() {
        return electivas;
    }

    public void setElectivas(List<ElectiveModel> electives) {
        this.electivas = electives;
    }

    public List<SubjectsModel> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsModel> subjects) {
        this.subjects = subjects;
    }
}
