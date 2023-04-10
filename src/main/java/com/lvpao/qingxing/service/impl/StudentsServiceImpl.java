package com.lvpao.qingxing.service.impl;

import java.util.List;

import com.lvpao.qingxing.common.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvpao.qingxing.mapper.StudentsMapper;
import com.lvpao.qingxing.domain.Students;
import com.lvpao.qingxing.service.IStudentsService;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 学生基础方法Service业务层处理
 *
 * @author 张浩
 * @date 2023-04-10
 */
@Service
public class StudentsServiceImpl implements IStudentsService {
    @Autowired
    private StudentsMapper studentsMapper;

    /**
     * 查询学生基础方法
     *
     * @param id 学生基础方法主键
     * @return 学生基础方法
     */
    @Override
    public Students selectStudentsById(Long id) {
        return studentsMapper.selectStudentsById(id);
    }

    /**
     * 查询学生基础方法列表
     *
     * @param students 学生基础方法
     * @return 学生基础方法
     */
    @Override
    public List<Students> selectStudentsList(Students students) {
        return studentsMapper.selectStudentsList(students);
    }

    /**
     * 新增学生基础方法
     *
     * @param students 学生基础方法
     * @return 结果
     */
    @Override
    public int insertStudents(Students students) {
        return studentsMapper.insertStudents(students);
    }

    /**
     * 修改学生基础方法
     *
     * @param students 学生基础方法
     * @return 结果
     */
    @Override
    public int updateStudents(Students students) {
        return studentsMapper.updateStudents(students);
    }

    /**
     * 将学生和班级建立关联
     *
     * @param studentId
     * @param classId
     * @return
     */
    public int addStudentToClass(Integer studentId, Integer classId) {
        Students student = selectStudentsById(Long.valueOf(studentId));
        student.setClassId((long) classId);
        return studentsMapper.updateStudents(student);
    }

    public int removeStudentFromClass(Integer studentId) {
        Students student = selectStudentsById(Long.valueOf(studentId));
        student.setClassId(null);
        return studentsMapper.updateStudents(student);
    }

    /**
     * 批量删除学生基础方法
     *
     * @param ids 需要删除的学生基础方法主键
     * @return 结果
     */
    @Override
    public int deleteStudentsByIds(String ids) {
        return studentsMapper.deleteStudentsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生基础方法信息
     *
     * @param id 学生基础方法主键
     * @return 结果
     */
    @Override
    public int deleteStudentsById(Long id) {
        return studentsMapper.deleteStudentsById(id);
    }
}
