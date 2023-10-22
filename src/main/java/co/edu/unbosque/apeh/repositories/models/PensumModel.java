package co.edu.unbosque.apeh.repositories.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "pensum")
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
    private UserModel student;

    @JoinTable(
            name = "pensume_Elective",
            joinColumns = @JoinColumn(name = "idPensum", nullable = false),
            inverseJoinColumns = @JoinColumn(name="idElective", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<ElectiveModel> electives;

    public void addElective(ElectiveModel elective){
        if(this.electives == null){
            this.electives = new ArrayList<>();
        }
        this.electives.add(elective);
    }

    @JoinTable(
            name = "pensume_Subjects",
            joinColumns = @JoinColumn(name = "idPensum", nullable = false),
            inverseJoinColumns = @JoinColumn(name="idSubjects", nullable = false)
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

    public UserModel getStudent() {
        return student;
    }

    public void setStudent(UserModel student) {
        this.student = student;
    }

    public List<ElectiveModel> getElectives() {
        return electives;
    }

    public void setElectives(List<ElectiveModel> electives) {
        this.electives = electives;
    }

    public List<SubjectsModel> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsModel> subjects) {
        this.subjects = subjects;
    }
}
