import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.util.List;

public class Main {

    public static void main(String[] args){
        try {
            List<Pojo> beans = new CsvToBeanBuilder<Pojo>(new FileReader("src/main/resources/projetvizBis.csv")).withType(Pojo.class).build().parse();
            System.out.println(beans);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}