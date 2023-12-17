package com.ccst.endserver.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * @Author liufuping
 * @Date 2023/11/9 8:59
 * @Version 1.0
 */
@Data
@Component
@NoArgsConstructor
public class ResultVo<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<T> data;
    private Integer code;
    private String message;

    public ResultVo(Integer code, String message, List<T> data) {
        this.data = data;
        this.code = code;
        this.message = message;
    }
    public ResultVo(Integer code, String message) {
        this.code = code;
        this.message = message;
    }



    public static ResultVo ok(String msg){

        return new ResultVo(200,msg);
    }

    public static ResultVo ok(List data){
        return new ResultVo(200,"SUCCESS",data);
    }

    public static ResultVo failure(String msg){
        return new ResultVo(403,msg);
    }

    public static ResultVo failure(){
        return new ResultVo(403,"FAILURE");
    }

    public static ResultVo ok(){
        return new ResultVo(200,null);
    }

    public static ResultVo update(int count){
        String msg = count > 0 ? "SUCCESS" :"FAILURE";
        int code = count > 0 ? 200 : 500;
        return new ResultVo(code,msg);
    }

    public static ResultVo delete(int count){
        String msg = count > 0 ? "SUCCESS" :"FAILURE";
        int code = count > 0 ? 200 : 500;
        return new ResultVo(code,msg);
    }
}
