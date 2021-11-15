package program.praktikum7;
import java.util.Scanner;
/**
 *
 * @author Ghufron
 */
public class ProsesCatatParkir {

   
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Masuk ke Sistem Parkir? y/n");
            char masuk = in.nextLine().charAt(0);

            if (masuk == 'y') {
                new ProgramPencatatanParkir();
            }
            if (masuk == 'n') {
                break;
            }

        }
    }
    
}