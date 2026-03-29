package com.example.mapper;

import com.example.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    // 我们所有的操作，在原来都是使用sqlsession来执行，现在使用SqlSessionTemplate
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
