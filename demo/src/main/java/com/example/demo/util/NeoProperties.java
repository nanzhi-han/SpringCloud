package com.example.demo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: SJH
 * @ClassName: NeoProperties
 * @Description:
 */
@Component
public class NeoProperties {
    @Value("${com.neo.title}")
    private String titlte;
    @Value("${com.neo.description}")
    private String description;

    public NeoProperties() {
    }

    public String getTitlte() {
        return titlte;
    }

    public void setTitlte(String titlte) {
        this.titlte = titlte;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
