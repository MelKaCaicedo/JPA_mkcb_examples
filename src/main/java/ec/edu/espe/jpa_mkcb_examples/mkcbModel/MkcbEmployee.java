package ec.edu.espe.jpa_mkcb_examples.mkcbModel;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_mkcb_employee" , schema = "HR")
public class MkcbEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mkcbEmail;
    private String mkcbName;
}
