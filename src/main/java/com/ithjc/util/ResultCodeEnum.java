package com.ithjc.util;

/**
 * @author 19407
 */
import lombok.Getter;

/**
 * 枚举类表示返回结果的代码和消息。
 */
@Getter // Lombok 提供的注解，用于所有字段生成getter方法
public enum ResultCodeEnum {

    SUCCESS(true, 200, "成功"),
    UNKNOWN_REASON(false, 20001, "未知错误"),
    BAD_SQL_GRAMMAR(false, 21001, "sql语法错误"),
    JSON_PARSE_ERROR(false, 21002, "json解析异常"),
    PARAM_ERROR(false, 21003, "参数不正确"),
    FILE_UPLOAD_ERROR(false, 21004, "文件上传错误"),
    EXCEL_DATA_IMPORT_ERROR(false, 21005, "Excel数据导入错误"),
    USERLOGIN_INVALID_ERROR(false, 21007, "登录信息过期，请重新登录"),
    USERUNLOGIN_ERROR(false, 21008, "用户未登录，请重新登录");

    private Boolean success;

    private Integer code;

    private String message;

    private ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }


    }
