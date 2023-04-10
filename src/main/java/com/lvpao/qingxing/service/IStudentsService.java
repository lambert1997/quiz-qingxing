package com.lvpao.qingxing.service;

import java.util.List;

import com.lvpao.qingxing.domain.Students;

/**
 * 学生基础方法Service接口
 *
 * @author 张浩
 * @date 2023-04-10
 */
public interface IStudentsService {
    /**
     * 查询学生基础方法
     *
     * @param id 学生基础方法主键
     * @return 学生基础方法
     */
    public Students selectStudentsById(Long id);

    /**
     * 查询学生基础方法列表
     *
     * @param students 学生基础方法
     * @return 学生基础方法集合
     */
    public List<Students> selectStudentsList(Students students);

    /**
     * 新增学生基础方法
     *
     * @param students 学生基础方法
     * @return 结果
     */
    public int insertStudents(Students students);

    /**
     * 修改学生基础方法
     *
     * @param students 学生基础方法
     * @return 结果
     */
    public int updateStudents(Students students);

    int addStudentToClass(Integer studentId, Integer classId);

    int removeStudentFromClass(Integer studentId);

    /**
     * 批量删除学生基础方法
     *
     * @param ids 需要删除的学生基础方法主键集合
     * @return 结果
     */
    public int deleteStudentsByIds(String ids);

    /**
     * 删除学生基础方法信息
     *
     * @param id 学生基础方法主键
     * @return 结果
     */
    public int deleteStudentsById(Long id);
}
