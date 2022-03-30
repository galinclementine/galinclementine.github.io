import com.opencsv.bean.CsvBindByPosition;

public class pojo {
    @CsvBindByPosition(position = 0)
    private String annee;

    @CsvBindByPosition(position = 1)
    private String commun;

    @CsvBindByPosition(position = 2)
    private String semestre;

    @CsvBindByPosition(position = 3)
    private String ue;

    @CsvBindByPosition(position = 4)
    private String ec;

    @CsvBindByPosition(position = 5)
    private String ap;
}
