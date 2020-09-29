package POS;

public class POSTxn {
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

    public POSTxn(String mti, String accountNumber, String processingCode, int txnAmount, String transmissionDateAndTime, String txnId, String localTxnDateAndTime, String acqInstCountryCode, String posEntryMode, String functionCode, String cardAcceptorBusinessCode, String acqInstIdentCode, String retrievalRefNo, String cardAcceptorTermId, String cardAcceptorIdCode, String cardAcceptorNameAndLoc, String txnCurrencyCode, String accId1, String reservedForPvtUse) {
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getProcessingCode() {
        return processingCode;
    }

    public int getTxnAmount() {
        return txnAmount;
    }

    public String getTransmissionDateAndTime() {
        return transmissionDateAndTime;
    }

    public String getTxnId() {
        return txnId;
    }

    public String getLocalTxnDateAndTime() {
        return localTxnDateAndTime;
    }

    public String getAcqInstCountryCode() {
        return acqInstCountryCode;
    }

    public String getPosEntryMode() {
        return posEntryMode;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public String getCardAcceptorBusinessCode() {
        return cardAcceptorBusinessCode;
    }

    public String getAcqInstIdentCode() {
        return acqInstIdentCode;
    }

    public String getRetrievalRefNo() {
        return retrievalRefNo;
    }

    public String getCardAcceptorTermId() {
        return cardAcceptorTermId;
    }

    public String getCardAcceptorIdCode() {
        return cardAcceptorIdCode;
    }

    public String getCardAcceptorNameAndLoc() {
        return cardAcceptorNameAndLoc;
    }

    public String getTxnCurrencyCode() {
        return txnCurrencyCode;
    }

    public String getAccId1() {
        return accId1;
    }

    public String getReservedForPvtUse() {
        return reservedForPvtUse;
    }
}