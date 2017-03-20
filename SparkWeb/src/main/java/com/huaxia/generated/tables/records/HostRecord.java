/**
 * This class is generated by jOOQ
 */
package com.huaxia.generated.tables.records;


import com.huaxia.generated.tables.Host;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class HostRecord extends UpdatableRecordImpl<HostRecord> {

    private static final long serialVersionUID = -225834603;

    /**
     * Setter for <code>test.host.host_id</code>.
     */
    public void setHostId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.host.host_id</code>.
     */
    public Integer getHostId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.host.host_name</code>.
     */
    public void setHostName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.host.host_name</code>.
     */
    public String getHostName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.host.host_ip</code>.
     */
    public void setHostIp(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.host.host_ip</code>.
     */
    public String getHostIp() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.host.is_monitor</code>.
     */
    public void setIsMonitor(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>test.host.is_monitor</code>.
     */
    public Integer getIsMonitor() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>test.host.is_virtual</code>.
     */
    public void setIsVirtual(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>test.host.is_virtual</code>.
     */
    public Integer getIsVirtual() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>test.host.remark</code>.
     */
    public void setRemark(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>test.host.remark</code>.
     */
    public String getRemark() {
        return (String) get(5);
    }

    /**
     * Setter for <code>test.host.os_id</code>.
     */
    public void setOsId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>test.host.os_id</code>.
     */
    public Long getOsId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>test.host.os_info</code>.
     */
    public void setOsInfo(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>test.host.os_info</code>.
     */
    public String getOsInfo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>test.host.cpu_info</code>.
     */
    public void setCpuInfo(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>test.host.cpu_info</code>.
     */
    public String getCpuInfo() {
        return (String) get(8);
    }

    /**
     * Setter for <code>test.host.memory_info</code>.
     */
    public void setMemoryInfo(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>test.host.memory_info</code>.
     */
    public String getMemoryInfo() {
        return (String) get(9);
    }

    /**
     * Setter for <code>test.host.disk_info</code>.
     */
    public void setDiskInfo(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>test.host.disk_info</code>.
     */
    public String getDiskInfo() {
        return (String) get(10);
    }

    /**
     * Setter for <code>test.host.mac_address</code>.
     */
    public void setMacAddress(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>test.host.mac_address</code>.
     */
    public String getMacAddress() {
        return (String) get(11);
    }

    /**
     * Setter for <code>test.host.width</code>.
     */
    public void setWidth(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>test.host.width</code>.
     */
    public String getWidth() {
        return (String) get(12);
    }

    /**
     * Setter for <code>test.host.position</code>.
     */
    public void setPosition(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>test.host.position</code>.
     */
    public String getPosition() {
        return (String) get(13);
    }

    /**
     * Setter for <code>test.host.person_id</code>.
     */
    public void setPersonId(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>test.host.person_id</code>.
     */
    public Long getPersonId() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>test.host.is_asset</code>.
     */
    public void setIsAsset(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>test.host.is_asset</code>.
     */
    public String getIsAsset() {
        return (String) get(15);
    }

    /**
     * Setter for <code>test.host.add_date</code>.
     */
    public void setAddDate(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>test.host.add_date</code>.
     */
    public Timestamp getAddDate() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>test.host.add_user_id</code>.
     */
    public void setAddUserId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>test.host.add_user_id</code>.
     */
    public Integer getAddUserId() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>test.host.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>test.host.last_modify_user_id</code>.
     */
    public Long getLastModifyUserId() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>test.host.state_id</code>.
     */
    public void setStateId(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>test.host.state_id</code>.
     */
    public Integer getStateId() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>test.host.start_time</code>.
     */
    public void setStartTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>test.host.start_time</code>.
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>test.host.end_time</code>.
     */
    public void setEndTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>test.host.end_time</code>.
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>test.host.purpose</code>.
     */
    public void setPurpose(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>test.host.purpose</code>.
     */
    public String getPurpose() {
        return (String) get(22);
    }

    /**
     * Setter for <code>test.host.product_no</code>.
     */
    public void setProductNo(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>test.host.product_no</code>.
     */
    public String getProductNo() {
        return (String) get(23);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HostRecord
     */
    public HostRecord() {
        super(Host.HOST);
    }

    /**
     * Create a detached, initialised HostRecord
     */
    public HostRecord(Integer hostId, String hostName, String hostIp, Integer isMonitor, Integer isVirtual, String remark, Long osId, String osInfo, String cpuInfo, String memoryInfo, String diskInfo, String macAddress, String width, String position, Long personId, String isAsset, Timestamp addDate, Integer addUserId, Long lastModifyUserId, Integer stateId, Timestamp startTime, Timestamp endTime, String purpose, String productNo) {
        super(Host.HOST);

        set(0, hostId);
        set(1, hostName);
        set(2, hostIp);
        set(3, isMonitor);
        set(4, isVirtual);
        set(5, remark);
        set(6, osId);
        set(7, osInfo);
        set(8, cpuInfo);
        set(9, memoryInfo);
        set(10, diskInfo);
        set(11, macAddress);
        set(12, width);
        set(13, position);
        set(14, personId);
        set(15, isAsset);
        set(16, addDate);
        set(17, addUserId);
        set(18, lastModifyUserId);
        set(19, stateId);
        set(20, startTime);
        set(21, endTime);
        set(22, purpose);
        set(23, productNo);
    }
}