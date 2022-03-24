package com.cavalieri.noTasy.components;

import com.cavalieri.noTasy.entities.Patient;
import com.cavalieri.noTasy.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenEnhancer implements TokenEnhancer {

    @Autowired
    private PatientRepository patientRepository;


    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {

        Patient patient = patientRepository.findByEmail(oAuth2Authentication.getName());

        Map<String, Object> map = new HashMap<>();
        map.put("userFirstName", patient.getName());
        map.put("userId", patient.getId());

        DefaultOAuth2AccessToken token = (DefaultOAuth2AccessToken) oAuth2AccessToken;
        token.setAdditionalInformation(map);

        return oAuth2AccessToken;
    }
}
