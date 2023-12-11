package com.saidurraahmaan.peoplePilot.web.utils;

import com.saidurraahmaan.peoplePilot.domain.exceptions.ServiceException;
import com.saidurraahmaan.peoplePilot.web.config.WebSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class CommonUtils {
    private final MessageSource messageSource;
    private final WebSettings webSettings;

    @Autowired
    public CommonUtils(MessageSource messageSource, WebSettings settings) {
        this.messageSource = messageSource;
        this.webSettings = settings;
    }

    public String getLocalizedMessage(Locale locale, String key, String defaultMessage, Object[] parameters) {
        if (locale == null) {
            return messageSource.getMessage(key, parameters, defaultMessage, webSettings.getDefaultLocale());
        }

        return messageSource.getMessage(key, parameters, defaultMessage, locale);
    }

    public String getLocalizedMessage(String key, Object... parameters) {
        return getLocalizedMessage(LocaleContextHolder.getLocale(), key, key, parameters);
    }

    public String getLocalizedMessage(ServiceException exception, Locale locale) {
        return getLocalizedMessage(locale, "error.%d".formatted(exception.errorCode.value), exception.errorCode.toString(), exception.args);
    }

    public String getLocalizedMessage(ServiceException exception) {
        return getLocalizedMessage(exception, LocaleContextHolder.getLocale());
    }
}
