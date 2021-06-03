package tech.jxinx.springboot.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Test
    void testSql() {
        // 查询所有
        Page<RoleInfo> roleInfoPage = new Page<>();
        roleInfoPage.setCurrent(1);
        roleInfoPage.setSize(3);

        roleinfoMapper.selectPage(roleInfoPage, null);

        // 总记录数
        System.out.println("roleInfoPage.getTotal() = " + roleInfoPage.getTotal());
        // 总页数
        System.out.println("roleInfoPage.getPages() = " + roleInfoPage.getPages());

        // 数据列表
        List<RoleInfo> records = roleInfoPage.getRecords();
        records.forEach(System.out::println);
    }

}
