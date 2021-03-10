package demo;

public class Jiexi {
 
	public static void main(String[] args) {
		String filterUrlStr = ".*(getVarCode|login|automaticLogin|registerMiniUser|getOpenId|imgs|html|Controller|img|css).*";
		String a = "https://weixin.bocinsjs.com/bocinsjs-wechat/api/sett/findDetail?id=6011";
		String b = "https://weixin.bocinsjs.com/bocinsjs-wechat/api/register/getUserDetail?id=211";
		System.out.println(a.indexOf("getUserDetail")>-1 || !a.matches(filterUrlStr));
	}
}
