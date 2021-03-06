package so.wwb.creditbox.schedule.init;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.soul.commons.log.Log;
import org.soul.commons.log.LogFactory;
import org.soul.commons.spring.utils.SpringTool;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import so.wwb.creditbox.model.enums.schedule.TaskSchedulerEnum;

/**
 * Created by longer on 8/20/15.
 * Spring上下文加载成功后
 */
@Component
public class SchedulerContextStopListener implements ApplicationListener<ContextStoppedEvent>,Ordered {
    public int getOrder() {
        return 9;
    }
    private static final Log LOG = LogFactory.getLog(SchedulerContextStopListener.class);
    //
    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        try {
            shutdownScheduler(TaskSchedulerEnum.GAME.getCode());
            LOG.info("关闭顺序:"+getOrder()+",停止--Game_Scheduler--服务成功！");
        } catch (Exception e) {
            LOG.error("关闭顺序:"+getOrder()+",停止--Game_Scheduler--服务失败！");
        }
    }
    /**
     * 关闭调度器.
     *      暂时针对彩票调度器做等待.
     * @throws Exception
     */
    private static void shutdownScheduler(String scheduleKey) throws Exception {
        if(!ServiceCtxLoaderListener.gameScheduleStart){
            LOG.info("{0} Schedule服务没有启动，无法停止", TaskSchedulerEnum.GAME.getCode().equals(scheduleKey)?"游戏":"");
            return;
        }
        long now = System.currentTimeMillis();
        LOG.info("关闭调度器:开始.......");
        try {
            Scheduler scheduler = (Scheduler) SpringTool.getBean(scheduleKey);
            if (scheduler != null && !scheduler.isShutdown()) {
                scheduler.shutdown(true);
                LOG.info("关闭调度器:{0}:完毕,耗时:{1}ms", scheduleKey, System.currentTimeMillis() - now);
            }
            if (TaskSchedulerEnum.GAME.getCode().equals(scheduleKey)) {
                ServiceCtxLoaderListener.gameScheduleStart = false;
            }
        } catch (SchedulerException e) {
            LOG.error(e, "关闭调度器:{0}:异常,耗时:{1}ms", scheduleKey, System.currentTimeMillis() - now);
        } catch (Exception e) {
            LOG.error(e, "关闭调度器:{0}:异常,耗时:{1}ms", scheduleKey, System.currentTimeMillis() - now);
        }
    }
}
