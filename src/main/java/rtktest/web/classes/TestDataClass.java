package rtktest.web.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class TestDataClass extends Properties {
//    public static String fio;
//    public static String street;
//    public static String house;
//    public static String apartment;
//    public static String phone;
//    public static String email;
//    public static String comment;
//
//    public TestDataClass getData (String fio, String street, String house, String apartment, String phone, String email, String comment){
//        return this;
//    }
    public OrderDataClass makeOrderData () throws IOException {
        TestDataClass newOrderData = null;
        FileInputStream orderData = null;
        InputStreamReader reader = null;
        Properties data = new Properties();
        try {
            orderData = new FileInputStream("C:\\Projects\\rtk-test-project\\testData.ini");
            reader = new InputStreamReader(orderData, "UTF-8");
            data.load(reader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        OrderDataClass order = new OrderDataClass();
//        data1.setProperty("fio", data.getProperty("fio"));
        order.setFio(data.getProperty("fio"));
        order.setStreet(data.getProperty("street"));
        order.setHouse(data.getProperty("house"));
        order.setApartment(data.getProperty("apartment"));
        order.setPhone( data.getProperty("phone"));
        order.setEmail(data.getProperty("email"));
        order.setComment(data.getProperty("comment"));
//        data1.getData(data.getProperty("fio"),
//                data.getProperty("street"),
//                data.getProperty("house"),
//                data.getProperty("apartment"),
//                data.getProperty("phone"),
//                data.getProperty("email"),
//                data.getProperty("comment"));

//        newOrderData.setProperty("fio", data.getProperty("fio"));
//        newOrderData.setProperty("street", data.getProperty("street"));
//        newOrderData.setProperty("house", data.getProperty("house"));
//        newOrderData.setProperty("apartment", data.getProperty("apartment"));
//        newOrderData.setProperty("phone", data.getProperty("phone"));
//        newOrderData.setProperty("email", data.getProperty("email"));
//        newOrderData.setProperty("comment", data.getProperty("comment"));
        return order;
    }

}
