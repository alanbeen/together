/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables.records;


import com.huaxia.generated.tables.ViewToHost;

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
public class ViewToHostRecord extends UpdatableRecordImpl<ViewToHostRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -1205685151;

    /**
     * Setter for <code>test.view_to_host.view_id</code>.
     */
    public void setViewId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.view_to_host.view_id</code>.
     */
    public Integer getViewId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.view_to_host.host_id</code>.
     */
    public void setHostId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.view_to_host.host_id</code>.
     */
    public Integer getHostId() {
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
        return ViewToHost.VIEW_TO_HOST.VIEW_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ViewToHost.VIEW_TO_HOST.HOST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getViewId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getHostId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewToHostRecord value1(Integer value) {
        setViewId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewToHostRecord value2(Integer value) {
        setHostId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewToHostRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewToHostRecord
     */
    public ViewToHostRecord() {
        super(ViewToHost.VIEW_TO_HOST);
    }

    /**
     * Create a detached, initialised ViewToHostRecord
     */
    public ViewToHostRecord(Integer viewId, Integer hostId) {
        super(ViewToHost.VIEW_TO_HOST);

        set(0, viewId);
        set(1, hostId);
    }
}