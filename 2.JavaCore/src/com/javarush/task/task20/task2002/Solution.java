package com.javarush.task.task20.task2002;

import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            User user = new User();
            user.setFirstName("Rubi");
            user.setLastName("Rail");
            user.setBirthDate(new Date(1508944516168L));
            user.setMale(false);
            user.setCountry(User.Country.OTHER);

            User user1 = new User();
            user1.setFirstName("Vasa1");
            user1.setLastName("Peta1");
            user1.setBirthDate(new Date(1508944516163L));
            user1.setMale(false);
            user1.setCountry(User.Country.RUSSIA);

            User user3 = new User();
            user3.setFirstName("Solo");
            user3.setLastName("Han");
            user3.setBirthDate(new Date(1508944516169L));
            user3.setMale(false);
            user3.setCountry(User.Country.UKRAINE);
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.users.add(user);
            javaRush.users.add(user1);
            javaRush.users.add(user3);


            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            System.out.println(javaRush.equals(loadedObject));
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            if (users.size()>0){
                for (User x:users) {
                    printWriter.println(x.getFirstName());
                    printWriter.println(x.getLastName());
                    printWriter.println(x.getBirthDate().getTime());
                    printWriter.println(x.isMale());
                    printWriter.println(x.getCountry().getDisplayedName());
                }

            }else {
                printWriter.close();
            }
            printWriter.close();
            //implement this method - реализуйте этот метод
        }


        public void load(InputStream inputStream) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            while (bufferedReader.ready()) {
                User user = new User();
                user.setFirstName(bufferedReader.readLine());
                user.setLastName(bufferedReader.readLine());
                user.setBirthDate(new Date(Long.parseLong(bufferedReader.readLine())));
                user.setMale(Boolean.parseBoolean(bufferedReader.readLine()));
                String str = bufferedReader.readLine();
                if (str.equals("Ukraine")) { user.setCountry(User.Country.UKRAINE); }
                if (str.equals("Russia")) { user.setCountry(User.Country.RUSSIA); }
                if (str.equals("Other")) { user.setCountry(User.Country.OTHER);  }

                users.add(user);
            }
            bufferedReader.close();


            //implement this method - реализуйте этот метод
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
