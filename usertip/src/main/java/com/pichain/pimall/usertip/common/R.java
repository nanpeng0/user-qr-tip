package com.pichain.pimall.usertip.common;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

import static com.pichain.pimall.usertip.common.ReturnMsg.common.FAIL_CODE;
import static com.pichain.pimall.usertip.common.ReturnMsg.common.SUCCESS_CODE;


@Data
public class R implements Serializable {
    String code;
    String msg;
    Object object;
    Long totalPage;
    Integer currentPage;
    Long totalNumber;

    public R(String code) {
        this.code = code;
    }


    public R(String code, String msg) {
        this.code = code;
        this.msg = msg;

    }

    public R(String code, String msg, Object object) {
        this.code = code;
        this.msg = msg;
        this.object = object;
    }

    public R(String code, String msg, Object object, Long totalPage, Integer currentPage, Long totalNumber) {
        this.code = code;
        this.msg = msg;
        this.object = object;
        this.totalPage = totalPage;
        this.currentPage = currentPage;
        this.totalNumber = totalNumber;
    }

    public R(String code, String msg, Object object, Long totalNumber) {
        this.code = code;
        this.msg = msg;
        this.object = object;
        this.totalNumber = totalNumber;
    }

    public boolean isSuccess() {
        return Objects.equals(this.code, SUCCESS_CODE);
    }


    public static R fail(String msg) {
        return new R(FAIL_CODE, msg);
    }

    public static R fail(String msg, Object obj) {
        return new R(FAIL_CODE, msg, obj);
    }

    public static R success(Object object) {
        return new R(SUCCESS_CODE, null, object);
    }

}


