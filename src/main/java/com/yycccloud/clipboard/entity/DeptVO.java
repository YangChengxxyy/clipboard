package com.yycccloud.clipboard.entity;

public class DeptVO{

    private Integer id;
    private String deptName;

    // 自己实现的一个参数，用来给前端传递加密字符串
    private String encryptJson;

    public DeptVO(Integer id, String deptName, String encryptJson) {
        this.id = id;
        this.deptName = deptName;
        this.encryptJson = encryptJson;
    }

    public DeptVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getEncryptJson() {
        return encryptJson;
    }

    public void setEncryptJson(String encryptJson) {
        this.encryptJson = encryptJson;
    }
}