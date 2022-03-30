import com.opencsv.bean.CsvBindByPosition;

public class Pojo {
    @CsvBindByPosition(position = 0)
    private String annee;

    @CsvBindByPosition(position = 1)
    private String parcours;

    @CsvBindByPosition(position = 2)
    private String semestre;

    @CsvBindByPosition(position = 3)
    private String ue;

    @CsvBindByPosition(position = 4)
    private String ec;

    @CsvBindByPosition(position = 5)
    private String ap;

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getParcours() {
        return parcours;
    }

    public void setParcours(String parcours) {
        this.parcours = parcours;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getUe() {
        return ue;
    }

    public void setUe(String ue) {
        this.ue = ue;
    }

    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "annee='" + annee + '\'' +
                ", parcours='" + parcours + '\'' +
                ", semestre='" + semestre + '\'' +
                ", ue='" + ue + '\'' +
                ", ec='" + ec + '\'' +
                ", ap='" + ap + '\'' +
                '}';
    }
}
