package finalProjetoMicroservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class ResultadoService {


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

    public ResultadoService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;

    }
    //soma
    public Double soma(double num1,double num2){
        
        return restTemplate.getForObject(somaUrl,Double.class,num1,num2);
    }

    //subgit status
    
    public Double sub(double num1,double num2){

        return restTemplate.getForObject(subUrl,Double.class,num1,num2);
    }

    //div
    public Double div(double num1,double num2){
        return restTemplate.getForObject(divUrl,Double.class,num1,num2);
    }


    //mult/
    public Double mult(double num1,double num2){
        return restTemplate.getForObject(multUrl,Double.class,num1,num2);
    }

    //raiz/
    public Double raiz(double num1){
        return restTemplate.getForObject(raizUrl,Double.class,num1);
    }

    
}
