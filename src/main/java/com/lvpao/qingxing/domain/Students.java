package com.lvpao.qingxing.domain;

/**
 * 学生基础方法对象 students
 *
 * @author 张浩
 * @date 2023-04-10
 */
public class Students {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 学号
     */
    private Long studentNumber;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别（M：男，F：女）
     */
    private String gender;

    /**
     * 年龄
     */
    private Long age;

    /**
     * 班级ID
     */
    private Long classId;

    /**
     * 籍贯
     */
    private String origin;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getAge() {
        return age;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

}
