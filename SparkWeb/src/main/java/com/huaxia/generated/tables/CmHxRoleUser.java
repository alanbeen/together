/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables;


import com.huaxia.generated.Keys;
import com.huaxia.generated.Test;
import com.huaxia.generated.tables.records.CmHxRoleUserRecord;

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
public class CmHxRoleUser extends TableImpl<CmHxRoleUserRecord> {

    private static final long serialVersionUID = -2056796609;

    /**
     * The reference instance of <code>test.cm_hx_role_user</code>
     */
    public static final CmHxRoleUser CM_HX_ROLE_USER = new CmHxRoleUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmHxRoleUserRecord> getRecordType() {
        return CmHxRoleUserRecord.class;
    }

    /**
     * The column <code>test.cm_hx_role_user.role_id</code>.
     */
    public final TableField<CmHxRoleUserRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.cm_hx_role_user.user_id</code>.
     */
    public final TableField<CmHxRoleUserRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>test.cm_hx_role_user</code> table reference
     */
    public CmHxRoleUser() {
        this("cm_hx_role_user", null);
    }

    /**
     * Create an aliased <code>test.cm_hx_role_user</code> table reference
     */
    public CmHxRoleUser(String alias) {
        this(alias, CM_HX_ROLE_USER);
    }

    private CmHxRoleUser(String alias, Table<CmHxRoleUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmHxRoleUser(String alias, Table<CmHxRoleUserRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CmHxRoleUserRecord> getPrimaryKey() {
        return Keys.KEY_CM_HX_ROLE_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmHxRoleUserRecord>> getKeys() {
        return Arrays.<UniqueKey<CmHxRoleUserRecord>>asList(Keys.KEY_CM_HX_ROLE_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxRoleUser as(String alias) {
        return new CmHxRoleUser(alias, this);
    }

    /**
     * Rename this table
     */
    public CmHxRoleUser rename(String name) {
        return new CmHxRoleUser(name, null);
    }
}