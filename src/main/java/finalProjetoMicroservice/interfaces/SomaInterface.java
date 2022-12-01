package finalProjetoMicroservice.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "soma", url = "localhost:8001")
public interface SomaInterface {
    
    @GetMapping("/num1/{num1}/num2/{num2}")
    ResponseEntity<Double> getSoma (@PathVariable Double num1, @PathVariable Double num2);
}
