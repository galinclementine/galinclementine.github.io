import com.opencsv.bean.CsvBindByName;

public class Pojo {
    @CsvBindByName(column = "FANN_KEY")
    private String fann_key;

    @CsvBindByName(column = "FDIP_CODE")
    private String fdip_code;

    @CsvBindByName(column = "FGRA_CODE")
    private String fgra_code;

    @CsvBindByName(column = "FHAB_NIVEAU")
    private String fhab_niveau;

    @CsvBindByName(column = "MPAR_CODE")
    private String mpar_code;

    @CsvBindByName(column = "FORMATION")
    private String formation;

    @CsvBindByName(column = "MOY_HEURES_PRESENTIEL")
    private String moy_heures_presentiel;

    @Override
    public String toString() {
        return "Pojo{" +
                "fann_key='" + fann_key + '\'' +
                ", fdip_code='" + fdip_code + '\'' +
                ", fgra_code='" + fgra_code + '\'' +
                ", fhab_niveau='" + fhab_niveau + '\'' +
                ", mpar_code='" + mpar_code + '\'' +
                ", formation='" + formation + '\'' +
                ", moy_heures_presentiel='" + moy_heures_presentiel + '\'' +
                '}';
    }
}
