package com.jc.addressBook.repository;

import com.jc.addressBook.model.Entry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressBookRepository extends CrudRepository<Entry, Long> {

    List<Entry> findByEmail(String email);
    List<Entry> findByFirstName(String firstName);
    List<Entry> findByLastName(String lastName);
    List<Entry> findByPhoneNumber(String phoneNumber);
    void deleteByEmail(String email);

}



