/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables;


import com.huaxia.generated.Keys;
import com.huaxia.generated.Test;
import com.huaxia.generated.tables.records.SubobjectPermissionRecord;

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
public class SubobjectPermission extends TableImpl<SubobjectPermissionRecord> {

    private static final long serialVersionUID = -1490460359;

    /**
     * The reference instance of <code>test.subobject_permission</code>
     */
    public static final SubobjectPermission SUBOBJECT_PERMISSION = new SubobjectPermission();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SubobjectPermissionRecord> getRecordType() {
        return SubobjectPermissionRecord.class;
    }

    /**
     * The column <code>test.subobject_permission.subobject_permission_id</code>.
     */
    public final TableField<SubobjectPermissionRecord, Integer> SUBOBJECT_PERMISSION_ID = createField("subobject_permission_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.subobject_permission.role_object_id</code>.
     */
    public final TableField<SubobjectPermissionRecord, Integer> ROLE_OBJECT_ID = createField("role_object_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.subobject_permission.subobject_id</code>.
     */
    public final TableField<SubobjectPermissionRecord, Integer> SUBOBJECT_ID = createField("subobject_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.subobject_permission.permission_id</code>.
     */
    public final TableField<SubobjectPermissionRecord, Integer> PERMISSION_ID = createField("permission_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>test.subobject_permission</code> table reference
     */
    public SubobjectPermission() {
        this("subobject_permission", null);
    }

    /**
     * Create an aliased <code>test.subobject_permission</code> table reference
     */
    public SubobjectPermission(String alias) {
        this(alias, SUBOBJECT_PERMISSION);
    }

    private SubobjectPermission(String alias, Table<SubobjectPermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SubobjectPermission(String alias, Table<SubobjectPermissionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SubobjectPermissionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SUBOBJECT_PERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SubobjectPermissionRecord> getPrimaryKey() {
        return Keys.KEY_SUBOBJECT_PERMISSION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SubobjectPermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<SubobjectPermissionRecord>>asList(Keys.KEY_SUBOBJECT_PERMISSION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SubobjectPermission as(String alias) {
        return new SubobjectPermission(alias, this);
    }

    /**
     * Rename this table
     */
    public SubobjectPermission rename(String name) {
        return new SubobjectPermission(name, null);
    }
}
