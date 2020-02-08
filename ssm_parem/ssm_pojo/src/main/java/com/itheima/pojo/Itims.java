package com.itheima.pojo;

import java.io.Serializable;
import java.util.Date;

public class Itims implements Serializable {
    private Integer id;
    private String name;
    private Double price;
    private Integer pic;
    private Date createtime;
    private String detail;

    public Itims() {
    }

    public Itims(Integer id, String name, Double price, Integer pic, Date createtime, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pic = pic;
        this.createtime = createtime;
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPic() {
        return pic;
    }

    public void setPic(Integer pic) {
        this.pic = pic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Itims{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", pic=" + pic +
                ", createtime=" + createtime +
                ", detail='" + detail + '\'' +
                '}';
    }
}
