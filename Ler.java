public class Ler{
    float num1;
    float num2;
    String op;

    public void Mudar(String conta){
        String[] li;
        String[] operadores = {"+", "-", "*", "/"};
        String opE = null;

        for (String operador : operadores){
            if (conta.contains(operador)){
                opE = operador;
                break;
            }
        }
        if (conta.contains(" ")){
            li = conta.split(" "); 
            num1 = Float.parseFloat(li[0]);
            num2 = Float.parseFloat(li[2]);
            op = li[1];
        }
        else{
            conta = conta.replaceAll("\\+|\\-|\\*|/", " ");
            li = conta.split(" ");
            num1 = Float.parseFloat(li[0]);
            num2 = Float.parseFloat(li[1]);
            op = opE;
        }   
        
    }

    public float getNum1(){
        return num1;
    }

    public float getNum2(){
        return num2;
    }

    public String getOperador(){
        return op;
    }
}