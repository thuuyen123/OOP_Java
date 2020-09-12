package bai8;

import java.util.*;
import java.util.stream.Collectors;

public class QLDL {
    IOFile ioFile;

    public QLDL() {
        ioFile = new IOFile();
    }

    public static void main(String[] args) {
        QLDL ql = new QLDL();
        Map<Integer, City> citiesMap = ql.ioFile.citiesFileToMap();
        Map<String, Country> countriesMap = ql.ioFile.countriesFileToMap();
//        List<City> listcity = ql.ioFile.fileCityToList();
//        List<Country> listcou = ql.ioFile.fileCouToList();

//        listcity.stream()
//                .collect(Collectors.groupingBy(City::getCountryCode))
//                .values()
//                .stream()
//                .map(citiesOfACountry -> Collections.max(citiesOfACountry, Comparator.comparing(City::getPopulation)))
//                .forEach(System.out::println);

//        citiesMap.values()
//                .stream()
//                .collect(Collectors.groupingBy(city -> countriesMap.get(city.getCountryCode()).getContinent()))
//                .values()
//                .stream()
//                .map(citiesOfACountry -> Collections.max(citiesOfACountry, Comparator.comparing(City::getPopulation)))
//                .forEach(city -> {
//                    System.out.println("Continent: " + countriesMap.get(city.getCountryCode()).getContinent() + ", " + city);
//                });

//        Optional<City> op = countriesMap.values()
//                .stream()
//                .filter(country -> country.getCapital() != -1)
//                .map(country -> citiesMap.get(country.getCapital()))
//                .max(Comparator.comparing(City::getPopulation));
//
//        if(op.isPresent()){
//            City maxPopCap = op.get();
//            System.out.println(maxPopCap);
//        }
//        else System.out.println("Ko loi");

        countriesMap.values()
                .stream()
                .filter(country -> country.getCapital()!=-1)
                .map(country -> citiesMap.get(country.getCapital()))
                .collect(Collectors.groupingBy(city -> countriesMap.get(city.getCountryCode()).getContinent()))
                .values()
                .stream()
                .map(cities -> Collections.max(cities, Comparator.comparing(City::getPopulation)))
                .forEach(city -> {
                    System.out.println("Continent:" + countriesMap.get(city.getCountryCode()).getContinent()+ "City: "+ city );
                });

//        Set<String> set = new HashSet<>();
//        for (Country c : listcou) {
//            if (c.getCapital() > 0) {
//                set.add(c.getCode());
//            }
//        }
//        List<String> list_code = new ArrayList<>(set);
//
//        for (String str : list_code) {
//            String strnew = listcou.stream().filter(m -> m.getCode().equalsIgnoreCase(str)).findFirst().get().getName();
//            System.out.println("Thanh pho dong dan nhat quoc gia: " + strnew);
//            City cityMaxPopOfCou;
//            Optional<City> maxCityPop = listcity.stream().filter(s -> s.getCountryCode().equalsIgnoreCase(str))
//                    .max(Comparator.comparing(City::getPopulation));
//            if (maxCityPop.isPresent()) {
//                cityMaxPopOfCou = maxCityPop.get();
//                System.out.println(cityMaxPopOfCou);
//            }
//            parallel
//        }
//
//        List<String> list_continent = new ArrayList<>();
//        Set<String> setc = new HashSet<>();
//        for (Country c : listcou) {
//            if (c.getCapital() > 0) {
//                setc.add(c.getContinent());
//            }
//        }
//        list_continent.addAll(setc);
//
//        System.out.println();
//        System.out.println();
//        //danh sach quoc gia co cung dai luc
//        for (String str1 : list_continent) {
//            System.out.println("Thanh pho dong dan nhat moi luc dia: " + str1);
//            List<Country> listCnew = listcou.stream().
//                    filter(country -> country.getContinent().equalsIgnoreCase(str1))
//                    .collect(Collectors.toList());
//            //lay ma code cua cac quoc gia thuoc danh sach tren
//            Set<String> strcode = new HashSet<>();
//            for (Country c : listCnew) {
//                strcode.add(c.getCode());
//            }
//            List<String> listcodeCouofConti = new ArrayList<>();
//            listcodeCouofConti.addAll(strcode);
//
//            //danh sach cac thanh pho thuoc cac quoc gia co ma code trong ds tren
//            Set<City> temp = new HashSet<>();
//            List<City> listCityOfConti = new ArrayList<>();
//            for (String s : listcodeCouofConti) {
//                for (City c : listcity) {
//                    if (c.getCountryCode().equalsIgnoreCase(s)) {
//                        temp.add(c);
//                    }
//                }
//            }
//            listCityOfConti.addAll(temp);
//            //tim thanh pho dong nhat chau luc
//            City cityMaxCouti = listCityOfConti.stream().max(Comparator.comparing(City::getPopulation)).get();
//            System.out.println(cityMaxCouti);
//        }
//
//        List<Integer> list_capital = new ArrayList<>();
//        Set<Integer> temls = new HashSet<>();
    }

}
