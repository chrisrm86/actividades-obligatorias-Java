package actividadesobligatorias;
import java.util.Scanner;
/**
 * @author Christian Morán
 */

public class ActividadesObligatorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenida/o, ingrese sus datos \n ----------------");
       
        System.out.println("Nombre: ");
        String name = scanner.nextLine();
      
        System.out.println("Apellido: ");
        String surname = scanner.nextLine();
        
        System.out.println("Edad: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Hobbie: ");
        String hobbie = scanner.nextLine();
        
        System.out.println("Editor de código favorito: ");
        String favoriteCodeEditor = scanner.nextLine();
        
        System.out.println("Sistema operativo que utiliza: ");
        String currentOS = scanner.nextLine();
        
        System.out.println("------------------ \nSus datos:");
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + surname);
        System.out.println("Edad: " + age);
        System.out.println("Hobbie: " + hobbie);
        System.out.println("Editor de código favorito: " + favoriteCodeEditor);
        System.out.println("Sistema operativo que utiliza: " + currentOS);
        
    }
    
}
