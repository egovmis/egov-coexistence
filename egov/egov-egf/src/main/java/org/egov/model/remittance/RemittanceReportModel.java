package org.egov.model.remittance;

import java.math.BigDecimal;
import java.util.Date;

public class RemittanceReportModel {
    private Long id;
    private int srNo;
    private Boolean selected;
    private String receiptId;
    private String receiptDate;
    private String receiptNumber;
    private BigDecimal instrumentAmount;
    private String service;
    private String instrumentType;
    private String instrumentNumber;
    private String instrumentDate;
    private String instrumentId;
    private String fund;
    private String department;
    private String fundName;
    private String departmentName;
    private String serviceName;
    private String bankBranch;
    private String bank;
    private String remittanceReferenceNumber;
    private String bankAccount;
    private Long financialYear;
    private Date fromDate;
    private Date toDate;
    private String remittedOn;
    private String remitterId;
    private String remittedBy;
    private String transactionNumber;
    private String payee;
    private String drawer;
    public Boolean getSelected() {
        return selected;
    }
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
    public String getReceiptId() {
        return receiptId;
    }
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
    public String getReceiptDate() {
        return receiptDate;
    }
    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }
    public String getReceiptNumber() {
        return receiptNumber;
    }
    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }
    public BigDecimal getInstrumentAmount() {
        return instrumentAmount;
    }
    public void setInstrumentAmount(BigDecimal instrumentAmount) {
        this.instrumentAmount = instrumentAmount;
    }
    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }
    public String getInstrumentType() {
        return instrumentType;
    }
    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }
    public String getInstrumentNumber() {
        return instrumentNumber;
    }
    public void setInstrumentNumber(String instrumentNumber) {
        this.instrumentNumber = instrumentNumber;
    }
    public String getInstrumentDate() {
        return instrumentDate;
    }
    public void setInstrumentDate(String instrumentDate) {
        this.instrumentDate = instrumentDate;
    }
    public String getInstrumentId() {
        return instrumentId;
    }
    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }
    public String getFund() {
        return fund;
    }
    public void setFund(String fund) {
        this.fund = fund;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getFundName() {
        return fundName;
    }
    public void setFundName(String fundName) {
        this.fundName = fundName;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getBankBranch() {
        return bankBranch;
    }
    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }
    public String getBank() {
        return bank;
    }
    public void setBank(String bank) {
        this.bank = bank;
    }
    public String getRemittanceReferenceNumber() {
        return remittanceReferenceNumber;
    }
    public void setRemittanceReferenceNumber(String remittanceReferenceNumber) {
        this.remittanceReferenceNumber = remittanceReferenceNumber;
    }
    public String getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    public Long getFinancialYear() {
        return financialYear;
    }
    public void setFinancialYear(Long financialYear) {
        this.financialYear = financialYear;
    }
    public Date getFromDate() {
        return fromDate;
    }
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
    public Date getToDate() {
        return toDate;
    }
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
    public void setRemitterId(String remitterId) {
        this.remitterId = remitterId;
    }
    public String getRemitterId() {
        return remitterId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getSrNo() {
        return srNo;
    }
    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }
    public String getTransactionNumber() {
        return transactionNumber;
    }
    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }
    public String getPayee() {
        return payee;
    }
    public void setPayee(String payee) {
        this.payee = payee;
    }
    public String getDrawer() {
        return drawer;
    }
    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }
    public String getRemittedOn() {
        return remittedOn;
    }
    public void setRemittedOn(String remittedOn) {
        this.remittedOn = remittedOn;
    }
    public String getRemittedBy() {
        return remittedBy;
    }
    public void setRemittedBy(String remittedBy) {
        this.remittedBy = remittedBy;
    }
}
