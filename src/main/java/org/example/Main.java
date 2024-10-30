import java.util.Scanner;

class KonversiSuhu {

    public static final String MENU_PROMPT = "Pilih jenis konversi: ";
    public static final String OPTION_CELCIUS_TO_FAHRENHEIT = "1. Celcius ke Fahrenheit";
    public static final String OPTION_FAHRENHEIT_TO_CELCIUS = "2. Fahrenheit ke Celcius";

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = createScanner();

        System.out.println(MENU_PROMPT);
        System.out.println(OPTION_CELCIUS_TO_FAHRENHEIT);
        System.out.println(OPTION_FAHRENHEIT_TO_CELCIUS);
        int choice = scanner.nextInt();

        double suhu, hasil;
        switch(choice) {
            case 1:
                konverensiCelciuskeFahrenheit(scanner);
                break;
            case 2:
                konverensiFahrenheitkeCelcius(scanner);
                break;
            default:
                handleInvalidChoice();
        }
    }

    /**
     * private untuk Menunjukkan bahwa metode ini hanya dapat diakses dari dalam kelas yang sama.
     * static unyuk Menunjukkan bahwa metode ini dapat dipanggil tanpa membuat instance dari kelas tersebut.
     * void untuk Menunjukkan bahwa metode ini tidak mengembalikan nilai.
     * handleInvalidChoice unutk Nama metode yang menggambarkan fungsinya, yaitu menangani pilihan yang tidak valid.
     */
    private static void handleInvalidChoice() {
        System.out.println("Pilihan tidak valid.");
        return;
    }

    /**
     *
     * @return
     */
    private static Scanner createScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    /**
     *
     * @param scanner
     */
    private static void konverensiFahrenheitkeCelcius(Scanner scanner) {
        double suhu;
        double hasil;
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        suhu = scanner.nextDouble();
        hasil = (suhu - 32) * 5/9;
        System.out.println("Suhu dalam Celcius: " + hasil);
        return;
    }

    /**
     *
     * @param scanner
     */
    private static void konverensiCelciuskeFahrenheit(Scanner scanner) {
        double suhu;
        double hasil;
        System.out.print("Masukkan suhu dalam Celcius: ");
        suhu = scanner.nextDouble();
        hasil = (suhu * 9/5) + 32;
        System.out.println("Suhu dalam Fahrenheit: " + hasil);
        return;
    }
}
