import java.util.Scanner;

    class AreaOfSquare {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan sisi persegi:");
        double sisi = scanner.nextDouble();
        double area = sisi*sisi;
        System.out.println("Luas persegi adalah:"+area);
    }

    class AreaOfTriangle {
        public static void main (String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan alas segitiga:");
            double alas = scanner.nextDouble();
            System.out.println("Masukkan tinggi segitiga:");
            double tinggi = scanner.nextDouble();
            double area = 1/2*alas*tinggi;
            System.out.println("luas segitiga adalah:"+area);
        }
    }
    Class AreaOfCircle {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkaran:");
        double jari = scanner.nextDouble();
        double area = jari*jari*3.14;
        System.out.println("Luas lingkaran adalah:"+area);
    }
}