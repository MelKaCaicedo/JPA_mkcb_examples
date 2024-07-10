package ec.edu.espe.jpa_mkcb_examples.mkcbModel;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_mkcb_account" , schema = "IT")
public class MkcbAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mkcbPassword;

    @OneToOne
    @JoinColumn(name = "mkcb_employee_id", referencedColumnName = "id")
    private MkcbEmployee mkcbEmployee;
}
