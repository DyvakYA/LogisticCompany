package com.dyvak.main.model.entity.impl;

import com.dyvak.main.model.entity.Certificate;
import com.dyvak.main.model.entity.enums.CertificateType;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class DriverCertificate implements Certificate {

    @Id
    private int id;
    private CertificateType type;

}
