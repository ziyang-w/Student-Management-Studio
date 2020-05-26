package com.wzy.service;

import com.wzy.entity.Stu;

import java.util.List;

public interface StuService {
    List<Stu> findAll();

    void addStu(Stu stu);
    void deleteStu(String id);
    void updateStu(Stu stu);
    Stu findStuById(String id);

}
