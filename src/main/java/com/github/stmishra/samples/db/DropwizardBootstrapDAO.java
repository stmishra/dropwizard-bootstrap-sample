package com.github.stmishra.samples.db;

import com.google.common.collect.ImmutableList;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import javax.annotation.concurrent.Immutable;
import java.util.Map;

/**
 * Created by santoshm1 on 6/2/14.
 */
public interface DropwizardBootstrapDAO {

    @SqlUpdate("create table sample (id int primary key, name varchar(100), create_date date, update_date date, content text)")
    void createSampleTable();
    /*
    @SqlQuery("select * from sample")
    ImmutableList<Map<String, Object>> fetchAll();

    @SqlQuery("update sample set content = :content, update_date= date('now') where id = :id")
    void updateContent();

    @SqlQuery("select * from sample where create_date = :date")
    ImmutableList<Map<String, Object>> fetchByDate();

    @SqlQuery("select * from sample where id = :id")
    ImmutableList<Map<String, Object>> fetchById();

    @SqlQuery("insert into sample name, create_date, update_date, content values( :name, date('now'), date('now'), :content) ")
    void insertContent();*/

}