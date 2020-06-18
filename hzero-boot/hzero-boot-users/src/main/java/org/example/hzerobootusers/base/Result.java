package org.example.hzerobootusers.base;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    private static final long serialVersionUID = 1430633339880116031L;

    private String code;
    private String msg;
    private Object data;

    public Result() {

    }

    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data=null;
    }

    public Result(BaseEnums baseEnums, Object data) {
        this.code = baseEnums.code();
        this.msg = baseEnums.msg();
        this.data = data;
    }

    public Result(BaseEnums baseEnums) {
        this.code = baseEnums.code();
        this.msg = baseEnums.msg();
        this.data=null;
    }

}
