package tech.jxinx.springboot.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.jxinx.springboot.mybatisplus.entity.RoleInfo;
import tech.jxinx.springboot.mybatisplus.mapper.RoleinfoMapper;

import java.util.List;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {

    @Autowired
    private RoleinfoMapper roleinfoMapper;

    @Test
    void contextLoads() {
        // 查询所有
        List<RoleInfo> roleInfos = roleinfoMapper.selectList(null);
        roleInfos.forEach(System.out::println);
    }

}
