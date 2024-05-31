package com.hunter.task.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hunter.task.dao.TaskMapper;
import com.hunter.task.service.TaskService;
import com.hunter.task.pojo.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
/****
 * @Author:shenkunlin
 * @Description:Task业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;


    /**
     * Task条件+分页查询
     * @param task 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<Task> findPage(Task task, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(task);
        //执行搜索
        return new PageInfo<Task>(taskMapper.selectByExample(example));
    }

    /**
     * Task分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<Task> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<Task>(taskMapper.selectAll());
    }

    /**
     * Task条件查询
     * @param task
     * @return
     */
    @Override
    public List<Task> findList(Task task){
        //构建查询条件
        Example example = createExample(task);
        //根据构建的条件查询数据
        return taskMapper.selectByExample(example);
    }


    /**
     * Task构建查询对象
     * @param task
     * @return
     */
    public Example createExample(Task task){
        Example example=new Example(Task.class);
        Example.Criteria criteria = example.createCriteria();
        if(task!=null){
            // id
            if(!StringUtils.isEmpty(task.getId())){
                    criteria.andEqualTo("id",task.getId());
            }
            // 发起人id
            if(!StringUtils.isEmpty(task.getSponsorId())){
                    criteria.andEqualTo("sponsorId",task.getSponsorId());
            }
            // 类型
            if(!StringUtils.isEmpty(task.getType())){
                    criteria.andEqualTo("type",task.getType());
            }
            // 内容
            if(!StringUtils.isEmpty(task.getContent())){
                    criteria.andEqualTo("content",task.getContent());
            }
            // 联系方式
            if(!StringUtils.isEmpty(task.getContact())){
                    criteria.andEqualTo("contact",task.getContact());
            }
            // 价格
            if(!StringUtils.isEmpty(task.getMoney())){
                    criteria.andEqualTo("money",task.getMoney());
            }
            // 是否已被接收
            if(!StringUtils.isEmpty(task.getIsAccepted())){
                    criteria.andEqualTo("isAccepted",task.getIsAccepted());
            }
            // 
            if(!StringUtils.isEmpty(task.getSponserTime())){
                    criteria.andEqualTo("sponserTime",task.getSponserTime());
            }
        }
        return example;
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(Integer id){
        taskMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改Task
     * @param task
     */
    @Override
    public void update(Task task){
        taskMapper.updateByPrimaryKey(task);
    }

    /**
     * 增加Task
     * @param task
     */
    @Override
    public void add(Task task){
        taskMapper.insert(task);
    }

    /**
     * 根据ID查询Task
     * @param id
     * @return
     */
    @Override
    public Task findById(Integer id){
        return  taskMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询Task全部数据
     * @return
     */
    @Override
    public List<Task> findAll() {
        return taskMapper.selectAll();
    }
}
