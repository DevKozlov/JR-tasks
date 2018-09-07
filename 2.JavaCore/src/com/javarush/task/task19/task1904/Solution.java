package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String pers = fileScanner.nextLine();
            int pfam = pers.indexOf(" ");
            String fam = pers.substring(0,pfam);
            int pim = pers.indexOf(" ",pfam+1);
            String im = pers.substring(pfam+1, pim);
            int pot = pers.indexOf(" ", pim+1);
            String otch = pers.substring(pim+1, pot);
            String bd = pers.substring(pot+1);



            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Date BD = new Date();
            try{
                BD = sdf.parse(bd);
                String dd = BD.toString();
            }catch(ParseException e){
                e.printStackTrace();
            }

            return new Person(im,otch,fam,BD);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
