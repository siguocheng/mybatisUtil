package com.sgc.mybatisG.model;

import java.util.Date;

public class Alarm {
    /**
     * null
     */
    private Long id;

    /**
     * null
     */
    private Long dtuPid;

    /**
     * null
     */
    private String equipmentId;

    /**
     * null
     */
    private Integer alarmDefineId;

    /**
     * null
     */
    private Byte alarmType;

    /**
     * null
     */
    private String alarmTitle;

    /**
     * null
     */
    private Date alertTime;

    /**
     * null
     */
    private Integer domain;

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
    private Byte alarmState;

    /**
     * null
     * @return id null
     */
    public Long getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * null
     * @return dtu_pid null
     */
    public Long getDtuPid() {
        return dtuPid;
    }

    /**
     * null
     * @param dtuPid null
     */
    public void setDtuPid(Long dtuPid) {
        this.dtuPid = dtuPid;
    }

    /**
     * null
     * @return equipment_id null
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * null
     * @param equipmentId null
     */
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId == null ? null : equipmentId.trim();
    }

    /**
     * null
     * @return alarm_define_id null
     */
    public Integer getAlarmDefineId() {
        return alarmDefineId;
    }

    /**
     * null
     * @param alarmDefineId null
     */
    public void setAlarmDefineId(Integer alarmDefineId) {
        this.alarmDefineId = alarmDefineId;
    }

    /**
     * null
     * @return alarm_type null
     */
    public Byte getAlarmType() {
        return alarmType;
    }

    /**
     * null
     * @param alarmType null
     */
    public void setAlarmType(Byte alarmType) {
        this.alarmType = alarmType;
    }

    /**
     * null
     * @return alarm_title null
     */
    public String getAlarmTitle() {
        return alarmTitle;
    }

    /**
     * null
     * @param alarmTitle null
     */
    public void setAlarmTitle(String alarmTitle) {
        this.alarmTitle = alarmTitle == null ? null : alarmTitle.trim();
    }

    /**
     * null
     * @return alert_time null
     */
    public Date getAlertTime() {
        return alertTime;
    }

    /**
     * null
     * @param alertTime null
     */
    public void setAlertTime(Date alertTime) {
        this.alertTime = alertTime;
    }

    /**
     * null
     * @return domain null
     */
    public Integer getDomain() {
        return domain;
    }

    /**
     * null
     * @param domain null
     */
    public void setDomain(Integer domain) {
        this.domain = domain;
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
     * @return alarm_state null
     */
    public Byte getAlarmState() {
        return alarmState;
    }

    /**
     * null
     * @param alarmState null
     */
    public void setAlarmState(Byte alarmState) {
        this.alarmState = alarmState;
    }
}