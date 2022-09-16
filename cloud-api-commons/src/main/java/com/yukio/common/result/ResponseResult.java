package com.yukio.common.result;

import lombok.Data;

@Data
public class ResponseResult<T> {
    private Boolean success;
    private Integer code;
    private String msg;
    private T data;

    public ResponseResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult() {
    }

    public static ResponseResult ok(String msg) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setSuccess(true);
        responseResult.setCode(200);
        responseResult.setMsg(msg);
        return responseResult;
    }

    public ResponseResult message(String msg) {
        this.setMsg(msg);
        return this;
    }

    public static ResponseResult ok() {
        return ok("成功!");
    }


    public static ResponseResult fail(String msg) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setSuccess(false);
        responseResult.setCode(500);
        responseResult.setMsg(msg);
        return responseResult;
    }

    public static ResponseResult fail() {
        return fail("失败!");
    }

    public ResponseResult<T> data(T data) {
        this.setData(data);
        return this;
    }
}