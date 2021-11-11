package com.jc.addressBook.controller;

import com.jc.addressBook.AddressBookApplication;
import com.jc.addressBook.model.Entry;
import com.jc.addressBook.repository.AddressBookRepository;
import com.jc.addressBook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@Controller
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;
    @Autowired
    private AddressBookRepository addressBookRepository;


    @GetMapping("/")
    public String index() {
        return "addressBook/index";
    }

    @GetMapping("/addressBook")
    public String index(Entry Entry, Model model) {
        model.addAttribute("entries", addressBookRepository.findAll());
        return "addressBook/addressBook";
    }


    @PostMapping("/entries")
    public String addNewAddressBook(Entry entry, Model model) throws SQLException {
        System.out.println("Boolean result is = "+ addressBookService.emailExist(entry.getEmail()));
        if(addressBookService.emailExist(entry.getEmail())) {
            model.addAttribute("emailError", "That email already exist");
            return "addressBook/newEntry";
        }else{
            addressBookRepository.save(entry);
            model.addAttribute("firstName", entry.getFirstName());
            model.addAttribute("lastName", entry.getLastName());
            model.addAttribute("phoneNumber", entry.getPhoneNumber());
            model.addAttribute("email", entry.getEmail());
            return "addressBook/result";
        }

    }

    @GetMapping("/deleteAddressBookPage")
    public String deleteAddressBookPage(Entry entry) {
        return "addressBook/deleteAddressBookPage";
    }


    @GetMapping("/newEntry")
    public String newEntry(Entry entry) {
        return "addressBook/newEntry";
    }

    @GetMapping("/remove")
    public String remove(Entry entry) {
        return "addressBook/remove";
    }

    @GetMapping("/searchPage")
    public String searchPage(Entry entry) {
        return "addressBook/searchPage";
    }

    @GetMapping("/quitPage")
    public String quit(Entry entry) {
        return "addressBook/quitPage";
    }



    @RequestMapping("/searchEmail")
    public String findEntryByEmail(@RequestParam String email, Model model, Entry entry) {
        List<Entry> entriesList = addressBookService.findEntryByEmail(entry.getEmail());
        if(entriesList.isEmpty()){
            model.addAttribute("searchEmailMessage", "No entry was found with that value.");
            return "addressBook/searchPage";

        }else{
            model.addAttribute("searches", addressBookService.findEntryByEmail(entry.getEmail()));
            return "addressBook/resultByEmail";
        }
    }

//    @RequestMapping("/searchFirstName")
//    public String findEntryByFirstName(@RequestParam String firstName, Model model, Entry entry) {
//        model.addAttribute("searches", addressBookService.findEntryByFirstName(entry.getFirstName()));
//        return "addressBook/resultByFirstName";
//    }


    @RequestMapping("/searchFirstName")
    public String findEntryByFirstName(@RequestParam String firstName, Model model, Entry entry) {
        List<Entry> entriesList = addressBookService.findEntryByFirstName02(entry.getFirstName());
        if(entriesList.isEmpty()){
            model.addAttribute("searchFirstNameMessage", "No entry was found with that value.");
            return "addressBook/searchPage";
        }else{
            model.addAttribute("searches", addressBookService.findEntryByFirstName02(entry.getFirstName()));
            return "addressBook/resultByEmail";
        }
    }

    @RequestMapping("/searchLastName")
    public String findEntryByLastName(@RequestParam String lastName, Model model, Entry entry) {
        List<Entry> entriesList = addressBookService.findEntryByLastName(entry.getLastName());
        if(entriesList.isEmpty()){
            model.addAttribute("searchLastNameMessage", "No entry was found with that value.");
            return "addressBook/searchPage";
        }else{
            model.addAttribute("searches", addressBookService.findEntryByLastName(entry.getLastName()));
            return "addressBook/resultByEmail";
        }
    }

    @RequestMapping("/searchPhoneNumber")
    public String findEntryByPhoneNumber(@RequestParam String phoneNumber, Model model, Entry entry) {
        List<Entry> entriesList = addressBookService.findEntryByPhoneNumber(entry.getPhoneNumber());
        if(entriesList.isEmpty()){
            model.addAttribute("searchPhoneNumberMessage", "No entry was found with that value.");
            return "addressBook/searchPage";
        }else{
            model.addAttribute("searches", addressBookService.findEntryByPhoneNumber(entry.getPhoneNumber()));
            return "addressBook/resultByEmail";
        }
    }


    @RequestMapping("/removeEntry")
    public String removeEntry(@RequestParam String email, Model model, Entry entry) {
        model.addAttribute("searches", addressBookService.findEntryByEmail(entry.getEmail()));
        addressBookService.removeEntryByEmail(email);
        return "addressBook/removed";
    }


    @RequestMapping("/deleteAddressBook")
    public String deleteAddressBook(@RequestParam String password, Model model) throws SQLException {
        if(password.equals("123456789")) {
            addressBookService.deleteDB(password);
            return "addressBook/addressBookDeleted";
        }
        else{
            model.addAttribute("errorMessage", "Incorrect Password");
            return "addressBook/deleteAddressBookPage";
        }
    }


    @RequestMapping("/quitApp")
    public String quitApp(){
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(AddressBookApplication.class)
                .web(WebApplicationType.NONE).run();

        SpringApplication.exit(ctx, () -> 0);
        return "addressBook/quit";

    }



    @GetMapping("/entries/{id}")
    public String editEntryById(@PathVariable Long id, Entry entry, Model model) {
        model.addAttribute("entry", addressBookRepository.findById(id).orElseThrow());
        return "addressBook/edit";
    }


    @PostMapping("/entries/update/{id}")
    public String updateExistingEntry(@PathVariable Long id, Entry entry, Model model) {
        var actualEntry = addressBookRepository.findById(id).orElseThrow();
        actualEntry.setFirstName(entry.getFirstName());
        actualEntry.setLastName(entry.getLastName());
        actualEntry.setPhoneNumber(entry.getPhoneNumber());
        actualEntry.setEmail(entry.getEmail());
        addressBookRepository.save(actualEntry);
        model.addAttribute("firstName", actualEntry.getFirstName());
        model.addAttribute("lastName", actualEntry.getLastName());
        model.addAttribute("phoneNumber", actualEntry.getPhoneNumber());
        model.addAttribute("email", actualEntry.getEmail());
        return "addressBook/result";
    }

    @RequestMapping("/entries/remove/{id}")
    public String deleteEntryById(@PathVariable Long id, Entry entry, Model model) {
        addressBookRepository.deleteById(id);
        return "addressBook/removed";
    }

}
