package com.lvpao.qingxing.domain;


/**
 * 班级基础方法对象 classes
 * 
 * @author 张浩
 * @date 2023-04-10
 */
public class Classes
{
    private static final long serialVersionUID = 1L;

    /** 班级ID */
    private Long id;

    /** 班级名称 */
    private String name;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

}
