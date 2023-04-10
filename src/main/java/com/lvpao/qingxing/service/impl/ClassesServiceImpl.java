package com.lvpao.qingxing.service.impl;

import java.util.List;

import com.lvpao.qingxing.common.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lvpao.qingxing.mapper.ClassesMapper;
import com.lvpao.qingxing.domain.Classes;
import com.lvpao.qingxing.service.IClassesService;

/**
 * 班级基础方法Service业务层处理
 * 
 * @author 张浩
 * @date 2023-04-10
 */
@Service
public class ClassesServiceImpl implements IClassesService 
{
    @Autowired
    private ClassesMapper classesMapper;

    /**
     * 查询班级基础方法
     * 
     * @param id 班级基础方法主键
     * @return 班级基础方法
     */
    @Override
    public Classes selectClassesById(Long id)
    {
        return classesMapper.selectClassesById(id);
    }

    /**
     * 查询班级基础方法列表
     * 
     * @param classes 班级基础方法
     * @return 班级基础方法
     */
    @Override
    public List<Classes> selectClassesList(Classes classes)
    {
        return classesMapper.selectClassesList(classes);
    }

    /**
     * 新增班级基础方法
     * 
     * @param classes 班级基础方法
     * @return 结果
     */
    @Override
    public int insertClasses(Classes classes)
    {
        return classesMapper.insertClasses(classes);
    }

    /**
     * 修改班级基础方法
     * 
     * @param classes 班级基础方法
     * @return 结果
     */
    @Override
    public int updateClasses(Classes classes)
    {
        return classesMapper.updateClasses(classes);
    }

    /**
     * 批量删除班级基础方法
     * 
     * @param ids 需要删除的班级基础方法主键
     * @return 结果
     */
    @Override
    public int deleteClassesByIds(String ids)
    {
        return classesMapper.deleteClassesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除班级基础方法信息
     * 
     * @param id 班级基础方法主键
     * @return 结果
     */
    @Override
    public int deleteClassesById(Long id)
    {
        return classesMapper.deleteClassesById(id);
    }
}
