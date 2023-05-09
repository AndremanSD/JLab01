package org.dstu;

import org.dstu.domain.IDevice;
import org.dstu.domain.SSD;
import org.dstu.domain.HDD;
import org.dstu.util.CsvReader;
import org.dstu.util.SerializeUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You must specify data file name and serialize file name!");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];

        //trigger in csv
        List<String[]> strings = CsvReader.readCsvFile(sourceFile, ";");
        List<IDevice> people = new ArrayList<>();
        for (String[] line: strings) {
            if (line[0].equals("HDD")) {
                people.add(new HDD(line));
            } else {
                people.add(new SSD(line));
            }
        }

        people.forEach(System.out::println);

        SerializeUtils.serialize(people, binFile);
        List<IDevice> newPersons = (List<IDevice>) SerializeUtils.deserialize(binFile);
        System.out.println("Новые устройства:");
        newPersons.forEach(System.out::println);
    }
}
