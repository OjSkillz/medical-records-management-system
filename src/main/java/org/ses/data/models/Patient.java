package org.ses.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Indexed(unique = true)
    @Id
    private String id;
    private String name;
    private String dateOfBirth;
    private Gender gender;
    private HashMap<String, String> medicalHistory;

}
