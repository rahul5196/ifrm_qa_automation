package UPI;

public class UPITxn {

    public String mobileNo;
    public int transactionAmount;
    public String npciTransactionId;
    public String transactionTime;
    public String payerAccNo;
    public String geoCode;
    public String ip;
    public String deviceId;
    public String simId;
    public String entityCode;
    public String payeeVirtualAdd;
    public String payerVirtualAdd;
    public String pspId;
    public String pspRefNo;
    public String transactionType;
    public int payerAccId;
    public String location;
    public String os;
    public String deviceType;
    public String appName;
    public String capability;
    public String payeeVPAType;
    public String payeeAadharNo;
    public String payeeMobileNo;
    public String payeeMMID;
    public String payeeAccNo;
    public String payeeIFSC;
    public String payeeName;
    public String payerIFSC;
    public String transactionRemark;
    public String credentialType;
    public String credentialSubType;
    public String credentialDataValue;
    public String credentialDataCode;
    public String credentialDataKi;

    public UPITxn(String mobileNo,
                  int transactionAmount,
                  String npciTransactionId,
                  String transactionTime,
                  String payerAccNo,
                  String geoCode,
                  String ip,
                  String deviceId,
                  String simId,
                  String entityCode,
                  String payeeVirtualAdd,
                  String payerVirtualAdd,
                  String pspId,
                  String pspRefNo,
                  String transactionType,
                  int payerAccId,
                  String location,
                  String os,
                  String deviceType,
                  String appName,
                  String capability,
                  String payeeVPAType,
                  String payeeAadharNo,
                  String payeeMobileNo,
                  String payeeMMID,
                  String payeeAccNo,
                  String payeeIFSC,
                  String payeeName,
                  String payerIFSC,
                  String transactionRemark,
                  String credentialType,
                  String credentialSubType,
                  String credentialDataValue,
                  String credentialDataCode,
                  String credentialDataKi) {
        this.mobileNo = mobileNo;
        this.transactionAmount = transactionAmount;
        this.npciTransactionId = npciTransactionId;
        this.transactionTime = transactionTime;
        this.payerAccNo = payerAccNo;
        this.geoCode = geoCode;
        this.ip = ip;
        this.deviceId = deviceId;
        this.simId = simId;
        this.entityCode = entityCode;
        this.payeeVirtualAdd = payeeVirtualAdd;
        this.payerVirtualAdd = payerVirtualAdd;
        this.pspId = pspId;
        this.pspRefNo = pspRefNo;
        this.transactionType = transactionType;
        this.payerAccId = payerAccId;
        this.location = location;
        this.os = os;
        this.deviceType = deviceType;
        this.appName = appName;
        this.capability = capability;
        this.payeeVPAType = payeeVPAType;
        this.payeeAadharNo = payeeAadharNo;
        this.payeeMobileNo = payeeMobileNo;
        this.payeeMMID = payeeMMID;
        this.payeeAccNo = payeeAccNo;
        this.payeeIFSC = payeeIFSC;
        this.payeeName = payeeName;
        this.payerIFSC = payerIFSC;
        this.transactionRemark = transactionRemark;
        this.credentialType = credentialType;
        this.credentialSubType = credentialSubType;
        this.credentialDataValue = credentialDataValue;
        this.credentialDataCode = credentialDataCode;
        this.credentialDataKi = credentialDataKi;
    }
}
