/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables.records;


import com.huaxia.generated.tables.ObjectRole;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ObjectRoleRecord extends UpdatableRecordImpl<ObjectRoleRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -904518420;

    /**
     * Setter for <code>test.object_role.role_object_id</code>.
     */
    public void setRoleObjectId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.object_role.role_object_id</code>.
     */
    public Integer getRoleObjectId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.object_role.obj_to_id</code>.
     */
    public void setObjToId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.object_role.obj_to_id</code>.
     */
    public Integer getObjToId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>test.object_role.role_id</code>.
     */
    public void setRoleId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.object_role.role_id</code>.
     */
    public Integer getRoleId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ObjectRole.OBJECT_ROLE.ROLE_OBJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ObjectRole.OBJECT_ROLE.OBJ_TO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ObjectRole.OBJECT_ROLE.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRoleObjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getObjToId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectRoleRecord value1(Integer value) {
        setRoleObjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectRoleRecord value2(Integer value) {
        setObjToId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectRoleRecord value3(Integer value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectRoleRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ObjectRoleRecord
     */
    public ObjectRoleRecord() {
        super(ObjectRole.OBJECT_ROLE);
    }

    /**
     * Create a detached, initialised ObjectRoleRecord
     */
    public ObjectRoleRecord(Integer roleObjectId, Integer objToId, Integer roleId) {
        super(ObjectRole.OBJECT_ROLE);

        set(0, roleObjectId);
        set(1, objToId);
        set(2, roleId);
    }
}
