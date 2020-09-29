package Operations;

import ATM.ATMBalanceEnquiryTxn;
import ATM.ATMFinancialTxn;
import ATM.ATMPinChangeTxn;
import ECOM.ECOMTxn;
import IBMB.IBMBBeneficiary;
import IBMB.IBMBTxn;
import POS.POSTxn;

import java.util.HashMap;

public class TxnBody {

    public static HashMap<String, Object> ATMFinancialTxnBody(ATMFinancialTxn atmFinancialTxn) {

        HashMap<String, Object> ATMFinTxnBody = new HashMap<String, Object>();
        ATMFinTxnBody.put("mti", atmFinancialTxn.getMti());
        ATMFinTxnBody.put("accountNumber", atmFinancialTxn.getAccountNumber());
        ATMFinTxnBody.put("processingCode", atmFinancialTxn.getProcessingCode());
        ATMFinTxnBody.put("txnAmount", atmFinancialTxn.getTxnAmount());
        ATMFinTxnBody.put("transmissionDateAndTime", atmFinancialTxn.getTransmissionDateAndTime());
        ATMFinTxnBody.put("txnId", atmFinancialTxn.getTxnId());
        ATMFinTxnBody.put("localTxnDateAndTime", atmFinancialTxn.getLocalTxnDateAndTime());
        ATMFinTxnBody.put("acqInstCountryCode", atmFinancialTxn.getAcqInstCountryCode());
        ATMFinTxnBody.put("posEntryMode", atmFinancialTxn.getPosEntryMode());
        ATMFinTxnBody.put("functionCode", atmFinancialTxn.getFunctionCode());
        ATMFinTxnBody.put("cardAcceptorBusinessCode", atmFinancialTxn.getCardAcceptorBusinessCode());
        ATMFinTxnBody.put("acqInstIdentCode", atmFinancialTxn.getAcqInstIdentCode());
        ATMFinTxnBody.put("retrievalRefNo", atmFinancialTxn.getRetrievalRefNo());
        ATMFinTxnBody.put("cardAcceptorTermId", atmFinancialTxn.getCardAcceptorTermId());
        ATMFinTxnBody.put("cardAcceptorIdCode", atmFinancialTxn.getCardAcceptorIdCode());
        ATMFinTxnBody.put("cardAcceptorNameAndLoc", atmFinancialTxn.getCardAcceptorNameAndLoc());
        ATMFinTxnBody.put("txnCurrencyCode", atmFinancialTxn.getTxnCurrencyCode());
        ATMFinTxnBody.put("accId1", atmFinancialTxn.getAccId1());
        ATMFinTxnBody.put("reservedForPvtUse", atmFinancialTxn.getReservedForPvtUse());

        return ATMFinTxnBody;
    }

    public static HashMap<String, Object> ATMBalanceEnquiryTxnBody(ATMBalanceEnquiryTxn atmBalanceEnquiryTxn) {

        HashMap<String, Object> ATMBalEnqTxnBody = new HashMap<String, Object>();
        ATMBalEnqTxnBody.put("mti", atmBalanceEnquiryTxn.getMti());
        ATMBalEnqTxnBody.put("accountNumber", atmBalanceEnquiryTxn.getAccountNumber());
        ATMBalEnqTxnBody.put("processingCode", atmBalanceEnquiryTxn.getProcessingCode());
        ATMBalEnqTxnBody.put("txnAmount", atmBalanceEnquiryTxn.getTxnAmount());
        ATMBalEnqTxnBody.put("transmissionDateAndTime", atmBalanceEnquiryTxn.getTransmissionDateAndTime());
        ATMBalEnqTxnBody.put("txnId", atmBalanceEnquiryTxn.getTxnId());
        ATMBalEnqTxnBody.put("localTxnDateAndTime", atmBalanceEnquiryTxn.getLocalTxnDateAndTime());
        ATMBalEnqTxnBody.put("acqInstCountryCode", atmBalanceEnquiryTxn.getAcqInstCountryCode());
        ATMBalEnqTxnBody.put("posEntryMode", atmBalanceEnquiryTxn.getPosEntryMode());
        ATMBalEnqTxnBody.put("functionCode", atmBalanceEnquiryTxn.getFunctionCode());
        ATMBalEnqTxnBody.put("cardAcceptorBusinessCode", atmBalanceEnquiryTxn.getCardAcceptorBusinessCode());
        ATMBalEnqTxnBody.put("acqInstIdentCode", atmBalanceEnquiryTxn.getAcqInstIdentCode());
        ATMBalEnqTxnBody.put("retrievalRefNo", atmBalanceEnquiryTxn.getRetrievalRefNo());
        ATMBalEnqTxnBody.put("cardAcceptorTermId", atmBalanceEnquiryTxn.getCardAcceptorTermId());
        ATMBalEnqTxnBody.put("cardAcceptorIdCode", atmBalanceEnquiryTxn.getCardAcceptorIdCode());
        ATMBalEnqTxnBody.put("cardAcceptorNameAndLoc", atmBalanceEnquiryTxn.getCardAcceptorNameAndLoc());
        ATMBalEnqTxnBody.put("txnCurrencyCode", atmBalanceEnquiryTxn.getTxnCurrencyCode());
        ATMBalEnqTxnBody.put("accId1", atmBalanceEnquiryTxn.getAccId1());
        ATMBalEnqTxnBody.put("reservedForPvtUse", atmBalanceEnquiryTxn.getReservedForPvtUse());

        return ATMBalEnqTxnBody;
    }

    public static HashMap<String, Object> ATMPinChangeTxnBody(ATMPinChangeTxn atmPinChangeTxn) {

        HashMap<String, Object> ATMPinCngTxnBody = new HashMap<String, Object>();
        ATMPinCngTxnBody.put("mti", atmPinChangeTxn.getMti());
        ATMPinCngTxnBody.put("accountNumber", atmPinChangeTxn.getAccountNumber());
        ATMPinCngTxnBody.put("processingCode", atmPinChangeTxn.getProcessingCode());
        ATMPinCngTxnBody.put("txnAmount", atmPinChangeTxn.getTxnAmount());
        ATMPinCngTxnBody.put("transmissionDateAndTime", atmPinChangeTxn.getTransmissionDateAndTime());
        ATMPinCngTxnBody.put("txnId", atmPinChangeTxn.getTxnId());
        ATMPinCngTxnBody.put("localTxnDateAndTime", atmPinChangeTxn.getLocalTxnDateAndTime());
        ATMPinCngTxnBody.put("acqInstCountryCode", atmPinChangeTxn.getAcqInstCountryCode());
        ATMPinCngTxnBody.put("posEntryMode", atmPinChangeTxn.getPosEntryMode());
        ATMPinCngTxnBody.put("functionCode", atmPinChangeTxn.getFunctionCode());
        ATMPinCngTxnBody.put("cardAcceptorBusinessCode", atmPinChangeTxn.getCardAcceptorBusinessCode());
        ATMPinCngTxnBody.put("acqInstIdentCode", atmPinChangeTxn.getAcqInstIdentCode());
        ATMPinCngTxnBody.put("retrievalRefNo", atmPinChangeTxn.getRetrievalRefNo());
        ATMPinCngTxnBody.put("responseCode", atmPinChangeTxn.getResponseCode());
        ATMPinCngTxnBody.put("cardAcceptorTermId", atmPinChangeTxn.getCardAcceptorTermId());
        ATMPinCngTxnBody.put("cardAcceptorIdCode", atmPinChangeTxn.getCardAcceptorIdCode());
        ATMPinCngTxnBody.put("cardAcceptorNameAndLoc", atmPinChangeTxn.getCardAcceptorNameAndLoc());
        ATMPinCngTxnBody.put("txnCurrencyCode", atmPinChangeTxn.getTxnCurrencyCode());
        ATMPinCngTxnBody.put("accId1", atmPinChangeTxn.getAccId1());
        ATMPinCngTxnBody.put("reservedForPvtUse", atmPinChangeTxn.getReservedForPvtUse());

        return ATMPinCngTxnBody;
    }

    public static HashMap<String, Object> POSPurchaseTxnBody(POSTxn posTxn) {

        HashMap<String, Object> POSTxnBody = new HashMap<String, Object>();
        POSTxnBody.put("mti", posTxn.getMti());
        POSTxnBody.put("accountNumber", posTxn.getAccountNumber());
        POSTxnBody.put("processingCode", posTxn.getProcessingCode());
        POSTxnBody.put("txnAmount", posTxn.getTxnAmount());
        POSTxnBody.put("transmissionDateAndTime", posTxn.getTransmissionDateAndTime());
        POSTxnBody.put("txnId", posTxn.getTxnId());
        POSTxnBody.put("localTxnDateAndTime", posTxn.getLocalTxnDateAndTime());
        POSTxnBody.put("acqInstCountryCode", posTxn.getAcqInstCountryCode());
        POSTxnBody.put("posEntryMode", posTxn.getPosEntryMode());
        POSTxnBody.put("functionCode", posTxn.getFunctionCode());
        POSTxnBody.put("cardAcceptorBusinessCode", posTxn.getCardAcceptorBusinessCode());
        POSTxnBody.put("acqInstIdentCode", posTxn.getAcqInstIdentCode());
        POSTxnBody.put("retrievalRefNo", posTxn.getRetrievalRefNo());
        POSTxnBody.put("cardAcceptorTermId", posTxn.getCardAcceptorTermId());
        POSTxnBody.put("cardAcceptorIdCode", posTxn.getCardAcceptorIdCode());
        POSTxnBody.put("cardAcceptorNameAndLoc", posTxn.getCardAcceptorNameAndLoc());
        POSTxnBody.put("txnCurrencyCode", posTxn.getTxnCurrencyCode());
        POSTxnBody.put("accId1", posTxn.getAccId1());
        POSTxnBody.put("reservedForPvtUse", posTxn.getReservedForPvtUse());

        return POSTxnBody;
    }

    public static HashMap<String, Object> ECOMPurchaseTxnBody(ECOMTxn ecomTxn) {

        HashMap<String, Object> ECOMTxnBody = new HashMap<String, Object>();
        ECOMTxnBody.put("mti", ecomTxn.getMti());
        ECOMTxnBody.put("accountNumber", ecomTxn.getAccountNumber());
        ECOMTxnBody.put("processingCode", ecomTxn.getProcessingCode());
        ECOMTxnBody.put("txnAmount", ecomTxn.getTxnAmount());
        ECOMTxnBody.put("transmissionDateAndTime", ecomTxn.getTransmissionDateAndTime());
        ECOMTxnBody.put("txnId", ecomTxn.getTxnId());
        ECOMTxnBody.put("localTxnDateAndTime", ecomTxn.getLocalTxnDateAndTime());
        ECOMTxnBody.put("acqInstCountryCode", ecomTxn.getAcqInstCountryCode());
        ECOMTxnBody.put("posEntryMode", ecomTxn.getPosEntryMode());
        ECOMTxnBody.put("functionCode", ecomTxn.getFunctionCode());
        ECOMTxnBody.put("cardAcceptorBusinessCode", ecomTxn.getCardAcceptorBusinessCode());
        ECOMTxnBody.put("acqInstIdentCode", ecomTxn.getAcqInstIdentCode());
        ECOMTxnBody.put("retrievalRefNo", ecomTxn.getRetrievalRefNo());
        ECOMTxnBody.put("cardAcceptorTermId", ecomTxn.getCardAcceptorTermId());
        ECOMTxnBody.put("cardAcceptorIdCode", ecomTxn.getCardAcceptorIdCode());
        ECOMTxnBody.put("cardAcceptorNameAndLoc", ecomTxn.getCardAcceptorNameAndLoc());
        ECOMTxnBody.put("txnCurrencyCode", ecomTxn.getTxnCurrencyCode());
        ECOMTxnBody.put("accId1", ecomTxn.getAccId1());
        ECOMTxnBody.put("reservedForPvtUse", ecomTxn.getReservedForPvtUse());

        return ECOMTxnBody;
    }

    public static HashMap<String, Object> IBMBTransactionBody(IBMBTxn ibmbTxn) {

        HashMap<String, Object> IBMBTxnBody = new HashMap<>();
        IBMBTxnBody.put("systemGeneratedTransactionId", ibmbTxn.getSystemGeneratedTransactionId());
        IBMBTxnBody.put("systemDate", ibmbTxn.getSystemDate());
        IBMBTxnBody.put("customerId", ibmbTxn.getCustomerId());
        IBMBTxnBody.put("debitBankAccountNumber", ibmbTxn.getDebitBankAccountNumber());
        IBMBTxnBody.put("debitAmount", ibmbTxn.getDebitAmount());
        IBMBTxnBody.put("loginTime", ibmbTxn.getLoginTime());
        IBMBTxnBody.put("beneficiaryName", ibmbTxn.getBeneficiaryName());
        IBMBTxnBody.put("beneficiaryMobileNumber", ibmbTxn.getBeneficiaryMobileNumber());
        IBMBTxnBody.put("inputCurrency", ibmbTxn.getInputCurrency());
        IBMBTxnBody.put("creditBankAccountNumber", ibmbTxn.getCreditBankAccountNumber());
        IBMBTxnBody.put("remarks", ibmbTxn.getRemarks());
        IBMBTxnBody.put("remmiterMobileNumber", ibmbTxn.getRemmiterMobileNumber());
        IBMBTxnBody.put("deviceIP", ibmbTxn.getDeviceIP());
        IBMBTxnBody.put("transactionMode", ibmbTxn.getTransactionMode());
        IBMBTxnBody.put("ifscCode", ibmbTxn.getIfscCode());
        IBMBTxnBody.put("transactionType", ibmbTxn.getTransactionType());
        IBMBTxnBody.put("beneficiaryEmailID", ibmbTxn.getBeneficiaryEmailID());
        IBMBTxnBody.put("latitude", ibmbTxn.getLatitude());
        IBMBTxnBody.put("longitude", ibmbTxn.getLongitude());
        IBMBTxnBody.put("transactionCurrency", ibmbTxn.getTransactionCurrency());
        IBMBTxnBody.put("beneficiaryBank", ibmbTxn.getBeneficiaryBank());
        IBMBTxnBody.put("creditCurrency", ibmbTxn.getCreditCurrency());
        IBMBTxnBody.put("beneficiaryMMID", ibmbTxn.getBeneficiaryMMID());
        IBMBTxnBody.put("accountTypeDescription", ibmbTxn.getAccountTypeDescription());
        IBMBTxnBody.put("channelId", ibmbTxn.getChannelId());

        return IBMBTxnBody;
    }

    public static HashMap<String, Object> BeneficiaryTransactionBody(IBMBBeneficiary ibmbBeneficiary) {

        HashMap<String,Object> IBMBBeneficiaryTxnBody = new HashMap<>();
        IBMBBeneficiaryTxnBody.put("loginTime", ibmbBeneficiary.getLoginTime());
        IBMBBeneficiaryTxnBody.put("deviceIP", ibmbBeneficiary.getDeviceIP());
        IBMBBeneficiaryTxnBody.put("customerId", ibmbBeneficiary.getCustomerId());
        IBMBBeneficiaryTxnBody.put("transactionMode", ibmbBeneficiary.getTransactionMode());
        IBMBBeneficiaryTxnBody.put("systemDate", ibmbBeneficiary.getSystemDate());
        IBMBBeneficiaryTxnBody.put("latitude", ibmbBeneficiary.getLatitude());
        IBMBBeneficiaryTxnBody.put("longitude", ibmbBeneficiary.getLongitude());
        IBMBBeneficiaryTxnBody.put("transactionCurrency", ibmbBeneficiary.getTransactionCurrency());
        IBMBBeneficiaryTxnBody.put("systemGeneratedTransactionId", ibmbBeneficiary.getSystemGeneratedTransactionId());
        IBMBBeneficiaryTxnBody.put("customerId", ibmbBeneficiary.getCustomerId());
        IBMBBeneficiaryTxnBody.put("channelId", ibmbBeneficiary.getChannelId());
        IBMBBeneficiaryTxnBody.put("accountType", ibmbBeneficiary.getAccountType());
        IBMBBeneficiaryTxnBody.put("beneficiaryAccount", ibmbBeneficiary.getBeneficiaryAccount());
        IBMBBeneficiaryTxnBody.put("ifscCode", ibmbBeneficiary.getIfscCode());
        IBMBBeneficiaryTxnBody.put("bankName", ibmbBeneficiary.getBankName());
        IBMBBeneficiaryTxnBody.put("branchName", ibmbBeneficiary.getBranchName());
        IBMBBeneficiaryTxnBody.put("beneficiaryName", ibmbBeneficiary.getBeneficiaryName());
        IBMBBeneficiaryTxnBody.put("beneficiaryNickname", ibmbBeneficiary.getBeneficiaryNickname());
        IBMBBeneficiaryTxnBody.put("beneficiaryMobileNumber", ibmbBeneficiary.getBeneficiaryMobileNumber());
        IBMBBeneficiaryTxnBody.put("beneficiaryMMID", ibmbBeneficiary.getBeneficiaryMMID());
        IBMBBeneficiaryTxnBody.put("newBeneficiaryAccount", ibmbBeneficiary.getNewBeneficiaryAccount());
        IBMBBeneficiaryTxnBody.put("newifscCode", ibmbBeneficiary.getNewifscCode());
        IBMBBeneficiaryTxnBody.put("newBeneficiaryName", ibmbBeneficiary.getNewBeneficiaryName());
        IBMBBeneficiaryTxnBody.put("newAccountType", ibmbBeneficiary.getNewAccountType());
        IBMBBeneficiaryTxnBody.put("newBeneficiaryMobile", ibmbBeneficiary.getNewBeneficiaryMobile());
        IBMBBeneficiaryTxnBody.put("newBeneficiaryMMID", ibmbBeneficiary.getNewBeneficiaryMMID());

        return IBMBBeneficiaryTxnBody;
    }
}
