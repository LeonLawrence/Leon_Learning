package java_programming_masterclass.java_learning.Exercises.Exercise_2_MegaBytes_Converter;

public class MegaBytesConverter {

        private int megabytes = 0; // Store megaBytes converted KiloBytes
        private int remainder = 0; // remainder kiloBytes
    
    private void printMegaBytesAndKiloBytes(int kiloBytes) {
        // Invalid options
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }

        // Calculations
        // 1 MB = 1024 KB
        megabytes = kiloBytes / 1024; // Quotient
        remainder = kiloBytes % 1024; // Remainder (Still in kiloBytes)
    }

    public void printCalculation (int kiloBytes) {
        // Output
        printMegaBytesAndKiloBytes(kiloBytes);
        System.out.println(kiloBytes + " KB = " + megabytes + "MB and " + remainder + "KB");
    }
}
