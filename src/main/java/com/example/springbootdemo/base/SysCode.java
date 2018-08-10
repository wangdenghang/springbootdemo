package com.example.springbootdemo.base;

/**
 * {描述}
 *
 * @author: dhwang6
 * @date: 2018/8/10 17:07
 * @lastModified
 * @history
 */
public class SysCode {

    /**
     * 返回状态码
     */
    public static enum RETURN_CODE {

        /**
         * 000000-成功
         */
        SUCCESS("000000", "成功"),

        /**
         * 999999-失败
         */
        FAIL("999999", "失败");

        private RETURN_CODE(String code, String message) {
            this.code = code;
            this.message = message;
        }

        private String code;

        private String message;

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }
}
