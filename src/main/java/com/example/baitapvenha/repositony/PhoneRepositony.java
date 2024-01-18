package com.example.baitapvenha.repositony;

import com.example.baitapvenha.model.Phone;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PhoneRepositony {
    List<Phone> phoneList = new ArrayList<>();
    public PhoneRepositony(){
        Phone phone1 = new Phone("Iphone X", 10);
        Phone phone2 = new Phone("Iphone 11", 11);
        Phone phone3 = new Phone("Iphone 12", 12);

        phoneList.add(phone1);
        phoneList.add(phone2);
    }

    public List<Phone> getAllPhone() {
        return phoneList;
    }
    public void createPhone(Phone phone) {
        phoneList.add(phone);
    }
}
