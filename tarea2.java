package tarea2;

public class tarea2
    
{

    //Primer Metodo
    public String salida()
    {
        String a;
        a="Estoy aprendiendo, pero seré el mejor programador";
        System.out.println(a);
        return a;
    }
    
    //Segundo metodo
    public float mayorymenor(int a)
    {
        if(a>=18)
        {
            System.out.println("Es mayor de edad");
        }
        else
        {
            System.out.println("Es menor de edad");
        }
        return a;
    }
    
    //Tercer metodo
    public int multi(int num1, int num2)
    {
        int multi =num1*num2;
        System.out.println(multi);
        return multi;
    }
    
    //Cuarto metodo
    public int listanumeros(int e)
    {
        int a;
        int l=e;
        for(a=1;a<=l;a++)
            System.out.println(a);
        return l;
    }

    
    public static void main(String[] args) 
    {
        int mayor = 0;
        mayor = 18;
        int n1;
        int n2;
        n1 = 5;
        n2 = 3;
        int numero;
        numero=10;
        tarea2 salid = new tarea2();
        
        System.out.println("Primer Metodo ");
        salid.salida();
        System.out.println("\n"
                + "Segundo Metodo");
        salid.mayorymenor(mayor);
        System.out.println("\n"
                + "Tercer Metodo");
        salid.multi(n1, n2);
        System.out.println("\n"
                + "Cuarto Metodo");
        salid.listanumeros(numero);
        

    }
    
}
