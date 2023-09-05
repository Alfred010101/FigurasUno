package OOP;

/**
 *
 * @author admin
 */
public class TestFigura
{
    public static void main(String[] args)
    {
        Figura objFigura = new Figura(8);
        
        objFigura.cruz();
        System.out.println("");
        objFigura.logo();
        System.out.println("");
        objFigura.rombo();
        System.out.println("");
        objFigura.reloj();
        System.out.println("");
        objFigura.contorno();
    }
}
