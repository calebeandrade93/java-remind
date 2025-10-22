package utilss.records;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Records {

    static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date nascimento = sdf.parse("11-04-1993");

        Record record = new Record("Lucas", 32, nascimento);

        System.out.println("Idade: " + record.idade());
    }

}

record Record(String name, Integer idade, Date dataNascimento){
}// Muito utilizado em DTO
