package org.example;

import lombok.*;

import java.time.LocalDate;



@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Person {
    private String name;
    private String lastName;
    private String document;
    private String email;
    private String nickname;
    private LocalDate birthdate;
}
