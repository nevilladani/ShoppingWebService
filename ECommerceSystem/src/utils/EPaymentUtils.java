package utils;

public class EPaymentUtils {
	
	public static String buildHmac(String p0_Cmd,String p1_MerId,
			String p2_Order, String p3_Amt, String p4_Cur,String p5_Pid, String p6_Pcat,
			String p7_Pdesc,String p8_Url, String p9_SAF,String pa_MP,String pd_FrpId,
			String pr_NeedResponse,String keyValue) {
		
		StringBuffer sValue = new StringBuffer();
		
		sValue.append(p0_Cmd);
		sValue.append(p1_MerId);		
		sValue.append(p2_Order);
		sValue.append(p3_Amt);	
		sValue.append(p4_Cur);		
		sValue.append(p5_Pid);	
		sValue.append(p6_Pcat);		
		sValue.append(p7_Pdesc);
		sValue.append(p8_Url);		
		sValue.append(p9_SAF);
		sValue.append(pa_MP);
		sValue.append(pd_FrpId);
		sValue.append(pr_NeedResponse);
		
		String sNewString = DigestUtil.hmacSign(sValue.toString(), keyValue);
		return sNewString;
	}
	
	public static boolean verifyCallback(String hmac, String p1_MerId,
			String r0_Cmd, String r1_Code, String r2_TrxId, String r3_Amt,
			String r4_Cur, String r5_Pid, String r6_Order, String r7_Uid,
			String r8_MP, String r9_BType, String keyValue) {
		
		StringBuffer sValue = new StringBuffer();
		
		sValue.append(p1_MerId);	
		sValue.append(r0_Cmd);	
		sValue.append(r1_Code);	
		sValue.append(r2_TrxId);		
		sValue.append(r3_Amt);		
		sValue.append(r4_Cur);	
		sValue.append(r5_Pid);	
		sValue.append(r6_Order);	
		sValue.append(r7_Uid);	
		sValue.append(r8_MP);
		sValue.append(r9_BType);
		String sNewString = DigestUtil.hmacSign(sValue.toString(), keyValue);

		if (hmac.equals(sNewString)) {
			return true;
		}
		return false;
	}
}
