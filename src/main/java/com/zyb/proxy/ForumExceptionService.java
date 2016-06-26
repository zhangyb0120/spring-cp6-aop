package com.zyb.proxy;

import java.sql.SQLException;

/**
 * Created by zyb on 2016/6/26.
 */
public class ForumExceptionService {

    public void removeTopic(int topicId) {
        throw new RuntimeException("运行异常");
    }

    public void removeForum(int forumId) throws Exception {
        throw new SQLException("数据更新操作异常");
    }
}
