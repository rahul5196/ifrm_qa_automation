package Operations;

public class RuleOperations {

    public static String atmActivateRule (String ruleId) {
        return "https://13.126.40.171/api/v1/ifrm/atm/ruleengine/rule/" + ruleId + "/activate";
    }

    public static String atmRuleEnable (String ruleId) {
        return "https://13.126.40.171/api/v1/ifrm/atm/ruleengine/rule/" + ruleId + "/enable";
    }

    public static String atmRuleExplicit (String ruleId) {
        return "https://13.126.40.171/api/v1/ifrm/atm/ruleengine/rule/" + ruleId + "/explicit";
    }

   /* public static String atmActivateRule (String ruleId) {
        return "https://13.126.40.171/api/v1/ifrm/atm/ruleengine/rule/" + ruleId + "/activate";
    }

    public static String atmRuleEnable (String ruleId) {
        return "https://13.126.40.171/api/v1/ifrm/atm/ruleengine/rule/" + ruleId + "/enable";
    }

    public static String atmRuleExplicit (String ruleId) {
        return "https://13.126.40.171/api/v1/ifrm/atm/ruleengine/rule/" + ruleId + "/explicit";
    }*/

    public static String posActivateRule (String ruleId) {
       return "https://13.126.40.171/api/v1/ifrm/pos/ruleengine/rule/" + ruleId + "/activate";
    }

    public static String posRuleEnable (String ruleId) {
        return "https://13.126.40.171/api/v1/ifrm/pos/ruleengine/rule/" + ruleId + "/enable";
    }

    public static String posRuleExplicit (String ruleId) {
        return "https://13.126.40.171/api/v1/ifrm/pos/ruleengine/rule/" + ruleId + "/explicit";
    }

    public static String ecomActivateRule (String ruleId) {
        return "https://13.126.40.171/api/v1/ifrm/ecom/ruleengine/rule/" + ruleId + "/activate";
    }

    public static String ecomRuleEnable (String ruleId) {
        return "https://13.126.40.171/api/v1/ifrm/ecom/ruleengine/rule/" + ruleId + "/enable";
    }

    public static String ecomRuleExplicit (String ruleId) {
        return "https://13.126.40.171/api/v1/ifrm/ecom/ruleengine/rule/" + ruleId + "/explicit";
    }
}
