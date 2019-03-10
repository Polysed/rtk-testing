package rtktest.web.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class TestDataClass extends Properties {

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
        order.setFio(data.getProperty("fio"));
        order.setStreet(data.getProperty("street"));
        order.setHouse(data.getProperty("house"));
        order.setApartment(data.getProperty("apartment"));
        order.setPhone( data.getProperty("phone"));
        order.setEmail(data.getProperty("email"));
        order.setComment(data.getProperty("comment"));
        return order;
    }

}
