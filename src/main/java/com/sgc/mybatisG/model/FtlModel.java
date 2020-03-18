package com.sgc.mybatisG.model;

public class FtlModel {

	private String modelTargetPackage;
	private String daoTargetPackage;
	private String xmlTargetPackage;
	private String templateName;
	private String domainObjectName;
	private String tableName;
	private String targetPath;
	private String suffix;
	private String primaryKeyType;
	
	
	
	public String getPrimaryKeyType() {
		return primaryKeyType;
	}
	public void setPrimaryKeyType(String primaryKeyType) {
		this.primaryKeyType = primaryKeyType;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getTargetPath() {
		return targetPath;
	}
	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getDomainObjectName() {
		return domainObjectName;
	}
	public void setDomainObjectName(String domainObjectName) {
		this.domainObjectName = domainObjectName;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getModelTargetPackage() {
		return modelTargetPackage;
	}
	public void setModelTargetPackage(String modelTargetPackage) {
		this.modelTargetPackage = modelTargetPackage;
	}
	public String getDaoTargetPackage() {
		return daoTargetPackage;
	}
	public void setDaoTargetPackage(String daoTargetPackage) {
		this.daoTargetPackage = daoTargetPackage;
	}
	public String getXmlTargetPackage() {
		return xmlTargetPackage;
	}
	public void setXmlTargetPackage(String xmlTargetPackage) {
		this.xmlTargetPackage = xmlTargetPackage;
	}
	
	
}
