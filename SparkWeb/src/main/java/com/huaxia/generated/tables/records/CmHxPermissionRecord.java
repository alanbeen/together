/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables.records;


import com.huaxia.generated.tables.CmHxPermission;

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
public class CmHxPermissionRecord extends UpdatableRecordImpl<CmHxPermissionRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -1923688688;

    /**
     * Setter for <code>test.cm_hx_permission.permission_id</code>.
     */
    public void setPermissionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.cm_hx_permission.permission_id</code>.
     */
    public Integer getPermissionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.cm_hx_permission.permission_name</code>.
     */
    public void setPermissionName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.cm_hx_permission.permission_name</code>.
     */
    public String getPermissionName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.cm_hx_permission.express</code>.
     */
    public void setExpress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.cm_hx_permission.express</code>.
     */
    public String getExpress() {
        return (String) get(2);
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
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CmHxPermission.CM_HX_PERMISSION.PERMISSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CmHxPermission.CM_HX_PERMISSION.PERMISSION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CmHxPermission.CM_HX_PERMISSION.EXPRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPermissionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPermissionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getExpress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxPermissionRecord value1(Integer value) {
        setPermissionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxPermissionRecord value2(String value) {
        setPermissionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxPermissionRecord value3(String value) {
        setExpress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmHxPermissionRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CmHxPermissionRecord
     */
    public CmHxPermissionRecord() {
        super(CmHxPermission.CM_HX_PERMISSION);
    }

    /**
     * Create a detached, initialised CmHxPermissionRecord
     */
    public CmHxPermissionRecord(Integer permissionId, String permissionName, String express) {
        super(CmHxPermission.CM_HX_PERMISSION);

        set(0, permissionId);
        set(1, permissionName);
        set(2, express);
    }
}
