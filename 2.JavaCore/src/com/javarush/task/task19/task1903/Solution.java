package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
//        String phoneMask= "(###)###-##-##";
//        //String phoneNumber = String.valueOf(data.getPhoneNumber());
//        String phoneNumber = "99999999999";
//        StringBuilder sb = new StringBuilder();
//        sb.append(phoneNumber);
//        if (phoneNumber.length() < 10) {
//            for (int i = 0; i < 10-phoneNumber.length(); i++) {
//                sb.append("0");
//            }
//        }
//
//        phoneNumber = sb.toString();
//
//        try {
//            MaskFormatter maskFormatter= new MaskFormatter(phoneMask);
//            maskFormatter.setValueContainsLiteralCharacters(false);
//            phoneNumber = maskFormatter.valueToString(phoneNumber) ;
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println("+" + "35" + phoneNumber);
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber(){
            String phoneMask= "(###)###-##-##";
            String phoneNumber = String.valueOf(data.getPhoneNumber());
            StringBuilder sb = new StringBuilder();
            if (phoneNumber.length() < 10) {
                for (int i = 0; i < 10-phoneNumber.length(); i++) {
                    sb.append("0");
                }
            }
            sb.append(phoneNumber);

            phoneNumber = sb.toString();

            try {
                MaskFormatter maskFormatter= new MaskFormatter(phoneMask);
                maskFormatter.setValueContainsLiteralCharacters(false);
                phoneNumber = maskFormatter.valueToString(phoneNumber) ;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return "+" + data.getCountryPhoneCode() + phoneNumber;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}