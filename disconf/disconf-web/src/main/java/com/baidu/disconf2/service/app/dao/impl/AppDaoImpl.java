package com.baidu.disconf2.service.app.dao.impl;

import org.springframework.stereotype.Service;

import com.baidu.disconf2.service.app.bo.App;
import com.baidu.disconf2.service.app.dao.AppDao;
import com.baidu.dsp.common.dao.AbstractDao;
import com.baidu.dsp.common.dao.Columns;
import com.baidu.ub.common.generic.dao.operator.Match;

/**
 * 
 * @author liaoqiqi
 * @version 2014-6-16
 */
@Service
public class AppDaoImpl extends AbstractDao<Long, App> implements AppDao {

    @Override
    public App getByName(String name) {

        return findOne(new Match(Columns.NAME, name));
    }

}