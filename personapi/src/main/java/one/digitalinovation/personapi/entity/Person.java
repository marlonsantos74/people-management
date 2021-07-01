package one.digitalinovation.personapi.entity;


import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Long id;

    private String firstName;

    private String lastName;

    private String cpf;

    private LocalDate birthDate;

    private List<Phone> phones;

}
