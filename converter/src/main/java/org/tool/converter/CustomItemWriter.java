package org.tool.converter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Value;

public class CustomItemWriter<T> implements ItemWriter<T> {

    @Value("${file.output.path}")
     String outputResource;

    ObjectMapper obj= new ObjectMapper();

    @Override
    public void write(List<? extends T> items) throws Exception {

        FileWriter file=new FileWriter(outputResource);

        BufferedWriter jsonFile=new BufferedWriter(file);

        String jsonLine;
        for (T item : items) {
            jsonLine=obj.writeValueAsString(item);
            jsonFile.append(jsonLine);
            jsonFile.newLine();
        }


        jsonFile.close();
    }
}