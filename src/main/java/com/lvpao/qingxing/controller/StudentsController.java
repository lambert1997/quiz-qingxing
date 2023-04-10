package com.lvpao.qingxing.controller;

import com.lvpao.qingxing.domain.AjaxResult;
import com.lvpao.qingxing.domain.Students;
import com.lvpao.qingxing.page.TableDataInfo;
import com.lvpao.qingxing.service.IStudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学生基础方法Controller
 *
 * @author 张浩
 * @date 2023-04-10
 */
@Controller
@RequestMapping("/system/students")
public class StudentsController extends BaseController {
    private String prefix = "system/students";

    @Autowired
    private IStudentsService studentsService;

    /**
     * 将学生和班级建立关联
     *
     * @param studentId
     * @param classId
     * @return
     */
    @PostMapping("/{studentId}/class/{classId}")
    public int addStudentToClass(@PathVariable Integer studentId, @PathVariable Integer classId) {
        return studentsService.addStudentToClass(studentId, classId);
    }

    /**
     * 删除学生和班级的关联关系
     *
     * @param studentId
     * @return
     */
    @DeleteMapping("/{studentId}/class")
    public int removeStudentFromClass(@PathVariable Integer studentId) {
        return studentsService.removeStudentFromClass(studentId);

    }

    /**
     * 查询学生基础方法列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Students students) {
        startPage();
        List<Students> list = studentsService.selectStudentsList(students);
        return getDataTable(list);
    }


    /**
     * 新增保存学生基础方法
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Students students) {
        return toAjax(studentsService.insertStudents(students));
    }


    /**
     * 修改保存学生基础方法
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Students students) {
        return toAjax(studentsService.updateStudents(students));
    }

    /**
     * 删除学生基础方法
     */
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(studentsService.deleteStudentsByIds(ids));
    }
}
