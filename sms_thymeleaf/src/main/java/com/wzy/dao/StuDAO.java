package com.wzy.dao;

import com.wzy.entity.Stu;
import java.util.List;

public interface StuDAO {

    List<Stu> findAll();  //List是什么？暂时存疑

    void addStu(Stu stu);
    void deleteStu(String id);
    void updateStu(Stu stu);
    Stu findStuById(String id);
}
