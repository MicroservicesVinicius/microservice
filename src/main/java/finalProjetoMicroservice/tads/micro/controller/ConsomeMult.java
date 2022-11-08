package finalProjetoMicroservice.tads.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/api/")
public class ConsomeMult {
    @GetMapping("multiplicar")
    Integer multNumbers(@PathVariable Integer num1,@PathVariable Integer num2){
       String url = "http://localhost:9000/mult";
       RestTemplate restTemplate = new RestTemplate();
       Integer result = restTemplate.getForObject(url, Integer.class); 
    return result;
    }
    
    
}
