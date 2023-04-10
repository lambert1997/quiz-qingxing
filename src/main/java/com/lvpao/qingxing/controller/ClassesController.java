package com.lvpao.qingxing.controller;

import com.lvpao.qingxing.domain.AjaxResult;
import com.lvpao.qingxing.domain.Classes;
import com.lvpao.qingxing.page.TableDataInfo;
import com.lvpao.qingxing.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 班级基础方法Controller
 *
 * @author 张浩
 * @date 2023-04-10
 */
@Controller
@RequestMapping("/system/classes")
public class ClassesController extends BaseController {
    private String prefix = "system/classes";

    @Autowired
    private IClassesService classesService;


    /**
     * 查询班级基础方法列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Classes classes) {
        startPage();
        List<Classes> list = classesService.selectClassesList(classes);
        return getDataTable(list);
    }


    /**
     * 新增保存班级基础方法
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Classes classes) {
        return toAjax(classesService.insertClasses(classes));
    }


    /**
     * 修改保存班级基础方法
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Classes classes) {
        return toAjax(classesService.updateClasses(classes));
    }

    /**
     * 删除班级基础方法
     */
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(classesService.deleteClassesByIds(ids));
    }
}
