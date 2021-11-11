package com.jc.addressBook.service;

import com.jc.addressBook.model.Entry;
import com.jc.addressBook.repository.AddressBookRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService {

    AddressBookRepository addressBookRepository;

    public AddressBookService(AddressBookRepository addressBookRepository) {
        this.addressBookRepository = addressBookRepository;
    }

    public List<Entry> findEntryByEmail(String email) {
        List<Entry> entries = addressBookRepository.findByEmail(email);
        return entries;
    }

    public List<Entry> findEntryByFirstName(String firstName){
        List<Entry> entries  = addressBookRepository.findByFirstName(firstName);
        return entries;
    }

    public List<Entry> findEntryByLastName(String lastName){
        List<Entry> entries  = addressBookRepository.findByLastName(lastName);
        return entries;
    }

    public List<Entry> findEntryByPhoneNumber(String phoneNumber){
        List<Entry> entries  = addressBookRepository.findByPhoneNumber(phoneNumber);
        return entries;
    }


    @Modifying
    @Transactional
    public void removeEntryByEmail(String email){
        addressBookRepository.deleteByEmail(email);
    }


    public void deleteDB(String password) throws SQLException {
        Statement stmt;
        Connection conn;
        conn = DriverManager.getConnection("jdbc:h2:~/data/AddressBook");
        stmt = conn.createStatement();
        String sql =  "TRUNCATE TABLE entry";
        stmt.executeUpdate(sql);
    }


    public boolean emailExist(String email) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:~/data/AddressBook");
        PreparedStatement pst = conn.prepareStatement("Select email from entry where email=?");
        pst.setString(1, email);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            return true;
        }
        else{
            return false;
        }
    }



    public List<Entry> findEntryByFirstName02(String firstNameStr){
        List<Entry> entries  = (List<Entry>) addressBookRepository.findAll();
        List<Entry> entries02 = new ArrayList<Entry>();
        for(Entry entry : entries) {
            if (entry.getFirstName().startsWith(firstNameStr)) {
                entries02.add(entry);
            }
        }
        return entries02;
    }


}
