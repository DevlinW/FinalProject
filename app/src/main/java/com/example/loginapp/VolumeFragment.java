import java.util.Scanner;

class AreaOfBalok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan panjang alas balok:");
        double panjang = scanner.nextDouble();
        System.out.println("Masukkan lebar alas balok:");
        double lebar = scanner.nextDouble();
        System.out.println("Masukkan tinggi balok:");
        double tinggi = scanner.nextDouble();
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok adalah:" + volume);
    }
}

class AreaOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan panjang alas limas:");
        double panjang = scanner.nextDouble();
        System.out.println("Masukkan lebar alas limas:");
        double lebar = scanner.nextDouble();
        System.out.println("Masukkan tinggi limas:");
        double tinggi = scanner.nextDouble();
        double volume = panjang * lebar * tinggi * 1/3;
        System.out.println("Volume limas adalah:" + volume);
    }
}

class AreaOfTube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jari-jari:");
        double jari = scanner.nextDouble();
        System.out.println("Masukkan tinggi tabung:");
        double tinggi = scanner.nextDouble();
        double volume = jari * jari * tinggi * 22/7;
        System.out.println("Volume balok adalah:" + volume);
    }
}