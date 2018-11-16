package percabangan;

public class SeleksiSwitch {
    public static void main(String[] args) {
        int bil = 50;
        switch (bil) {
        case 50:
            System.out.println("Nilai sama dengan 50");
            break;
        case 20:
            System.out.println("Nilai sama dengan 20");
            break;
        default:
            System.out.println("Nilai tidak ada yang sama");
        }

        int ip = 8;
        switch (ip) {
        case 4:
            System.out.println("A");
            break;
        case 3:
            System.out.println("B");
            // break;
        case 2:
            System.out.println("C");
            // break;
        case 1:
            System.out.println("D");
            break;
        default:
            System.out.println("E");
        }
    }
}
