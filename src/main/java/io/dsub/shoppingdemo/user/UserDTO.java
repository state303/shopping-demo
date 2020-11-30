package io.dsub.shoppingdemo.user;

import io.dsub.shoppingdemo.enums.Gender;
import lombok.Builder;
import lombok.Data;

// DTOs are not usually separated into subclasses as the needs are more general.

@Data
@Builder
public class UserDTO {
    private String address;
    private String name;
    private String email;
    private Gender gender;
}
