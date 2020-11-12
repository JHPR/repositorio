package jeffrey;

public class jeff1

{
    //1. Imprimir salida
    public static void salida()
    {
        System.out.println("Hola Soy de la clase de Programacion Orientada a Objetos");
    }

    //2.Segundo operaciones matematicas o aritmeticas
    public static void operacionesaritmeticas ()
    {
        int su=0; 
        int res=0; 
        int multi=0; 
        int div=0;
        int n1=0;
        int n2=0;
        
        su = n1 + n2;
        res = n1 - n2;
        multi = n1 * n2;
        div = n1/n2;
        
        System.out.println("La suma de " + n1 + " y " + n2 + " es: " + su);
        System.out.println("La resta de " + n1 + " y " + n2 + " es: " + res);
        System.out.println("La multiplicacion de " + n1 + " y " + n2 + " es: " + multi);
        System.out.println("La division de " + n1 + " y " + n2 + " es: " + div);
        
    }
    
    //3.Tercer verdadero o falso
    public static void verdaderoFalso ()
    {
        int M=0;
        int T=0;
        int K=0;
        
        
        M = 6;
        T = 1;
        K = -10;
        
        System.out.println("M = 6"+"\n"
                + "T = 1"+"\n"
                + "K = -10"+"\n"
                + "");
        System.out.println(""
                + "M>T"
                + "");
        if (M>T)
        {
            System.out.println("Verdadero");
        }
        else
        {
            System.out.println("Falso");
        }
        
        System.out.println("\n"
                + ""
                + "T/K == -5"
                + "");
        if (T/K == -5)
        {
            System.out.println("Verdadero");
        }    
        else
        {
            System.out.println("Falso");
        }    
        
        System.out.println("\n"
                + ""
                + "M+T == 7"
                + "");
        if (M+T == 7)
        {
            System.out.println("Verdadero");
        }
        else
        {
            System.out.println("Falso");
        }
        
        System.out.println("\n"
                + ""
                + "M-T == 5"
                + "");
        if (M-T == 5)
        {
            System.out.println("Verdadero");
        }
        else
        {    
            System.out.println("Falso");
        }
    
    }        
    
    // 4.Cuarto Nombres de ciudades
    public static void ciudades()
    {
       int a;
        String ciudad [] = {" Bangkok","Atlantida","Viena","San Francisco","Berlin","Sidney","Washington D.C","Pekin","Seul","Ciudad de Mexico","Madrid","Singapur","Guangzhou","Dhaka","Gran cairo","Sao Paulo","Mumbai","Tokio","Manila","Dehli","Yakarta"};
        for(a=1;a<=20;a++)
        
            System.out.println(ciudad[a]);
    }
    
    //Numeros
    
    public static void numerosciclo()
    {
        int a;
        for (a=2;a<=100;a++)
        {
            if(a % 2 == 0)
                System.out.println(a);
        }
    }
            public static void main(String[] args) 
            
    {
        System.out.println("Imprimir");
        salida();
        
        System.out.println("\n"+ "Operaciones");
        operacionesaritmeticas();
        
        System.out.println("\n"+ "Verdadero y falso");
        verdaderoFalso();
        
        System.out.println("\n" + "Ciudades");
        ciudades();
        
        System.out.println("\n"+ "Numeros");
        numerosciclo();
    }

}

