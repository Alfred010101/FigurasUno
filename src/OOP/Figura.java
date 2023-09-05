package OOP;

/**
 *
 * @author admin
 */
public class Figura
{

    private int numeroCaracteres;
    private char caracter;
    private final char espacio = ' ';

    public Figura()
    {
        this.numeroCaracteres = 5;
        this.caracter = '*';
    }

    public Figura(int numeroCaracteres)
    {
        this.numeroCaracteres = numeroCaracteres;
        this.caracter = '*';
    }

    public Figura(char caracter)
    {
        this.numeroCaracteres = 5;
        this.caracter = caracter;
    }

    public Figura(int numeroCaracteres, char caracter)
    {
        this.numeroCaracteres = numeroCaracteres;
        this.caracter = caracter;
    }

    /**
     * @return the numeroCaracteres
     */
    public int getNumeroCaracteres()
    {
        return numeroCaracteres;
    }

    /**
     * @param numeroCaracteres the numeroCaracteres to set
     */
    public void setNumeroCaracteres(int numeroCaracteres)
    {
        this.numeroCaracteres = numeroCaracteres;
    }

    /**
     * @return the caracter
     */
    public char getCaracter()
    {
        return caracter;
    }

    /**
     * @param caracter the caracter to set
     */
    public void setCaracter(char caracter)
    {
        this.caracter = caracter;
    }

    private void linea(int n, char c)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(c + " ");
        }
    }

    private void linea(int n, char c, boolean salto)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(c + " ");
        }

        if (salto)
        {
            System.out.println("");
        }
    }

    private void cuboEspaciado(int n)
    {
        for (int i = 0; i < numeroCaracteres * n; i++)
        {
            linea(numeroCaracteres, espacio);
            linea(numeroCaracteres, caracter, true);
        }
    }

    public void cruz()
    {
        cuboEspaciado(1);
        for (int i = 0; i < numeroCaracteres; i++)
        {
            linea(numeroCaracteres * 3, caracter, true);
        }
        cuboEspaciado(2);
    }

    private void triangulo()
    {
        int i = (numeroCaracteres % 2 == 0) ? 2 : 1;
        for (; i <= numeroCaracteres; i += 2)
        {
            linea((numeroCaracteres - i) / 2, espacio);
            linea(i, caracter, true);
        }
    }

    private void trianguloInvertido()
    {
        int r = (numeroCaracteres % 2 == 0) ? 2 : 1;
        for (int i = numeroCaracteres; i >= r; i -= 2)
        {
            linea((numeroCaracteres - i) / 2, espacio);
            linea(i, caracter, true);
        }
    }

    public void rombo()
    {
        triangulo();
        trianguloInvertido();
    }

    public void reloj()
    {
        trianguloInvertido();
        triangulo();
    }

    public void escalera()
    {
        int spaces = numeroCaracteres - 2;
        linea(numeroCaracteres, caracter, true);

        for (int i = 1; i < numeroCaracteres * (numeroCaracteres - 1); i++)
        {
            System.out.print(caracter + " ");
            linea(spaces, espacio);
            if (i % (numeroCaracteres - 1) == 0)
            {
                linea(numeroCaracteres, caracter);
                spaces += numeroCaracteres - 1;
            } else
            {
                System.out.print(caracter);
            }
            System.out.println("");
        }
        linea(numeroCaracteres * (numeroCaracteres - 1) + 1, caracter, true);
    }

    public void contorno()
    {
        int spaces = 0;

        for (int i = numeroCaracteres; i >= 1; i--)
        {
            linea(i, caracter);
            linea(spaces, espacio);
            linea(i, caracter, true);
            spaces += 2;
        }

        for (int i = 1; i <= numeroCaracteres; i++)
        {
            spaces -= 2;
            linea(i, caracter);
            linea(spaces, espacio);
            linea(i, caracter, true);
        }
    }

    public void logo()
    {
        int left_space = (numeroCaracteres - 1) * (numeroCaracteres - 1);
        int right_space = numeroCaracteres - 2;
        int i;
        for (i = 0; i < numeroCaracteres; i++)
        {
            linea(left_space, espacio);
            linea(numeroCaracteres, caracter);
            if (i > 0)
            {
                linea(right_space, espacio);
                linea(numeroCaracteres, caracter);
                right_space += 2 * (numeroCaracteres - 1);
            }
            left_space -= numeroCaracteres - 1;
            System.out.println("");
        }

        for (i = numeroCaracteres; i > 0; i--)
        {
            left_space += numeroCaracteres - 1;
            linea(left_space, espacio);
            linea(numeroCaracteres, caracter);
            if (i > 1)
            {
                right_space -= 2 * (numeroCaracteres - 1);
                linea(right_space, espacio);
                linea(numeroCaracteres, caracter);
            }
            System.out.println("");
        }
    }
}