package com.panyu.panyuprojectims.utils;

import java.util.List;

public class PageHelperUtil {
    //结果总数
    private long total;
    //结果行数
    private List<?> rows;

    public PageHelperUtil() {
        super();
    }

    public PageHelperUtil(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public List<?> getRows() {
        return rows;
    }
    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageHelperUtil{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
