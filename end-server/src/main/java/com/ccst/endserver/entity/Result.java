package com.ccst.endserver.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author liufuping
 * @Date 2023/11/9 8:59
 * @Version 1.0
 */
@Data
@Component
@NoArgsConstructor
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;
    private Object data;
    private Integer code;
    private String message;

    public Result(Integer code, String message, Object data) {
        this.data = data;
        this.code = code;
        this.message = message;
    }
    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }



    public static Result ok(String msg){

        return new Result(200,msg);
    }

    public static Result ok(Object data){
        return new Result(200,"SUCCESS",data);
    }

    public static Result failure(String msg){
        return new Result(403,msg);
    }

    public static Result failure(){
        return new Result(403,"FAILURE");
    }

    public static Result ok(){
        return new Result(200,null);
    }

    public static Result update(int count){
        String msg = count > 0 ? "SUCCESS" :"FAILURE";
        int code = count > 0 ? 200 : 500;
        return new Result(code,msg);
    }

    public static Result delete(int count){
        String msg = count > 0 ? "SUCCESS" :"FAILURE";
        int code = count > 0 ? 200 : 500;
        return new Result(code,msg);
    }
}
