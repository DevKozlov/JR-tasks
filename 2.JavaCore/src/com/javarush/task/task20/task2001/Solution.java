package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("c:/temp/1.tmp", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            if (somePerson.equals(ivanov)) {
                System.out.println("Истина");
            } else {
                System.out.println("Ложь");
            }

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);

            String isNamePresent = name != null ? "yes" : "no";
            writer.println(isNamePresent);
            writer.flush();

            if (name != null)
                writer.println(name);

            String isAssetsPresent = assets.size() != 0 ? "yes" : "no";
            writer.println(isAssetsPresent);
            writer.flush();

            if (assets.size() != 0) {
                for (int i = 0; i < assets.size(); i++) {
                    if (assets.get(i) != null) {
                        writer.print(assets.get(i).getName() + " ");
                        writer.println(assets.get(i).getPrice());
                        writer.flush();
                    }
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            String[] stringArray;

            if (!reader.ready()) {
                return;
            }

            String isNamePresent = reader.readLine();
            if (isNamePresent.equals("yes")) {
                name = reader.readLine();
            }

            String isAssetsPresent = reader.readLine();
            if (isAssetsPresent.equals("yes")) {
                assets.clear();
                while(reader.ready()) {
                    line = reader.readLine();
                    stringArray = line.split(" ");
                    assets.add(new Asset(stringArray[0], Double.parseDouble(stringArray[1])));
                }
            }
            reader.close();
        }
    }
}
