package org.ses.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.HashMap;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    private String name;

    @Indexed(unique = true)
    private String emailAddress;
    private HashMap<String, String> contactDetails;
    private String specialty;

}
