
import Infordata.DiscoDuro;
import Infordata.Impresora;
import Infordata.Monitor;
import Infordata.Producto;
import Infordata.DiscoDuro;


public class Main {
    private static Object DiscoDuro;

    public static void main(String[] args) {
       /* //Polimorfismo
        Producto s4150 = new Impresora("333","4150",30);
        Impresora impresora =(Impresora) s4150;
        System.out.println(impresora);
        Monitor samsung24 = new Monitor("s24","Samsung",20,"1080p");
        System.out.println(samsung24);
        System.out.println(s4150);

        Monitor monitor = (Monitor) samsung24;
        System.out.println(monitor);
        Producto[]productos = new Producto[3];
        productos[0] = impresora;
        productos[1] = monitor;
        productos[2] = (Producto) DiscoDuro;

        for (int i=0; i<productos.length; i++) {

            System.out.println(productos[i]);
        }*/

            Producto lg1880 = new Monitor("lg1080", "Monitor LG 1080+",10,"HD");
        lg1880.reset();

        DiscoDuro s1000 = new DiscoDuro("s1080","Samsung s1000", 20, 1000);
        s1000.reset();




        }
    }

