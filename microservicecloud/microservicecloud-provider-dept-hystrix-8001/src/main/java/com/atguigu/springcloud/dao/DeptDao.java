package com.atguigu.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.atguigu.springcloud.entity.Dept;

@Mapper
public interface DeptDao {
    public boolean save(Dept dept);

    public boolean delete(Long deptno);

    public boolean update(Dept dept);

    public List<Dept> findAll();

    public Dept getOne(Long deptno);
}
