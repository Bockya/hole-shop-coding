package day09.mail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
class MessageDTO {
    private String to, title, contetnt;


}
