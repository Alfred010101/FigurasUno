package OOP;

/**
 *
 * @author admin
 */
public class TestOperaciones
{

    public static void main(String[] args)
    {
        Operaciones opc = new Operaciones(0, 6);

        double c, resUno, xUno, xDos;

        c = opc.raiz(opc.suma(opc.potencia(opc.getA(), 2), opc.potencia(opc.getB(), 2)));

        System.out.println("C => " + c);

//        if (c != 0)
//        {
            resUno = opc.raiz(opc.resta(opc.potencia(opc.getB(), 2), opc.multiplicacion(4, opc.multiplicacion(opc.getA(), c))));

            if (resUno > 0)
            {
                xUno = opc.divicion(opc.suma(opc.multiplicacion(-1, opc.getB()), resUno),
                        opc.multiplicacion(2, opc.getA()));

                xDos = opc.divicion(opc.resta(opc.multiplicacion(-1, opc.getB()), resUno),
                        opc.multiplicacion(2, opc.getA()));

                System.out.println("x1 => " + xUno + "\nx2 => " + xDos);
            }
//        }
    }
}
