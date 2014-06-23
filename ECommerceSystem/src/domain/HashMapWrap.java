package domain;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
public class HashMapWrap {

    //@XmlJavaTypeAdapter(MapAdapter.class)    
    HashMap<String, CartItem> CartMap;
/*
    public HashMap<String, CartItem> getBooks() {
        return mapProperty;
    }

    public void setBooks(HashMap<String, CartItem> map) {
        this.mapProperty = map;
    }
*/
}