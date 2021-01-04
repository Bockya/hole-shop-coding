package day09.bmi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
class PersonData { //DTO
    private String name;
    private double height, weight;

}
