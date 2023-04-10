package com.lvpao.qingxing.mapper;

import java.util.List;
import com.lvpao.qingxing.domain.Students;
import org.springframework.stereotype.Component;

/**
 * 学生基础方法Mapper接口
 * 
 * @author 张浩
 * @date 2023-04-10
 */
@Component
public interface StudentsMapper 
{
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

    /**
     * 删除学生基础方法
     * 
     * @param id 学生基础方法主键
     * @return 结果
     */
    public int deleteStudentsById(Long id);

    /**
     * 批量删除学生基础方法
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStudentsByIds(String[] ids);
}
