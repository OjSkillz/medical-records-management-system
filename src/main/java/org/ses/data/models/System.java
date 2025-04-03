package org.ses.data.models;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class System {
    @DBRef
    Patient patient;
    @DBRef
    Doctor doctor;
}
