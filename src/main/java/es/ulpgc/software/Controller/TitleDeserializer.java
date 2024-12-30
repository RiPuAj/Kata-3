package es.ulpgc.software.Controller;

import es.ulpgc.software.Model.Title;

public interface TitleDeserializer {
    public Title deserialize(String title);
    public String capitalize(String word);
}
