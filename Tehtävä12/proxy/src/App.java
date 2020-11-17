import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Image> album = new ArrayList<Image>();
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        album.add(image1);
        album.add(image2);

        for (Image image : album) {
            image.showData();
        }

        System.out.println("Syötä kuvan indeksi: ");
        int i = lukija.nextInt();
        while (i != -1) {
            if (i < album.size() && album.get(i) != null) {
                album.get(i).displayImage();
            } else {
                System.out.print("Haetulla indeksillä ei löytynyt kuvaa \n");
            }
            System.out.println("Syötä kuvan indeksi: ");
            i = lukija.nextInt();
        }
        lukija.close();
    }
}
