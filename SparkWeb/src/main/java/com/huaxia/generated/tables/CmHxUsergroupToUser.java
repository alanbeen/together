/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables;


import com.huaxia.generated.Keys;
import com.huaxia.generated.Test;
import com.huaxia.generated.tables.records.CmHxUsergroupToUserRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class CmHxUsergroupToUser extends TableImpl<CmHxUsergroupToUserRecord> {

    private static final long serialVersionUID = -182300682;

    /**
     * The reference instance of <code>test.cm_hx_usergroup_to_user</code>
     */
    public static final CmHxUsergroupToUser CM_HX_USERGROUP_TO_USER = new CmHxUsergroupToUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmHxUsergroupToUserRecord> getRecordType() {
        return CmHxUsergroupToUserRecord.class;
    }

    /**
     * The column <code>test.cm_hx_usergroup_to_user.user_group_id</code>.
     */
    public final TableField<CmHxUsergroupToUserRecord, Integer> USER_GROUP_ID = createField("user_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.cm_hx_usergroup_to_user.user_id</code>.
     */
    public final TableField<CmHxUsergroupToUserRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>test.cm_hx_usergroup_to_user</code> table reference
     */
    public CmHxUsergroupToUser() {
        this("cm_hx_usergroup_to_user", null);
    }

    /**
     * Create an aliased <code>test.cm_hx_usergroup_to_user</code> table reference
     */
    public CmHxUsergroupToUser(String alias) {
        this(alias, CM_HX_USERGROUP_TO_USER);
    }

    private CmHxUsergroupToUser(String alias, Table<CmHxUsergroupToUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmHxUsergroupToUser(String alias, Table<CmHxUsergroupToUserRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CmHxUsergroupToUserRecord> getPrimaryKey() {
        return Keys.KEY_CM_HX_USERGROUP_TO_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmHxUsergroupToUserRecord>> getKeys() {
        return Arrays.<UniqueKey<CmHxUsergroupToUserRecord>>asList(Keys.KEY_CM_HX_USERGROUP_TO_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxUsergroupToUser as(String alias) {
        return new CmHxUsergroupToUser(alias, this);
    }

    /**
     * Rename this table
     */
    public CmHxUsergroupToUser rename(String name) {
        return new CmHxUsergroupToUser(name, null);
    }
}