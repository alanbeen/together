/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables.records;


import com.huaxia.generated.tables.CmHxRoleUser;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class CmHxRoleUserRecord extends UpdatableRecordImpl<CmHxRoleUserRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -1148613049;

    /**
     * Setter for <code>test.cm_hx_role_user.role_id</code>.
     */
    public void setRoleId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.cm_hx_role_user.role_id</code>.
     */
    public Integer getRoleId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.cm_hx_role_user.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.cm_hx_role_user.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CmHxRoleUser.CM_HX_ROLE_USER.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CmHxRoleUser.CM_HX_ROLE_USER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxRoleUserRecord value1(Integer value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxRoleUserRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxRoleUserRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CmHxRoleUserRecord
     */
    public CmHxRoleUserRecord() {
        super(CmHxRoleUser.CM_HX_ROLE_USER);
    }

    /**
     * Create a detached, initialised CmHxRoleUserRecord
     */
    public CmHxRoleUserRecord(Integer roleId, Integer userId) {
        super(CmHxRoleUser.CM_HX_ROLE_USER);

        set(0, roleId);
        set(1, userId);
    }
}
