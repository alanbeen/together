/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables;


import com.huaxia.generated.Keys;
import com.huaxia.generated.Test;
import com.huaxia.generated.tables.records.UserGroupRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserGroup extends TableImpl<UserGroupRecord> {

    private static final long serialVersionUID = 905228807;

    /**
     * The reference instance of <code>test.user_group</code>
     */
    public static final UserGroup USER_GROUP = new UserGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserGroupRecord> getRecordType() {
        return UserGroupRecord.class;
    }

    /**
     * The column <code>test.user_group.user_group_id</code>.
     */
    public final TableField<UserGroupRecord, Integer> USER_GROUP_ID = createField("user_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.user_group.user_group_name</code>.
     */
    public final TableField<UserGroupRecord, String> USER_GROUP_NAME = createField("user_group_name", org.jooq.impl.SQLDataType.CHAR.length(50).nullable(false), this, "");

    /**
     * Create a <code>test.user_group</code> table reference
     */
    public UserGroup() {
        this("user_group", null);
    }

    /**
     * Create an aliased <code>test.user_group</code> table reference
     */
    public UserGroup(String alias) {
        this(alias, USER_GROUP);
    }

    private UserGroup(String alias, Table<UserGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserGroup(String alias, Table<UserGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserGroupRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserGroupRecord> getPrimaryKey() {
        return Keys.KEY_USER_GROUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<UserGroupRecord>>asList(Keys.KEY_USER_GROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroup as(String alias) {
        return new UserGroup(alias, this);
    }

    /**
     * Rename this table
     */
    public UserGroup rename(String name) {
        return new UserGroup(name, null);
    }
}