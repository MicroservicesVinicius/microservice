package finalProjetoMicroservice.tads.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import finalProjetoMicroservice.tads.micro.service.ResultadoService;

@RequestMapping("/api")
public class ResultadoController {
    @Autowired
    ResultadoService rs;
    @GetMapping("/a/{a}/b/{b}/c/{c}")
    String getSoma(@PathVariable String a,@PathVariable String b,@PathVariable String c){
        try {
            double num1 = Double.parseDouble(a);
            double num2 = Double.parseDouble(b);
            double num3 = Double.parseDouble(c);
            Double delta = rs.sub(rs.mult(num2,num2),rs.mult(4.0, rs.mult(num1, num3)) );
            Double x1 = rs.div(rs.soma(rs.mult(num2, -1.0), rs.raiz(delta)),rs.mult(2.0, num1));
            Double x2 = rs.div(rs.sub(rs.mult(num2, -1.0), rs.raiz(delta)),rs.mult(2.0, num1));
            
            return "<h2>x1="+ x1 + "e" + "x2="+ x2 + "</h2>";
        } catch (Exception e) {
            // TODO: handle exception
            throw new NumberFormatException("Não é permitido letra na url!");
        }
       
    }   
}
