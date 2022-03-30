import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void csvToPojo(){
        try{
            CSVReader reader=
                    new CSVReaderBuilder(new FileReader("src/main/resources/fichier.csv")).
                            build();
            List<Pojo> csv_objectList = reader.readAll().stream().map(data-> {
                Pojo csvObject= new Pojo();
                csvObject.setAnnee(data[0]);
                csvObject.setParcours(data[1]);
                csvObject.setSemestre(data[2]);
                csvObject.setUe(data[3]);
                csvObject.setEc(data[4]);
                csvObject.setAp(data[5]);
                return csvObject;
            }).collect(Collectors.toList());
            csv_objectList.forEach(System.out::println);
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        csvToPojo();
    }
}