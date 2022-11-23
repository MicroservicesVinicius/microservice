package finalProjetoMicroservice.tads.micro.service;

public class ResultadoService {
    //soma
    public Double soma(double num1,double num2){
        return num1+num2;
    }

    //sub
    public Double sub(double num1,double num2){
        return num1-num2;
    }

    //div
    public Double div(double num1,double num2){
        return num1/num2;
    }


    //mult/
    public Double mult(double num1,double num2){
        return num1*num2;
    }

    //raiz/
    public Double raiz(double num1){
        return Math.sqrt(num1);
    }

    
}
