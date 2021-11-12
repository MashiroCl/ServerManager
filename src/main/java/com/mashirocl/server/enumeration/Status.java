package com.mashirocl.server.enumeration;

/**
 * @author mashirocl@gmail.com
 * @since 2021/11/10 15:44
 */
public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER DOWN");

    private final String status;

    Status(String status){
        this.status = status;
    }
}
