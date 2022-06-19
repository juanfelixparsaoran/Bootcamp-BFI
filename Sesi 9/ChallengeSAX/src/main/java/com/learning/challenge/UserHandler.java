package com.learning.challenge;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler{
    boolean cekFirstName = false, cekLastName = false;
    List<User> users = new ArrayList<>();
    private User user;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        // TODO Auto-generated method stub
        if ("user".equals(qName)){
            user = new User();

            int id = Integer.valueOf(attributes.getValue("id"));
            user.setId(id);
        }

        switch (qName){
            case "firstname":
                cekFirstName = true;
                break;
            case "lastname":
                cekLastName = true;
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        // TODO Auto-generated method stub
        if (cekFirstName){
            user.setFirstName(new String(ch,start,length));
            cekFirstName = false;
        }

        if (cekLastName){
            user.setLastName(new String(ch,start,length));
            cekLastName = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        // TODO Auto-generated method stub
        if ("user".equals(qName)){
            users.add(user);
        }

    }

    public List<User> getUsers() {
        return users;
    }
    
}
