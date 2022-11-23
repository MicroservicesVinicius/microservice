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
    String getSoma(@PathVariable double a,@PathVariable double b,@PathVariable double c){
        Double delta = rs.sub(rs.mult(b,b),rs.mult(4.0, rs.mult(a, c)) );
        Double x1 = rs.div(rs.soma(rs.mult(b, -1.0), rs.raiz(delta)),rs.mult(2.0, a));
        Double x2 = rs.div(rs.sub(rs.mult(b, -1.0), rs.raiz(delta)),rs.mult(2.0, a));
        
        return "x1="+ x1 + "e" + "x2="+ x2;
    }   
}
