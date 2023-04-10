package com.lvpao.qingxing.mapper;

import java.util.List;
import com.lvpao.qingxing.domain.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 班级基础方法Mapper接口
 * 
 * @author 张浩
 * @date 2023-04-10
 */
@Mapper
@Component
public interface ClassesMapper 
{
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
     * 删除班级基础方法
     * 
     * @param id 班级基础方法主键
     * @return 结果
     */
    public int deleteClassesById(Long id);

    /**
     * 批量删除班级基础方法
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteClassesByIds(String[] ids);
}
