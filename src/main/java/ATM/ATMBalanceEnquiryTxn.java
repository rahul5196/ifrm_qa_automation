package ATM;

public class ATMBalanceEnquiryTxn {

    public String mti;
    public String accountNumber;
    public String processingCode;
    public int txnAmount;
    public String transmissionDateAndTime;
    public String txnId;
    public String localTxnDateAndTime;
    public String acqInstCountryCode;
    public String posEntryMode;
    public String functionCode;
    public String cardAcceptorBusinessCode;
    public String acqInstIdentCode;
    public String retrievalRefNo;
    public String cardAcceptorTermId;
    public String cardAcceptorIdCode;
    public String cardAcceptorNameAndLoc;
    public String txnCurrencyCode;
    public String accId1;
    public String reservedForPvtUse;

    public ATMBalanceEnquiryTxn(String mti, String accountNumber, String processingCode, int txnAmount, String transmissionDateAndTime, String txnId, String localTxnDateAndTime, String acqInstCountryCode, String posEntryMode, String functionCode, String cardAcceptorBusinessCode, String acqInstIdentCode, String retrievalRefNo, String cardAcceptorTermId, String cardAcceptorIdCode, String cardAcceptorNameAndLoc, String txnCurrencyCode, String accId1, String reservedForPvtUse) {
        this.mti = mti;
        this.accountNumber = accountNumber;
        this.processingCode = processingCode;
        this.txnAmount = txnAmount;
        this.transmissionDateAndTime = transmissionDateAndTime;
        this.txnId = txnId;
        this.localTxnDateAndTime = localTxnDateAndTime;
        this.acqInstCountryCode = acqInstCountryCode;
        this.posEntryMode = posEntryMode;
        this.functionCode = functionCode;
        this.cardAcceptorBusinessCode = cardAcceptorBusinessCode;
        this.acqInstIdentCode = acqInstIdentCode;
        this.retrievalRefNo = retrievalRefNo;
        this.cardAcceptorTermId = cardAcceptorTermId;
        this.cardAcceptorIdCode = cardAcceptorIdCode;
        this.cardAcceptorNameAndLoc = cardAcceptorNameAndLoc;
        this.txnCurrencyCode = txnCurrencyCode;
        this.accId1 = accId1;
        this.reservedForPvtUse = reservedForPvtUse;
    }

    public String getMti() {
        return mti;
    }

    public void setMti(String mti) {
        this.mti = mti;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getProcessingCode() {
        return processingCode;
    }

    public void setProcessingCode(String processingCode) {
        this.processingCode = processingCode;
    }

    public int getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(int txnAmount) {
        this.txnAmount = txnAmount;
    }

    public String getTransmissionDateAndTime() {
        return transmissionDateAndTime;
    }

    public void setTransmissionDateAndTime(String transmissionDateAndTime) {
        this.transmissionDateAndTime = transmissionDateAndTime;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getLocalTxnDateAndTime() {
        return localTxnDateAndTime;
    }

    public void setLocalTxnDateAndTime(String localTxnDateAndTime) {
        this.localTxnDateAndTime = localTxnDateAndTime;
    }

    public String getAcqInstCountryCode() {
        return acqInstCountryCode;
    }

    public void setAcqInstCountryCode(String acqInstCountryCode) {
        this.acqInstCountryCode = acqInstCountryCode;
    }

    public String getPosEntryMode() {
        return posEntryMode;
    }

    public void setPosEntryMode(String posEntryMode) {
        this.posEntryMode = posEntryMode;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getCardAcceptorBusinessCode() {
        return cardAcceptorBusinessCode;
    }

    public void setCardAcceptorBusinessCode(String cardAcceptorBusinessCode) {
        this.cardAcceptorBusinessCode = cardAcceptorBusinessCode;
    }

    public String getAcqInstIdentCode() {
        return acqInstIdentCode;
    }

    public void setAcqInstIdentCode(String acqInstIdentCode) {
        this.acqInstIdentCode = acqInstIdentCode;
    }

    public String getRetrievalRefNo() {
        return retrievalRefNo;
    }

    public void setRetrievalRefNo(String retrievalRefNo) {
        this.retrievalRefNo = retrievalRefNo;
    }

    public String getCardAcceptorTermId() {
        return cardAcceptorTermId;
    }

    public void setCardAcceptorTermId(String cardAcceptorTermId) {
        this.cardAcceptorTermId = cardAcceptorTermId;
    }

    public String getCardAcceptorIdCode() {
        return cardAcceptorIdCode;
    }

    public void setCardAcceptorIdCode(String cardAcceptorIdCode) {
        this.cardAcceptorIdCode = cardAcceptorIdCode;
    }

    public String getCardAcceptorNameAndLoc() {
        return cardAcceptorNameAndLoc;
    }

    public void setCardAcceptorNameAndLoc(String cardAcceptorNameAndLoc) {
        this.cardAcceptorNameAndLoc = cardAcceptorNameAndLoc;
    }

    public String getTxnCurrencyCode() {
        return txnCurrencyCode;
    }

    public void setTxnCurrencyCode(String txnCurrencyCode) {
        this.txnCurrencyCode = txnCurrencyCode;
    }

    public String getAccId1() {
        return accId1;
    }

    public void setAccId1(String accId1) {
        this.accId1 = accId1;
    }

    public String getReservedForPvtUse() {
        return reservedForPvtUse;
    }

    public void setReservedForPvtUse(String reservedForPvtUse) {
        this.reservedForPvtUse = reservedForPvtUse;
    }
}
