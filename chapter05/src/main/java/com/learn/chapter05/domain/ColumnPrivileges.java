package com.learn.chapter05.domain;

import java.io.Serializable;

public class ColumnPrivileges implements Serializable {
    private String grantee;

    private String tableCatalog;

    private String tableSchema;

    private String tableName;

    private String columnName;

    private String privilegeType;

    private String isGrantable;

    private static final long serialVersionUID = 1L;

    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee == null ? null : grantee.trim();
    }

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog == null ? null : tableCatalog.trim();
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    public String getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType == null ? null : privilegeType.trim();
    }

    public String getIsGrantable() {
        return isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable == null ? null : isGrantable.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grantee=").append(grantee);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", privilegeType=").append(privilegeType);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}