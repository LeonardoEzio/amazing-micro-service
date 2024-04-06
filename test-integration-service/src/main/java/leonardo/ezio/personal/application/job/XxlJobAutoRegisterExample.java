package leonardo.ezio.personal.application.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import leonardo.ezio.personal.job.annotation.AutoRegisterJob;
import leonardo.ezio.personal.job.annotation.JobInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * xxl-job 自注册示例
 * @author LeonardoEzio
 * @version v1.0.0 create at 2024-04-06 10:46
 */
@AutoRegisterJob
public class XxlJobAutoRegisterExample {

    private final static Logger LOGGER = LoggerFactory.getLogger(XxlJobAutoRegisterExample.class);

    @XxlJob("demoAutoRegisterJobHandler")
    @JobInfo(desc = "自动组测任务演示", corn = "0/1 * * * * ?")
    public ReturnT<String> demoAutoRegisterJobHandler(String param) throws Exception {
        LOGGER.info("XxlJobAutoRegisterExample demoAutoRegisterJobHandler Execute .....");
        return ReturnT.SUCCESS;
    }

}
