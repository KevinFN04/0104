
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{    
    public void generateStarWarsName(String nombre, String apellido1, String apellido2, String ciudad){
        String starWarsName = apellido1.substring(0,3) + nombre.substring(0,3).toLowerCase() + " " + 
                              apellido2.substring(0,2) + ciudad.substring(0,3).toLowerCase();
        System.out.println(starWarsName);
    }
}
