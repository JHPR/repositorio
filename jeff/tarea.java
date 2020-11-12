package jeff;
public class tarea  
{

   
    public static void main(String[] args) 
    {    
      jeff nutricionista = new jeff();
      
       nutricionista.setfecha("1 de Enero del 2015");
       nutricionista.setlaborando("5 años");
      nutricionista.setnombre("Jeffrey Haissam Pineda");
      
      
       
        System.out.println("El nombre del nutricionista es: " + nutricionista.getnombre());
        System.out.println("La fecha de su inicio de profesion: " + nutricionista.getfecha());
        System.out.println("Su tiempo laborando: " + nutricionista.getlaborando());

    }
    
}
