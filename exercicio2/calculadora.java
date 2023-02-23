package exercicio2;

public class calculadora {
    
    public double somar(double x, double y){
        return x + y;
    }

    public double subtrair(double x, double y){
        return x - y;
    }

    public double multiplicar(double x, double y){
        return x * y;
    }

    public double dividir(double x, double y){
        /*
         * Tratamento de erro de divisão por 0
         */
        try {
            
            if(y == 0){
                throw new ArithmeticException("A divisão por zero não é permitida. \n");
            }else{
                return x / y;
            }
            
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            return Double.NaN; 
        }

    }
}
