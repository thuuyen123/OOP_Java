package bai8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOFile {
    String citiesFilePath = "src/bai8/cities.dat";
    String countriesFilePath = "src/bai8/countries.dat";
    public Map<Integer, City> citiesFileToMap() {
        Map<Integer, City> citiesMap = new HashMap<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(citiesFilePath));
            String line = br.readLine();
            Pattern pt = Pattern.compile("^City \\[id=(\\d+), name=(.*), population=(\\d+), countryCode=(\\w+)\\]");

            while (line != null) {
                Matcher m = pt.matcher(line);
                if (m.find()) {
                    int cityCode = Integer.parseInt(m.group(1));
                    String name = m.group(2);
                    int population = Integer.parseInt(m.group(3));
                    String countryCode = m.group(4);
                    citiesMap.put(cityCode, new City(cityCode, name, population, countryCode));
                } else {
                    System.out.println("no");
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return citiesMap;
    }

    public List<City> fileCityToList() {
        List<City> listCity = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(citiesFilePath));
            String line = br.readLine();
            while (line != null) {
                Pattern pt = Pattern.compile("^City \\[id=(\\d+), name=(.*), population=(\\d+), countryCode=(\\w+)\\]");
                Matcher m = pt.matcher(line);
                if (m.find()) {
                    int id = Integer.parseInt(m.group(1));
                    String name = m.group(2);
                    int population = Integer.parseInt(m.group(3));
                    String countryCode = m.group(4);
                    listCity.add(new City(id, name, population, countryCode));
                } else {
                    System.out.println("no");
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listCity;

    }

    public List<Country> fileCouToList() {
        int cout = 0;
        List<Country> listCountry = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(countriesFilePath));
            String line = br.readLine();
            Pattern pt = Pattern.compile("^Country\\{code=(\\w+), name=(.*), continent=(.*), surfaceArea=(.*), population=(\\d+), gnp=(\\d+\\.?\\d+), capital=(.*)}");
            Matcher m = pt.matcher(line);
            while (line != null) {
                if (m.find()) {
                    String countriesCode = m.group(1);
                    String name = m.group(2);
                    String continent = m.group(3);
                    double sufArea = Double.parseDouble(m.group(4));
                    int pol = Integer.parseInt(m.group(5));
                    double gnp = Double.parseDouble(m.group(6));
                    int capital = Integer.parseInt(m.group(7));
                    listCountry.add(new Country(countriesCode, name, continent, sufArea, pol, gnp, capital));

                } else {
                    System.out.println("Ngu si");
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listCountry;

    }
    public Map<String, Country> countriesFileToMap() {
        Map<String, Country> countries_Map = new HashMap<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(countriesFilePath));
            String line = br.readLine();
            Pattern pt = Pattern.compile("^Country\\{code=(\\w+), name=(.*), continent=(.*), surfaceArea=(.*), population=(\\d+), gnp=(\\d+\\.?\\d+), capital=(.*)}");

            while (line != null) {
                Matcher m = pt.matcher(line);
                if (m.find()) {
                    String co_code = m.group(1);
                    String name = m.group(2);
                    String continent = m.group(3);
                    double sufArea = Double.parseDouble(m.group(4));
                    int pol = Integer.parseInt(m.group(5));
                    double gnp = Double.parseDouble(m.group(6));
                    int capital = Integer.parseInt(m.group(7));
                    countries_Map.put(co_code ,new Country(co_code, name, continent, sufArea, pol, gnp, capital));
                } else {
                    System.out.println("Ngu si");
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return countries_Map;
    }



}
