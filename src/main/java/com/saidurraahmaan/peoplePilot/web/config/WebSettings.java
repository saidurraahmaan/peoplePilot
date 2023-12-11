package com.saidurraahmaan.peoplePilot.web.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class WebSettings {
    private final Locale defaultLocale;

    @Autowired
    public WebSettings(@Value("${app.defaultLanguage:english}") String defaultLanguage) {
        defaultLocale = defaultLanguage.equalsIgnoreCase("english") ? WebConstants.ENGLISH_LOCALE : WebConstants.BANGLA_LOCALE;
    }

    public Locale getDefaultLocale() {
        return defaultLocale;
    }
}
