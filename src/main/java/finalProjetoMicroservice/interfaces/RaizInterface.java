package finalProjetoMicroservice.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "raiz", url = "localhost:9000")
public interface RaizInterface {
    @GetMapping("/squareroot/{num1}")
    ResponseEntity<Double> getRaiz (@PathVariable Double num1);

}
