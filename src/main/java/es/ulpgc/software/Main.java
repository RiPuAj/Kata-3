package es.ulpgc.software;

import es.ulpgc.software.Controller.TsvTitleReader;
import es.ulpgc.software.Controller.TitleTypeHistogram;
import es.ulpgc.software.Model.Title;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        TsvTitleReader reader = new TsvTitleReader(new File("C:\\Users\\javi_\\OneDrive\\Escritorio\\24-25\\IS2\\kata2JPR\\title.basics.tsv"));
        List<Title> allTitles = reader.read();
        TitleTypeHistogram histogram = new TitleTypeHistogram(allTitles);
        System.out.println(histogram);
    }
}


