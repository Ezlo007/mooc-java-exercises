public class AdvancedAstrology {

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
            System.out.println(); // satır sonu
        }
    }

    public static void christmasTree(int height) {
        // 1. KISIM: Ağacın Yaprakları (Üçgen kısmı)
        for (int i = 1; i <= height; i++) {
            // Boşluk formülü: height - i
            printSpaces(height - i);
            // Yıldız formülü: 2 * i - 1
            printStars(2 * i - 1);
            // Satırı bitirip aşağı geçiyoruz
            System.out.println();
        }

        // 2. KISIM: Ağacın Gövdesi (Taban kısmı)
        // Gövde 2 satır yüksekliğinde ve 3 yıldız genişliğindedir.
        for (int i = 0; i < 2; i++) {
            // Merkeze hizalamak için gereken boşluk: height - 2
            printSpaces(height - 2);
            printStars(3);
            // Satırı bitirip aşağı geçiyoruz
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test etmek için main metodu hazır
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}