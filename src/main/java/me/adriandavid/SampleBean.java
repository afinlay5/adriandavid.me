package me.adriandavid;

import javax.inject.Named;
import javax.enterprise.context.*;

@Named(value = "RastaManBean")
@RequestScoped
public class SampleBean {
    private String name = "Tafari Makonen";
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}