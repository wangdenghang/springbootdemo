package com.example.springbootdemo.base;

/**
 * {描述}
 *
 * @author: dhwang6
 * @date: 2018/8/10 16:59
 * @lastModified
 * @history
 */
public class ResultDto {

    public ResultDto() {
    }

    public ResultDto(Boolean flag, String code) {
        this.code = code;
        this.flag = flag;
    }

    public ResultDto(Boolean flag, String code, Object data) {
        this.code = code;
        this.flag = flag;
        this.data = data;
    }

    /**
     * 状态码
     */
    private String code;

    /**
     * 是否成功
     */
    private Boolean flag;

    /**
     * 数据
     */
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
