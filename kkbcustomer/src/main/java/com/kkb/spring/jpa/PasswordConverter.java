package com.kkb.spring.jpa;

import javax.persistence.AttributeConverter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordConverter implements AttributeConverter<String, String> {

    private final BCryptPasswordEncoder bEncoder = new BCryptPasswordEncoder();

    public PasswordConverter() {
    }

    @Override
    public String convertToDatabaseColumn(final String attributeParam) {
        return this.bEncoder.encode(attributeParam);
    }

    @Override
    public String convertToEntityAttribute(final String dbDataParam) {
        return dbDataParam;
    }

}
