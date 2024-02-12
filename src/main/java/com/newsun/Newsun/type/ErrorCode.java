package com.newsun.Newsun.type;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {


    // 400 Invalid Argument Error
    MISSING_REQUEST_PARAMETER(40000, HttpStatus.BAD_REQUEST, "요청 파라미터 불일치 에러"),
    MISMATCH_PARAMETER_TYPE(40001, HttpStatus.BAD_REQUEST, "요청 파라미터 타입 에러"),
    BAD_REQUEST_BINDING_JSON(40002, HttpStatus.BAD_REQUEST, "요청한 JSON 바인딩 실패"),

    // 401 Unauthorized Error


    // 403 Forbidden Error


    // 404 not Found Error
    NOT_FOUND_END_POINT(40400, HttpStatus.NOT_FOUND, "존재하지 않는 End Point"),


    // 405 Method Not Allowed
    METHOD_NOT_ALLOWED_ERROR(40500, HttpStatus.METHOD_NOT_ALLOWED, "허용되지 않는 Method 에러"),

    // 500 Internal Server Error
    INTERNAL_SERVER_ERROR(500000, HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 에러");


    private final Integer code;
    private final HttpStatus status;
    private final String message;
}
