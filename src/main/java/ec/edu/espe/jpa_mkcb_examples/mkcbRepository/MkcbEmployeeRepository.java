package ec.edu.espe.jpa_mkcb_examples.mkcbRepository;

import ec.edu.espe.jpa_mkcb_examples.mkcbModel.MkcbEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MkcbEmployeeRepository extends JpaRepository<MkcbEmployee, Integer> {
}
