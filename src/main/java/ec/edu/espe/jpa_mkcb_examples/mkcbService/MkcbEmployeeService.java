package ec.edu.espe.jpa_mkcb_examples.mkcbService;

import ec.edu.espe.jpa_mkcb_examples.mkcbModel.MkcbEmployee;
import ec.edu.espe.jpa_mkcb_examples.mkcbRepository.MkcbEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MkcbEmployeeService {

    @Autowired
    MkcbEmployeeRepository mkcbEmployeeRepository;

    public MkcbEmployee addEmployee(MkcbEmployee mkcbEmployee){
        return mkcbEmployeeRepository.save(mkcbEmployee);
    }
}
