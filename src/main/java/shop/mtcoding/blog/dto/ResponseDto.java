package shop.mtcoding.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//전체 메개변수를 받는 생성자 생성
@AllArgsConstructor
@Getter
@Setter
public class ResponseDto<T> {
    private int code;
    private String msg;
    private T data;
}
