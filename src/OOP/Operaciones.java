package OOP;

/**
 *
 * @author admin
 */
public class Operaciones
{

    private int a;
    private int b;

    public Operaciones()
    {
    }

    public Operaciones(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    /**
     * @return the a
     */
    public int getA()
    {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a)
    {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB()
    {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b)
    {
        this.b = b;
    }

    public int suma(int a, int b)
    {
        return a + b;
    }

    public double suma(int a, double b)
    {
        return a + b;
    }

    public double suma(double a, int b)
    {
        return a + b;
    }

    public double suma(double a, double b)
    {
        return a + b;
    }

    public int resta(int a, int b)
    {
        return a - b;
    }

    public double resta(int a, double b)
    {
        return a - b;
    }

    public double resta(double a, int b)
    {
        return a - b;
    }

    public double resta(double a, double b)
    {
        return a - b;
    }

    public int multiplicacion(int a, int b)
    {
        return a * b;
    }

    public double multiplicacion(int a, double b)
    {
        return a * b;
    }

    public double multiplicacion(double a, int b)
    {
        return a * b;
    }

    public double multiplicacion(double a, double b)
    {
        return a * b;
    }

    public int divicion(int a, int b)
    {
        if (b != 0)
        {
            return a / b;
        }

        System.out.println("ERROR: Divicion entre 0.");
        return 0;
    }

    public double divicion(int a, double b)
    {
        if (b != 0)
        {
            return a / b;
        }

        System.out.println("ERROR: Divicion entre 0.");
        return 0;
    }

    public double divicion(double a, int b)
    {
        if (b != 0)
        {
            return a / b;
        }

        System.out.println("ERROR: Divicion entre 0.");
        return 0;
    }

    public double divicion(double a, double b)
    {
        if (b != 0)
        {
            return a / b;
        }

        System.out.println("ERROR: Divicion entre 0.");
        return 0;
    }
    
    public double potencia(int a, int b)
    {
        return Math.pow(a, b);
    }

    public double potencia(int a, double b)
    {
        return Math.pow(a, b);
    }

    public double potencia(double a, int b)
    {
        return Math.pow(a, b);
    }

    public double potencia(double a, double b)
    {
        return Math.pow(a, b);
    }
    
    public double raiz(int a)
    {
        if (a >= 0)
        {
            return Math.sqrt(a);
        }

        System.out.println("ERROR: No existen raices negativas.");
        return 0;
    }

    public double raiz(double a)
    {
        if (a >= 0)
        {
            return Math.sqrt(a);
        }

        System.out.println("ERROR: No existen raices negativas.");
        return 0;
    }

    public double raiz(long a)
    {
        if (a >= 0)
        {
            return Math.sqrt(a);
        }

        System.out.println("ERROR: No existen raices negativas.");
        return 0;
    }

}
