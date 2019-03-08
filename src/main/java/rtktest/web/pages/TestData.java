package rtktest.web.pages;

import jdk.jfr.Name;

public class TestData {
    public static final String FIO = "ФИО";
    public static final String STREET = "Улица";
    public static final String HOUSE = "Дом";
    public static final String APARTMENT = "Квартира";
    public static final String PHONE = "Телефон";
    public static final String EMAIL = "ЭлПочта";
    public static final String COMMENT = "Комментарий";

    public static String fio;
    public static String street;
    public static String house;
    public static String apartment;
    public static String phone;
    public static String email;
    public static String comment;

    @Name(value = FIO)
    public TestData getFio() {
        return this;
    }

    public static void setFio(String fio) {
        TestData.fio = fio;
    }

    @Name(value = STREET)
    public TestData getStreet() {
        return this;
    }

    public static void setStreet(String street) {
        TestData.street = street;
    }

    @Name(value = HOUSE)
    public TestData getHouse() {
        return this;
    }

    public static void setHouse(String house) {
        TestData.house = house;
    }

    @Name(value = APARTMENT)
    public TestData getApartment() {
        return this;
    }

    public static void setApartment(String apartment) {
        TestData.apartment = apartment;
    }

    @Name(value = PHONE)
    public TestData getPhone() {
        return this;
    }

        public static void setPhone(String phone) {
        TestData.phone = phone;
    }

    @Name(value = EMAIL)
    public TestData getEmail() {
        return this;
    }

    public static void setEmail(String email) {
        TestData.email = email;
    }

    @Name(value = COMMENT)
    public TestData getComment() {
        return this;
    }

    public static void setComment(String comment) {
        TestData.comment = comment;
    }
}