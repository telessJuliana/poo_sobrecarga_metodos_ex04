public class CalculadoraCientifica{
    public double raiz(int a){
        return Math.sqrt(a);
    }

    public double raiz(double a){
        return Math.sqrt(a);
    }

    public double raiz(String a){
        return Math.sqrt(Double.parseDouble(a));
    }

    public double potencia(byte a, byte b) {
        return Math.pow(a, b);
    }
    public double potencia(String s1, String s2) {
        return Math.pow(Double.parseDouble(s1), Double.parseDouble(s2));
    }
    public double potencia(int a, double b) {
        return Math.pow(a, b);
        
    }

}