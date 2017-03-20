/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables.records;


import com.huaxia.generated.tables.UserGroup;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
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
public class UserGroupRecord extends UpdatableRecordImpl<UserGroupRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 16889112;

    /**
     * Setter for <code>test.user_group.user_group_id</code>.
     */
    public void setUserGroupId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.user_group.user_group_id</code>.
     */
    public Integer getUserGroupId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.user_group.user_group_name</code>.
     */
    public void setUserGroupName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.user_group.user_group_name</code>.
     */
    public String getUserGroupName() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserGroup.USER_GROUP.USER_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserGroup.USER_GROUP.USER_GROUP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupRecord value1(Integer value) {
        setUserGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupRecord value2(String value) {
        setUserGroupName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserGroupRecord
     */
    public UserGroupRecord() {
        super(UserGroup.USER_GROUP);
    }

    /**
     * Create a detached, initialised UserGroupRecord
     */
    public UserGroupRecord(Integer userGroupId, String userGroupName) {
        super(UserGroup.USER_GROUP);

        set(0, userGroupId);
        set(1, userGroupName);
    }
}