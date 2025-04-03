package org.ses.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class MedicalRecord {
    @DBRef
    String id;
    String diagnosis;
    String treatment;
    Date date;
}
