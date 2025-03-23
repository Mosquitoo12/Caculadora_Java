public class Calculadora{
 
    public String calculator(float num1, String op, float num2){
        float resultado;
        switch (op){

            case "+":
                resultado = num1 + num2;
                break;

            case "-":
                resultado = num1 - num2;
                break;

            case "*":
                resultado = num1 * num2;
                break;
            
            case "/":
                if (num2 == 0){
                    return "Impossivel excutar essa conta";
                }
                resultado = num1 / num2;
                break;

            default:
                return "Erro";
        }
        if (resultado % 1 == 0){
            int result = (int) resultado;
            return "Resultado: " + result;
        }
        return "Resultado: " + resultado;
    }
}