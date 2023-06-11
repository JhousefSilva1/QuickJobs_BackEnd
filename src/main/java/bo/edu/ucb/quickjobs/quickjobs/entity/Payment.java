package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "qj_Payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Payment_Id_Payment")
    private Long id;

    @Column(name = "qj_Payment_Name_Payment")
    private String name;

    // Constructor sin argumentos (obligatorio para JPA)
    public Payment() {
    }

    // Constructor con todos los campos
    public Payment(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return "Payment [id=" + id + ", name=" + name + "]";
    }
}
