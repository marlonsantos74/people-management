package one.digitalinovation.personapi.entity;

import lombok.*;
import one.digitalinovation.personapi.enums.PhoneType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    private Long id;

    private PhoneType type;

    private String number;

    @Getter
    @AllArgsConstructor
    public enum PhoneType {
        HOME("Home"),
        MOBILE("Mobile"),
        COMMERCIAL("Commercial");

        private final String description;

    }
}
