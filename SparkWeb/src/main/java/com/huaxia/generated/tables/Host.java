/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables;


import com.huaxia.generated.Keys;
import com.huaxia.generated.Test;
import com.huaxia.generated.tables.records.HostRecord;

import java.sql.Timestamp;
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
public class Host extends TableImpl<HostRecord> {

    private static final long serialVersionUID = -995685269;

    /**
     * The reference instance of <code>test.host</code>
     */
    public static final Host HOST = new Host();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostRecord> getRecordType() {
        return HostRecord.class;
    }

    /**
     * The column <code>test.host.host_id</code>.
     */
    public final TableField<HostRecord, Integer> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.host.host_name</code>.
     */
    public final TableField<HostRecord, String> HOST_NAME = createField("host_name", org.jooq.impl.SQLDataType.CHAR.length(60).nullable(false), this, "");

    /**
     * The column <code>test.host.host_ip</code>.
     */
    public final TableField<HostRecord, String> HOST_IP = createField("host_ip", org.jooq.impl.SQLDataType.CHAR.length(20), this, "");

    /**
     * The column <code>test.host.is_monitor</code>.
     */
    public final TableField<HostRecord, Integer> IS_MONITOR = createField("is_monitor", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.host.is_virtual</code>.
     */
    public final TableField<HostRecord, Integer> IS_VIRTUAL = createField("is_virtual", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.host.remark</code>.
     */
    public final TableField<HostRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.host.os_id</code>.
     */
    public final TableField<HostRecord, Long> OS_ID = createField("os_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>test.host.os_info</code>.
     */
    public final TableField<HostRecord, String> OS_INFO = createField("os_info", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.host.cpu_info</code>.
     */
    public final TableField<HostRecord, String> CPU_INFO = createField("cpu_info", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.host.memory_info</code>.
     */
    public final TableField<HostRecord, String> MEMORY_INFO = createField("memory_info", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.host.disk_info</code>.
     */
    public final TableField<HostRecord, String> DISK_INFO = createField("disk_info", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.host.mac_address</code>.
     */
    public final TableField<HostRecord, String> MAC_ADDRESS = createField("mac_address", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.host.width</code>.
     */
    public final TableField<HostRecord, String> WIDTH = createField("width", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.host.position</code>.
     */
    public final TableField<HostRecord, String> POSITION = createField("position", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.host.person_id</code>.
     */
    public final TableField<HostRecord, Long> PERSON_ID = createField("person_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>test.host.is_asset</code>.
     */
    public final TableField<HostRecord, String> IS_ASSET = createField("is_asset", org.jooq.impl.SQLDataType.CHAR.length(10), this, "");

    /**
     * The column <code>test.host.add_date</code>.
     */
    public final TableField<HostRecord, Timestamp> ADD_DATE = createField("add_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>test.host.add_user_id</code>.
     */
    public final TableField<HostRecord, Integer> ADD_USER_ID = createField("add_user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.host.last_modify_user_id</code>.
     */
    public final TableField<HostRecord, Long> LAST_MODIFY_USER_ID = createField("last_modify_user_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>test.host.state_id</code>.
     */
    public final TableField<HostRecord, Integer> STATE_ID = createField("state_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.host.start_time</code>.
     */
    public final TableField<HostRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>test.host.end_time</code>.
     */
    public final TableField<HostRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>test.host.purpose</code>.
     */
    public final TableField<HostRecord, String> PURPOSE = createField("purpose", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>test.host.product_no</code>.
     */
    public final TableField<HostRecord, String> PRODUCT_NO = createField("product_no", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * Create a <code>test.host</code> table reference
     */
    public Host() {
        this("host", null);
    }

    /**
     * Create an aliased <code>test.host</code> table reference
     */
    public Host(String alias) {
        this(alias, HOST);
    }

    private Host(String alias, Table<HostRecord> aliased) {
        this(alias, aliased, null);
    }

    private Host(String alias, Table<HostRecord> aliased, Field<?>[] parameters) {
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
    public Identity<HostRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HostRecord> getPrimaryKey() {
        return Keys.KEY_HOST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HostRecord>> getKeys() {
        return Arrays.<UniqueKey<HostRecord>>asList(Keys.KEY_HOST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Host as(String alias) {
        return new Host(alias, this);
    }

    /**
     * Rename this table
     */
    public Host rename(String name) {
        return new Host(name, null);
    }
}
