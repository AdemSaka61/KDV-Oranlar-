import java.sql.SQLOutput;
import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {

        double value,kdvOranı1=0.18,kdvOranı2=0.08,kdvliTutar,kdvTutarı;

        Scanner input= new Scanner(System.in);

        System.out.print("value: ");
        value= input.nextDouble();

        kdvTutarı= value * kdvOranı1;
        kdvliTutar= kdvTutarı+value;

        System.out.println("KDVsiz tutar :" + value);
        System.out.println("KDV Oranı :" + kdvOranı1);
        System.out.println("KDVli tutar :" + kdvliTutar);
        System.out.println("KDV Tutarı :" + kdvTutarı);

        boolean kosul1= value<= (0-1000);
        boolean kosul2= value >1000;
        boolean kosul= kosul1||kosul2;

        double drm= kosul ? value * kdvOranı2 : value * kdvOranı1;

        System.out.println(drm);




    }
}
