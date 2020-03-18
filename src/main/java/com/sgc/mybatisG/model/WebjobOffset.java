package com.sgc.mybatisG.model;

import java.util.Date;

public class WebjobOffset {
    /**
     * null
     */
    private Integer id;

    /**
     * null
     */
    private String groupName;

    /**
     * null
     */
    private String partitionId;

    /**
     * null
     */
    private String offset;

    /**
     * null
     */
    private String webjobName;

    /**
     * null
     */
    private Date gmtCreate;

    /**
     * null
     */
    private Date gmtModified;

    /**
     * null
     */
    private Long sequenceNumber;

    /**
     * null
     */
    private Date enqueuedTime;

    /**
     * null
     * @return id null
     */
    public Integer getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * null
     * @return group_name null
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * null
     * @param groupName null
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * null
     * @return partition_Id null
     */
    public String getPartitionId() {
        return partitionId;
    }

    /**
     * null
     * @param partitionId null
     */
    public void setPartitionId(String partitionId) {
        this.partitionId = partitionId == null ? null : partitionId.trim();
    }

    /**
     * null
     * @return offset null
     */
    public String getOffset() {
        return offset;
    }

    /**
     * null
     * @param offset null
     */
    public void setOffset(String offset) {
        this.offset = offset == null ? null : offset.trim();
    }

    /**
     * null
     * @return webjob_name null
     */
    public String getWebjobName() {
        return webjobName;
    }

    /**
     * null
     * @param webjobName null
     */
    public void setWebjobName(String webjobName) {
        this.webjobName = webjobName == null ? null : webjobName.trim();
    }

    /**
     * null
     * @return gmt_create null
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * null
     * @param gmtCreate null
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * null
     * @return gmt_modified null
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * null
     * @param gmtModified null
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * null
     * @return sequence_number null
     */
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * null
     * @param sequenceNumber null
     */
    public void setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * null
     * @return enqueued_time null
     */
    public Date getEnqueuedTime() {
        return enqueuedTime;
    }

    /**
     * null
     * @param enqueuedTime null
     */
    public void setEnqueuedTime(Date enqueuedTime) {
        this.enqueuedTime = enqueuedTime;
    }
}