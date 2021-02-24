package ru.nsu.ccfit.valker.lab1;

import java.io.IOException;
        import java.io.Writer;
        import java.util.List;
        import java.util.Map;
        import static java.lang.Math.ceil;

public class CSVwriter {
    void writeToFile(Writer out, List<Map.Entry<String, Integer>> list, int total) throws IOException {
        out.write("Word; Word count; Percentage\n");
        for (var e : list) {
            out.write(e.getKey() + ";" + e.getValue() + ";" + ceil(((double) e.getValue() / total) * 10000) / 100 + "%\n");
        }
    }
    void writeToFile(List<Map.Entry<String, Integer>> list, int total) throws IOException {
        System.out.println("Word;Word count;Percentage");
        for (var e : list) {
            System.out.println(e.getKey() + ";" + e.getValue() + ";" + ceil(((double) e.getValue() / total) * 10000) / 100 + "%");
        }
    }
}