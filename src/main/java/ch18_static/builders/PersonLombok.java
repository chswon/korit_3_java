package ch18_static.builders;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class PersonLombok {
    private String name;
    private int age;
    private String address;
}
