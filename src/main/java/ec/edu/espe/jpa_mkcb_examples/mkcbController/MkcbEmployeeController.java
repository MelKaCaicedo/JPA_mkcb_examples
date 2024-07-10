package ec.edu.espe.jpa_mkcb_examples.mkcbController;

import ec.edu.espe.jpa_mkcb_examples.mkcbModel.MkcbEmployee;
import ec.edu.espe.jpa_mkcb_examples.mkcbService.MkcbEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MkcbEmployeeController {

    @Autowired
    private MkcbEmployeeService mkcbEmployeeService;

    @PostMapping("/addEmployee")
    public MkcbEmployee addEmployee(@RequestBody MkcbEmployee mkcbEmployee){
        return mkcbEmployeeService.addEmployee(mkcbEmployee);
    }
}
