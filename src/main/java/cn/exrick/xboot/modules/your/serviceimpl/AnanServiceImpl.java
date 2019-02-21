package cn.exrick.xboot.modules.your.serviceimpl;

import cn.exrick.xboot.modules.your.dao.AnanDao;
import cn.exrick.xboot.modules.your.entity.Anan;
import cn.exrick.xboot.modules.your.service.AnanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试接口实现
 * @author Exrick
 */
@Slf4j
@Service
@Transactional
public class AnanServiceImpl implements AnanService {

    @Autowired
    private AnanDao ananDao;

    @Override
    public AnanDao getRepository() {
        return ananDao;
    }
}