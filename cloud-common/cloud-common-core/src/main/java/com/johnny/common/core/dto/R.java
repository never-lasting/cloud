package com.johnny.common.core.dto;

import com.johnny.common.core.constant.ReturnCodeEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author wjq
 * date:  2019/6/30 23:42
 * description: rest接口返回对象
 **/
@Getter
@Setter
public class R<T> implements Serializable {

    private static final long serialVersionUID = 1471788053045133959L;

    private String message;
    private String code;
    private T data;

    public R() {
    }

    public R(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> R<T> build(ReturnCodeEnum returnCodeEnum, T data) {
        return new R<>(returnCodeEnum.getCode(), returnCodeEnum.getMessage(), data);
    }

    public static <T> R<T> buildSuccess(T data) {
        return build(ReturnCodeEnum.SUCCESS, data);
    }

    public static <T> R<T> buildFail(ReturnCodeEnum returnCodeEnum) {
        return build(returnCodeEnum, null);
    }

    public static <T> R<T> buildFail(String message) {
        return new R<>(null, message, null);
    }

    public static <T> R<T> buildFail(String code, String message) {
        return new R<>(code, message, null);
    }

    public static boolean isSuccess(R r){
        return ReturnCodeEnum.SUCCESS.getCode().equals(r.code);
    }

    public static boolean isFail(R r){
        return !isSuccess(r);
    }

}
