package es.ulpgc.software.Model;

import java.util.List;

public interface Histogram {
    public List<String> getKeys();
    public Long valueOf(String type);
}
