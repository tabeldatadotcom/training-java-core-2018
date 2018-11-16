package perulangan;

public class PerulanganFor{
    public static void main(String[] args){
        // for(int i = 1; i < 11; i++){
        //     System.out.println("Saya berulang sebangak " + i);
        // }

        // Integer i = 1;
        // while(i < 10){
        //     System.out.println("Saya berulang sebangak " + i);
        //     i++;
        // }

        Integer i = 0;
        do {
            i = i + 2;
            System.out.println("Saya berulang sebangak " + i);
        } while( i < 10 );
    }
}