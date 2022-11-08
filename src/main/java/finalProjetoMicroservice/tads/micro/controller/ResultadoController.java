package finalProjetoMicroservice.tads.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import finalProjetoMicroservice.tads.micro.service.ResultadoService;

@RequestMapping("/api")
public class ResultadoController {
    @Autowired
    ResultadoService somaService;
    @GetMapping("/a/{num1}/b/{num2}/c/{num3}")
    Integer getSoma(@PathVariable Integer num1,@PathVariable Integer num2,@PathVariable Integer num3){
        return somaService.calcFinal();
    }
}
