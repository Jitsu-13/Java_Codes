import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateandTime {

    public static void main(String[] args) {

//        LocalDate dob = LocalDate.of(1985,2,5);
////        System.out.println(dob);
//        LocalDate dob2=LocalDate.now();
//        System.out.println(dob2.isAfter(dob));
//        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        /*LocalDate ld = LocalDate.now();
        DateTimeFormatter of=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ld1=ld.format(of);
        String ldw=ld.format(DateTimeFormatter.ofPattern("dd*MM*yy"));
        System.out.println(ld1);
        System.out.println(ldw);*/


        /*String abc="05/02/1985";
        LocalDate res= LocalDate.parse(abc,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(res);*/

        LocalDateTime olddate=LocalDateTime.of(1990,2,20,10,20,20);
        LocalDateTime current= LocalDateTime.now();

        System.out.println(ChronoUnit.YEARS.between(olddate,current));







        /*
        LocalDate ld = LocalDate.now();
        LocalTime lt =LocalTime.now();
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(ld);
        System.out.println(lt);
        System.out.println(dt);*/
    }
}
