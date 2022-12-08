package finalProjetoMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import finalProjetoMicroservice.service.ResultadoService;

@RequestMapping("/api")
@RestController
public class ResultadoController {
    @Autowired
    ResultadoService rs;
    @GetMapping("/a/{a}/b/{b}/c/{c}")
    String getSoma(@PathVariable String a ,@PathVariable String b,@PathVariable String c){
        System.out.println("qualquer coisa");
        try {
            Double num1 = Double.parseDouble(a);
            Double num2 = Double.parseDouble(b);
            Double num3 = Double.parseDouble(c);          
            Double delta = rs.sub(rs.mult(num2,num2),rs.mult(4.0, rs.mult(num1, num3)) );
            Double x1 = rs.div(rs.soma(rs.mult(num2, -1.0), rs.raiz(delta)),rs.mult(2.0, num1));
            Double x2 = rs.div(rs.sub(rs.mult(num2, -1.0), rs.raiz(delta)),rs.mult(2.0, num1));
            return  delta +"<h2>x1="+ x1 + "e " + "x2="+ x2 + " </h2>";
            // rs.soma(2.0, 3.0);  
            // rs.sub(3.0, 2.0);
            // rs.mult(2.0, 1.0);
            // rs.div(10.0, 2.0);
            // rs.raiz(81.0);

            


            
          
        } catch (Exception e) {
            
            throw new NumberFormatException("Não é permitido letra na url!");
        }
            
      
       
    }   
}
