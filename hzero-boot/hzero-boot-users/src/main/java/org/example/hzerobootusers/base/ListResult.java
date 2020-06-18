package org.example.hzerobootusers.base;


import lombok.Data;

import java.util.List;

@Data
public class ListResult {

    private List<? extends Object> data;
    private String code;
    private String msg;


    public ListResult(BaseEnums baseEnums, List<? extends Object> data) {
        this.code = baseEnums.code();
        this.msg = baseEnums.msg();
        this.data = data;
    }
}
