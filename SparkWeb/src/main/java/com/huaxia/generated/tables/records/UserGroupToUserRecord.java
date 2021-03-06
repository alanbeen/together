/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables.records;


import com.huaxia.generated.tables.UserGroupToUser;

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
public class UserGroupToUserRecord extends UpdatableRecordImpl<UserGroupToUserRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -1092907654;

    /**
     * Setter for <code>test.user_group_to_user.user_group_id</code>.
     */
    public void setUserGroupId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.user_group_to_user.user_group_id</code>.
     */
    public Integer getUserGroupId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.user_group_to_user.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.user_group_to_user.user_id</code>.
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
        return UserGroupToUser.USER_GROUP_TO_USER.USER_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserGroupToUser.USER_GROUP_TO_USER.USER_ID;
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
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupToUserRecord value1(Integer value) {
        setUserGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupToUserRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroupToUserRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserGroupToUserRecord
     */
    public UserGroupToUserRecord() {
        super(UserGroupToUser.USER_GROUP_TO_USER);
    }

    /**
     * Create a detached, initialised UserGroupToUserRecord
     */
    public UserGroupToUserRecord(Integer userGroupId, Integer userId) {
        super(UserGroupToUser.USER_GROUP_TO_USER);

        set(0, userGroupId);
        set(1, userId);
    }
}
