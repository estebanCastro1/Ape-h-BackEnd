package co.edu.unbosque.apeh.repositories.models;


import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long cc;

    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String names;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String usuer;
    @Column(nullable = false)
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userType_id", referencedColumnName = "id")
    private UserTypeModel userType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPensum_student", referencedColumnName = "id")
    private PensumModel pensum;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idSchedule_student", referencedColumnName = "id")
    private StudentScheduleModel studentSchedule;

    public Long getCc() {
        return cc;
    }

    public void setCc(Long cc) {
        this.cc = cc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsuer() {
        return usuer;
    }

    public void setUsuer(String usuer) {
        this.usuer = usuer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserTypeModel getUserType() {
        return userType;
    }

    public void setUserType(UserTypeModel userType) {
        this.userType = userType;
    }

    public PensumModel getPensum() {
        return pensum;
    }

    public void setPensum(PensumModel pensum) {
        this.pensum = pensum;
    }

    public StudentScheduleModel getStudentSchedule() {
        return studentSchedule;
    }

    public void setStudentSchedule(StudentScheduleModel studentSchedule) {
        this.studentSchedule = studentSchedule;
    }
}
