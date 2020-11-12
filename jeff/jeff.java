
package jeff;


public class jeff 
{
 
    private String nombre;
   
    private String fecha;
    private String laborando;
    
    
    public jeff()
    {
        
    }
    
    
    public jeff(String identidad,String name, int edad, String fecha, String laboral)
    {
        
        this.setnombre(nombre);
        this.setfecha(fecha);
        this.setlaborando(laborando);
        
    }
    
    
  
    public String getnombre()
    {
       return nombre;  
    }
   
    public String getfecha()
    {
        return fecha;
    }
    public String getlaborando()
    {
        return laborando;
    }
    
    
    
    public void setnombre(String _name)
    {
        this.nombre = _name;
    }
    
    public void setfecha(String _fecha)
    {
        this.fecha = _fecha;
    }
    public void setlaborando(String _laboral)
    {
        this.laborando = _laboral;
    }
}
