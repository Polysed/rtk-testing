package rtktest.web.classes;

public class OrderDataClass {
//    public static final String FIO = "ФИО";
//    public static final String STREET = "Улица";
//    public static final String HOUSE = "Дом";
//    public static final String APARTMENT = "Квартира";
//    public static final String PHONE = "Телефон";
//    public static final String EMAIL = "ЭлПочта";
//    public static final String COMMENT = "Комментарий";

    public String fio;
    public String street;
    public String house;
    public String apartment;
    public String phone;
    public String email;
    public String comment;

//    @Name(value = FIO)
    public String getFio() {
        return this.fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

//    @Name(value = STREET)
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

//    @Name(value = HOUSE)
    public String getHouse() {
        return this.house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

//    @Name(value = APARTMENT)
    public String getApartment() {
        return this.apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

//    @Name(value = PHONE)
    public String getPhone() {
        return this.phone;
    }

        public void setPhone(String phone) {
        this.phone = phone;
    }

//    @Name(value = EMAIL)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Name(value = COMMENT)
    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public OrderDataClass getData (String fio, String street, String house, String apartment, String phone, String email, String comment){
       OrderDataClass order = new OrderDataClass();
       order.setFio(fio);
       order.setStreet(street);
       order.setHouse(house);
       order.setApartment(apartment);
       order.setPhone(phone);
       order.setEmail(email);
       order.setComment(comment);

       return order;
    }
}