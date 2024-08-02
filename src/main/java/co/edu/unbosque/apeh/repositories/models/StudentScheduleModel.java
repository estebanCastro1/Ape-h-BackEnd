package co.edu.unbosque.apeh.repositories.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "horarioEstudiantes")
public class StudentScheduleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nombreMateria;
    @Column(nullable = false)
    private String diaSemana;
    @Column(nullable = false)
    private String horaDia;

    @OneToOne(mappedBy = "studentSchedule")
    private UserModel student;

    @JoinTable(
            name = "horarioEstudiantes_Electiva",
            joinColumns = @JoinColumn(name = "idHorarioEstudiantes", nullable = false),
            inverseJoinColumns = @JoinColumn(name="idElectiva", nullable = false)
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
            name = "horarioEstudiantes_Materia",
            joinColumns = @JoinColumn(name = "idHorarioEstudiantes", nullable = false),
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

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
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

    public UserModel getStudent() {
        return student;
    }

    public void setStudent(UserModel student) {
        this.student = student;
    }
}
