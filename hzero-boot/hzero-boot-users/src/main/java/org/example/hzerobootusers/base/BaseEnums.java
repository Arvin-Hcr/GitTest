package org.example.hzerobootusers.base;

public enum BaseEnums implements BaseEnum<String, String> {


    SUCCESS("200", "成功"),
    FAILURE("200", "失败"),

    WEBFIND_SUCCESS("1", "查询成功"),
    WEBFIND_FAILURE("0", "查询失败");

    private String code;
    private String msg;


    BaseEnums(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public String msg() {
        return this.msg;
    }

    public String code() {
        return this.code;
    }

}
