package com.lvpao.qingxing.service;

import java.util.List;

import com.lvpao.qingxing.domain.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 班级基础方法Service接口
 *
 * @author 张浩
 * @date 2023-04-10
 */
public interface IClassesService {
    /**
     * 查询班级基础方法
     *
     * @param id 班级基础方法主键
     * @return 班级基础方法
     */
    public Classes selectClassesById(Long id);

    /**
     * 查询班级基础方法列表
     *
     * @param classes 班级基础方法
     * @return 班级基础方法集合
     */
    public List<Classes> selectClassesList(Classes classes);

    /**
     * 新增班级基础方法
     *
     * @param classes 班级基础方法
     * @return 结果
     */
    public int insertClasses(Classes classes);

    /**
     * 修改班级基础方法
     *
     * @param classes 班级基础方法
     * @return 结果
     */
    public int updateClasses(Classes classes);

    /**
     * 批量删除班级基础方法
     *
     * @param ids 需要删除的班级基础方法主键集合
     * @return 结果
     */
    public int deleteClassesByIds(String ids);

    /**
     * 删除班级基础方法信息
     *
     * @param id 班级基础方法主键
     * @return 结果
     */
    public int deleteClassesById(Long id);
}
