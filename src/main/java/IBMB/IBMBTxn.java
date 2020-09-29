package IBMB;

public class IBMBTxn {
    public String systemGeneratedTransactionId;
    public String systemDate;
    public String customerId;
    public String debitBankAccountNumber;
    public double debitAmount;
    public String loginTime;
    public String beneficiaryName;
    public String beneficiaryMobileNumber;
    public String inputCurrency;
    public String creditBankAccountNumber;
    public String remarks;
    public String remmiterMobileNumber;
    public String deviceIP;
    public String transactionMode;
    public String ifscCode;
    public String transactionType;
    public String beneficiaryEmailID;
    public double latitude;
    public double longitude;
    public String transactionCurrency;
    public String beneficiaryBank;
    public String creditCurrency;
    public String beneficiaryMMID;
    public String accountTypeDescription;
    public String channelId;

    public IBMBTxn(String systemGeneratedTransactionId,
                   String systemDate,
                   String customerId,
                   String debitBankAccountNumber,
                   double debitAmount,
                   String loginTime,
                   String beneficiaryName,
                   String beneficiaryMobileNumber,
                   String inputCurrency,
                   String creditBankAccountNumber,
                   String remarks,
                   String remmiterMobileNumber,
                   String deviceIP,
                   String transactionMode,
                   String ifscCode,
                   String transactionType,
                   String beneficiaryEmailID,
                   double latitude,
                   double longitude,
                   String transactionCurrency,
                   String beneficiaryBank,
                   String creditCurrency,
                   String beneficiaryMMID,
                   String accountTypeDescription,
                   String channelId)
    {
        this.systemGeneratedTransactionId = systemGeneratedTransactionId;
        this.systemDate = systemDate;
        this.customerId = customerId;
        this.debitBankAccountNumber = debitBankAccountNumber;
        this.debitAmount = debitAmount;
        this.loginTime = loginTime;
        this.beneficiaryName = beneficiaryName;
        this.beneficiaryMobileNumber = beneficiaryMobileNumber;
        this.inputCurrency = inputCurrency;
        this.creditBankAccountNumber = creditBankAccountNumber;
        this.remarks = remarks;
        this.remmiterMobileNumber = remmiterMobileNumber;
        this.deviceIP = deviceIP;
        this.transactionMode = transactionMode;
        this.ifscCode = ifscCode;
        this.transactionType =transactionType;
        this.beneficiaryEmailID = beneficiaryEmailID;
        this.latitude =latitude;
        this.longitude = longitude;
        this.transactionCurrency = transactionCurrency;
        this.beneficiaryBank = beneficiaryBank;
        this.creditCurrency = creditCurrency;
        this.beneficiaryMMID = beneficiaryMMID;
        this.accountTypeDescription = accountTypeDescription;
        this.channelId = channelId;
    }

    public String getSystemGeneratedTransactionId() {
        return systemGeneratedTransactionId;
    }

    public String getSystemDate() {
        return systemDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getDebitBankAccountNumber() {
        return debitBankAccountNumber;
    }

    public double getDebitAmount() {
        return debitAmount;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public String getBeneficiaryMobileNumber() {
        return beneficiaryMobileNumber;
    }

    public String getInputCurrency() {
        return inputCurrency;
    }

    public String getCreditBankAccountNumber() {
        return creditBankAccountNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getRemmiterMobileNumber() {
        return remmiterMobileNumber;
    }

    public String getDeviceIP() {
        return deviceIP;
    }

    public String getTransactionMode() {
        return transactionMode;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getBeneficiaryEmailID() {
        return beneficiaryEmailID;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public String getBeneficiaryBank() {
        return beneficiaryBank;
    }

    public String getCreditCurrency() {
        return creditCurrency;
    }

    public String getBeneficiaryMMID() {
        return beneficiaryMMID;
    }

    public String getAccountTypeDescription() {
        return accountTypeDescription;
    }

    public String getChannelId() {
        return channelId;
    }

}
