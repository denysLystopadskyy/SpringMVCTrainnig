package com.luv2code.springdemo.mvc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by denys.lystopadskyy on 8/3/2017.
 */
public class Student {

    private String firstName;

    private String lastName;

    private String country;

    private String programmingLanguage;

    private HashMap<String, String> countries;

    private Map<String, String> progLanguages;

    public List<String> getOs() {
        return os;
    }

    public void setOs(List<String> os) {
        this.os = os;
    }

    private List<String> os;

    public Student() {
        countries = new HashMap<>();

        countries.put("BR", "Brazil");
        countries.put("FR", "France");
        countries.put("DE", "Germany");
        countries.put("IN", "India");
        countries.put("UA", "Ukraine");
        countries.put("Ukraine", "UA");

        progLanguages = new TreeMap();

        progLanguages.put("Java", "Java");
        progLanguages.put("JS", "JS");
        progLanguages.put("Swift", "Swift");
        progLanguages.put("C++", "C++");
        progLanguages.put("Python", "Python");
    }

    public Map<String, String> getProgLanguages() {
        return progLanguages;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap<String, String> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", countries=" + countries +
                ", progLanguages=" + progLanguages +
                ", os=" + os +
                '}';
    }
}
