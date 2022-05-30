public class Principal 
{
    public static void main(String[] args) 
    {
        Quadrado quadrado = new Quadrado();
        Quadrilatero quadrilatero = new Quadrilatero();
        Retangulo retangulo = new Retangulo();
        Trapezio trapezio = new Trapezio();
        Losango losango = new Losango();   

        quadrilatero.calculaArea();
        quadrado.calculaArea();
        losango.calculaArea();
        retangulo.calculaArea();
        trapezio.calculaArea();
        
    }
}
