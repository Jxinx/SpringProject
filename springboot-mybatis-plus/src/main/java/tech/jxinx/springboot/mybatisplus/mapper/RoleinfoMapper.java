package tech.jxinx.springboot.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import tech.jxinx.springboot.mybatisplus.entity.RoleInfo;

// 在对应的Mapper上面继承基本的类 BaseMapper
@Repository // 代表持久层
public interface RoleinfoMapper extends BaseMapper<RoleInfo> {
    // 所有的CRUD操作都已经编写完成了
    // 你不需要像以前的配置一大堆文件了
}
