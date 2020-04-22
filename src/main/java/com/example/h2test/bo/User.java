package com.example.h2test.bo;

/**
 * create by sunzhongwei on 2020/04/22
 * Desc:
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String sex;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", sex=" + sex + "]";
    }
}
//注：@Id ：声明被标注的属性与数据表的主键形成映射关系
//@GeneratedValue(strategy = GenerationType.IDENTITY)：声明主键的生成策略
//@Column：用来标识实体类中属性与数据表中字段的对应关系
//@Table：标注实体类，其name属性表示与实体类对应的表的名称，默认表明为实体类的名称

