package finalProjetoMicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class ResultadoService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${soma.url}")
    private String somaUrl;
    @Value("${sub.url}")
    private String subUrl;
    @Value("${div.url}")
    private String divUrl;
    @Value("${raiz.url}")
    private String raizUrl;
    @Value("${mult.url}")
    private String multUrl;


    //soma
    public Double soma(double num1,double num2){
        Double resultado = restTemplate.getForObject(somaUrl + num1 + "/" + num2,Double.class);
        return resultado;
    }

    //sub
    
    public Double sub(double num1,double num2){

        Double resultado =  restTemplate.getForObject(subUrl+ num1 + "/" + num2,Double.class);
        return resultado;
    }

    //div
    public Double div(double num1,double num2){
        Double resultado = restTemplate.getForObject(divUrl + "num1/" + num1 + "/num2/"+ num2 ,Double.class);
        return resultado;
    }


    //mult/
    public Double mult(double num1,double num2){
        Double resultado =  restTemplate.getForObject(multUrl + num1 + "/" + num2,Double.class);
        return resultado;
        
    }

    //raiz/
    public Double raiz(double num1){
        Double resultado = restTemplate.getForObject(raizUrl +num1 ,Double.class);
        return resultado;
    }

    
}
