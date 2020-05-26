package com.wzy.service;

import com.wzy.dao.StuDAO;
import com.wzy.entity.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class StuServiceImpl implements StuService {

    @Autowired
    private StuDAO stuDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Stu> findAll() {
        return stuDAO.findAll();
    }


    @Override
    public void addStu(Stu stu) {
        stuDAO.addStu(stu);
    }

    @Override
    public void deleteStu(String id) {
        stuDAO.deleteStu(id);
    }

    @Override
    public void updateStu(Stu stu) {
        stuDAO.updateStu(stu);

    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Stu findStuById(String id) {
       return stuDAO.findStuById(id);
    }


}
