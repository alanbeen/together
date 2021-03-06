/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables.records;


import com.huaxia.generated.tables.Object;

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
public class ObjectRecord extends UpdatableRecordImpl<ObjectRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -668119532;

    /**
     * Setter for <code>test.object.object_id</code>.
     */
    public void setObjectId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.object.object_id</code>.
     */
    public Integer getObjectId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.object.object_table</code>.
     */
    public void setObjectTable(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.object.object_table</code>.
     */
    public String getObjectTable() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.object.object_name</code>.
     */
    public void setObjectName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.object.object_name</code>.
     */
    public String getObjectName() {
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
        return Object.OBJECT.OBJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Object.OBJECT.OBJECT_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Object.OBJECT.OBJECT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getObjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getObjectTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectRecord value1(Integer value) {
        setObjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectRecord value2(String value) {
        setObjectTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectRecord value3(String value) {
        setObjectName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ObjectRecord
     */
    public ObjectRecord() {
        super(Object.OBJECT);
    }

    /**
     * Create a detached, initialised ObjectRecord
     */
    public ObjectRecord(Integer objectId, String objectTable, String objectName) {
        super(Object.OBJECT);

        set(0, objectId);
        set(1, objectTable);
        set(2, objectName);
    }
}
