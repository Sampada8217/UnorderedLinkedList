package com.UnorderedLinkedList;

import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

    public class CsvReaderWriter {
        LinkedList linkedList=new LinkedList();


        public List<String[]> readFromCsv() {
            String CSV_Location="data.csv";
            List<String[]> linkedLists=new ArrayList<>();
            try{
                    BufferedReader bufferedReader =Files.newBufferedReader(Paths.get(CSV_Location));
                    CSVReader csvReader=new CSVReader(bufferedReader);
                    String[] dataRecords;
                    while ((dataRecords=csvReader.readNext()) != null){
                    linkedLists.add(dataRecords);

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            return  linkedLists;
        }

         public LinkedList loadToLinkedList(List<String[]> linkedLists) {
            for(String[] str:linkedLists) {
                for (String ele : str) {
                    linkedList.add(ele);
                }
            }
            return linkedList;

        }

    }




