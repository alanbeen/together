/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables;


import com.huaxia.generated.Keys;
import com.huaxia.generated.Test;
import com.huaxia.generated.tables.records.ObjectRoleRecord;

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
public class ObjectRole extends TableImpl<ObjectRoleRecord> {

    private static final long serialVersionUID = -2010425767;

    /**
     * The reference instance of <code>test.object_role</code>
     */
    public static final ObjectRole OBJECT_ROLE = new ObjectRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ObjectRoleRecord> getRecordType() {
        return ObjectRoleRecord.class;
    }

    /**
     * The column <code>test.object_role.role_object_id</code>.
     */
    public final TableField<ObjectRoleRecord, Integer> ROLE_OBJECT_ID = createField("role_object_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.object_role.obj_to_id</code>.
     */
    public final TableField<ObjectRoleRecord, Integer> OBJ_TO_ID = createField("obj_to_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.object_role.role_id</code>.
     */
    public final TableField<ObjectRoleRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>test.object_role</code> table reference
     */
    public ObjectRole() {
        this("object_role", null);
    }

    /**
     * Create an aliased <code>test.object_role</code> table reference
     */
    public ObjectRole(String alias) {
        this(alias, OBJECT_ROLE);
    }

    private ObjectRole(String alias, Table<ObjectRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private ObjectRole(String alias, Table<ObjectRoleRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ObjectRoleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OBJECT_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ObjectRoleRecord> getPrimaryKey() {
        return Keys.KEY_OBJECT_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ObjectRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<ObjectRoleRecord>>asList(Keys.KEY_OBJECT_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectRole as(String alias) {
        return new ObjectRole(alias, this);
    }

    /**
     * Rename this table
     */
    public ObjectRole rename(String name) {
        return new ObjectRole(name, null);
    }
}
