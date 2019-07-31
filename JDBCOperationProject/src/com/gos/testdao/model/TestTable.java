 package com.gos.testdao.model;

public class TestTable {

    private int column1;
    private String column2;
    private int column3;
    private String column4;


    public int getColumn1() {
        return column1;
    }

    public void setColumn1(int column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public int getColumn3() {
        return column3;
    }

    public void setColumn3(int column3) {
        this.column3 = column3;
    }

    public String getColumn4() {
        return column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4;
    }

    @Override
    public String toString() {
        return "TestTable{" +
                "column1=" + column1 +
                ", column2='" + column2 + '\'' +
                ", column3=" + column3 +
                ", column4='" + column4 + '\'' +
                '}';
    }
}