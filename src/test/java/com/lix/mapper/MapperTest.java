package com.lix.mapper;

import com.lix.entity.College;
import com.lix.util.MyMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/exam-dao.xml")
public class MapperTest {
    @Autowired
    private SqlSession sqlSession;

    @Autowired
    private CollegeMapper collegeMapper;

    @Test
    public void test() {
        CollegeMapper mapper = sqlSession.getMapper(CollegeMapper.class);

        Assert.assertNotNull(mapper);

        List<College> c = mapper.selectAll();
        System.out.println(c.get(1).getCollegename());

    }

    @Test
    public void test2() {
        College college = collegeMapper.selectByPrimaryKey(2);
        System.out.println(college.getCollegename());
    }
}
