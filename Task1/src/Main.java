import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

     Wine wine1 = new Wine(Specs.red_cab,"Красный закат",Trademarks.us_tfe_sutterhome,"Красное вино с розовыми нотами", LocalDate.of(2008,4,11));
     Wine wine2 = new Wine(Specs.white_sav,"Белое солнце",Trademarks.australia_cw_yellowtail,"Белое австралийское", LocalDate.of(2012,2,15));
     Wine wine3 = new Wine(Specs.red_mer,"Красный багрянец",Trademarks.chili_ct_concha,"Чилийский восторг", LocalDate.of(2015,7,30));

        //ToString
        System.out.println("Вино №1:");
        System.out.println(wine1.toString());

        System.out.println("Вино №2:");
        System.out.println(wine2.toString());

        System.out.println("Вино №3:");
        System.out.println(wine3.toString());

        //GetAllWineInfo
        System.out.println("Вино №1:");
        System.out.println(wine1.getAllWineInfo());

        System.out.println("Вино №2:");
        System.out.println(wine2.getAllWineInfo());

        System.out.println("Вино №3:");
        System.out.println(wine3.getAllWineInfo());

        //GetAgging LocalDate.now()
        System.out.println("Выдержка вина №1:");
        System.out.println(wine1.getAging(LocalDate.now()));

        System.out.println("Выдержка вина №2:");
        System.out.println(wine2.getAging(LocalDate.now()));

        System.out.println("Выдержка вина №3:");
        System.out.println(wine3.getAging(LocalDate.now()));

        //GetAgging LocalDate.of(2022,1,1)
        System.out.println("Выдержка вина №1:");
        System.out.println(wine1.getAging(LocalDate.of(2022,1,1)));

        System.out.println("Выдержка вина №2:");
        System.out.println(wine2.getAging(LocalDate.of(2022,1,1)));

        System.out.println("Выдержка вина №3:");
        System.out.println(wine3.getAging(LocalDate.of(2022,1,1)));
    }
}