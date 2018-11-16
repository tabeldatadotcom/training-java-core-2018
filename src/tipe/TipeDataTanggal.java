package tipe;

import java.util.Date;
import java.time.LocalDate;
import java.text.SimpleDateFormat;

public class TipeDataTanggal{
    public static void main(String[] args) throws Exception  {
        Date tanggal = new Date();
        System.out.println("Tanggal Sekarang adalah " + tanggal); 
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        System.out.println("Tanggal yang sudha di format: "+ sdf.format(tanggal));   

        LocalDate tanggalBaru = LocalDate.now();
        System.out.println(
            "Tanggal sekarang adalah " + 
            tanggalBaru
        );
        LocalDate kemarin = LocalDate.of(2017, 10, 10);
        System.out.println(
            "Tanggal kemarin adalah " + 
            kemarin
        );

    }
}